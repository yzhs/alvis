tree grammar CodeGenerator;

options {
    tokenVocab   = TypeChecker;
    output       = template;
    k            = 0;
    ASTLabelType = TypedTree;
}

// What package should the generated source exist in?
@header {
package de.uni_siegen.informatik.bs.alvic;
}

@members {
	private String translate(String type) {
		return "PC" + type;
	}
	private String capitalize(String ident) {
		return ident.substring(0,1).toUpperCase() + ident.substring(1);
	}
}

prog: ^(PROG (f+=function)+) -> program(functions={$f})
    ;

function options {k = 3;}
// k=3 is needed to distinguish between the main function and other functions
// in a readable way.
@init { String ret = "void"; }
    : ^(FUNC MAIN ^(PARAMS attributes) s=statement)
            -> mainFunction(params={$attributes.params}, idents={$attributes.idents}, types={$attributes.types}, code={$s.st})
    | ^(FUNC ident ^(TYPE (type {ret=$type.st.toString();})?) ^(PARAMS (p+=param)*) s=statement)
            -> function(name={$ident.st}, type={ret}, params={$p}, code={$s.st})
    ;

ident
    : ID -> ident(name={$ID.text})
    ;

type: TYPE -> type(name={translate($TYPE.text)})
    | ^(ARRAY base=type) -> array(base={$base.st}) // This means this is an array with elements of type 'base'
    | ^(COMPLEX container=type element=type) -> generic(container={$container.st}, element={$element.st})
        // This is used for specifying generic parameters, such as the types of elements in container classes.
    ;

param
    : ^(DECL type ident) -> param(type={$type.st}, ident={$ident.st})
    ;

attributes returns [List params, List idents, List types]
@init { $params = new ArrayList(); $idents = new ArrayList(); $types = new ArrayList(); }
    : (^(DECL type ident {$idents.add($ident.st); $params.add(%param(type={$type.st}, ident={$ident.st})); $types.add($type.st); } ))*
    ;

statement options {k = 3;}
// k=3 is needed to distinguish between assignments to local variables,
// attributes and array elements.
    : expr                         -> semicolon(stat={$expr.st})
    | ^(DECL type ident)           -> decl(type={$type.st}, ident={$ident.st})
    | ^(DECL_INIT type ident expr) -> declInit(type={$type.st}, ident={$ident.st}, rhs={$expr.st})
    | ^(ASSIGN ident expr)         -> assign(lhs={$ident.st}, rhs={$expr.st})
    | ^(ASSIGN ^(DOT postfixExpr[true, false] ident) expr)
        -> attributeAssign(obj={$postfixExpr.st}, lhs={capitalize($ident.st.toString())}, rhs={$expr.st})
    | ^(ASSIGN ^(INDEX postfixExpr[true, false] i=expr) rhs=expr)
        -> arrayAssign(lhs={%index(array={$postfixExpr.st}, index={$i.st})}, rhs={$rhs.st})
    | ^(RETURN expr)               -> return(expr={$expr.st})
    | RETURN                       -> return()
    | SEMICOLON                    -> breakpoint(lineNumber={$SEMICOLON.line})
    | ^(BLOCK (s+=statement)*)     -> block(statements={$s})
    | ^(IF expr block=ifStatementHelper) -> if(cond={$expr.st}, then={$block.st})
    | ^(IF_ELSE expr s1=ifStatementHelper s2=ifStatementHelper) -> ifElse(cond={$expr.st}, then={$s1.st}, otherwise={$s2.st}) //'else' does not work as a template parameter
    | ^(FOR lhs=param rhs=expr body=statement) -> for(lhs={$lhs.st}, line={$rhs.start.getLine()}, obj={$rhs.obj}, type={$rhs.start.getVarType().getJavaType()}, rhs={$rhs.st}, body={$body.st})
    | ^(WHILE expr body=statement)             -> while(cond={$expr.st}, body={$body.st})
    ;

/**
 * This rule is used to handle if statements such as
 *   if condition:
 *       foo();
 * which has to be translated to something like
 *   if (condition) {
 *       foo();
 *       insertBreakPoint(lineNumber);
 *   }
 * STAT is used to group those two statements ('foo()' and ';') together.
 */
ifStatementHelper
    : (^(STAT statement))=> ^(STAT statement) -> {$statement.st}
    | ^(STAT statement SEMICOLON) -> breakBlock(stat={$statement.st}, lineNumber={$SEMICOLON.line})
    ;

expr returns [String obj]
@init { $obj = ""; }
    : ^(PLUS      a=expr b=expr) -> add(left={$a.st}, right={$b.st})
    | ^(MINUS     a=expr b=expr) -> sub(left={$a.st}, right={$b.st})
    | ^(STAR      a=expr b=expr) -> mul(left={$a.st}, right={$b.st})
    | ^(SLASH     a=expr b=expr) -> div(left={$a.st}, right={$b.st})
    | ^(PERCENT   a=expr b=expr) -> mod(left={$a.st}, right={$b.st})
    | ^(AMPAMP    a=expr b=expr) -> and(left={$a.st}, right={$b.st})
    | ^(PIPEPIPE  a=expr b=expr) -> or(left={$a.st}, right={$b.st})
    | ^(EQEQ      a=expr b=expr) -> equal(left={$a.st}, right={$b.st})
    | ^(BANGEQ    a=expr b=expr) -> notEqual(left={$a.st}, right={$b.st})
    | ^(LESS      a=expr b=expr) -> lessThan(left={$a.st}, right={$b.st})
    | ^(GREATER   a=expr b=expr) -> greaterThan(left={$a.st}, right={$b.st})
    | ^(LESSEQ    a=expr b=expr) -> lessOrEqual(left={$a.st}, right={$b.st})
    | ^(GREATEREQ a=expr b=expr) -> greaterOrEqual(left={$a.st}, right={$b.st})
    | ^(BANG arg=expr)  -> not(arg={$arg.st})
    | ^(PAREN arg=expr) -> paren(arg={$arg.st})
    | ^(SIGN (PLUS  arg=expr -> plus(arg={$arg.st})
             |MINUS arg=expr -> minus(arg={$arg.st})
             ))
    | postfixExpr[true, false] {$obj = $postfixExpr.obj;} -> {$postfixExpr.st}
    | BOOL   -> boolean(literal={$BOOL.text})
    | FLOAT  -> float(literal={$FLOAT.text})
    | INT    -> int(literal={$INT.text})
    | STRING -> string(literal={$STRING.text})
    | NULL   -> null(type={"PC"+$NULL.getVarType()})
    | INFTY  -> infty(type={"PC"+$INFTY.getVarType()})
    ;

postfixExpr[boolean local, boolean isMethodCall] returns [String obj]
    : ident {$obj = $ident.st.toString();} -> {local || isMethodCall ? $ident.st : %makeGetter(ident={capitalize($ident.st.toString())})}
    | ^(CALL func=postfixExpr[false, true] (args+=expr)*) {$obj = $func.obj;}  -> call(function={$func.st}, args={$args})
    | ^(DOT l=postfixExpr[local, isMethodCall] r=postfixExpr[false, isMethodCall]) {$obj = $l.obj;} -> dot(left={$l.st}, right={$r.st})
    | ^(INDEX array=postfixExpr[local, isMethodCall] expr)          {$obj = $array.obj;} -> index(array={$array.st}, index={$expr.st})
    ;
