tree grammar TypeChecker;

options {
     output       = AST;
     superClass   = AbstractTypeChecker;
     tokenVocab   = TParser;
     ASTLabelType = TypedTree;
}

// This is used to handle the scope of all identifiers. There is one level for
// the whole program containing all function definitions encountered so far and
// one for every layer of blocks we are currently in.
scope Symbols {
    Map<String,Type> symbols;
}


@header {
package de.uni_siegen.informatik.bs.alvic;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
}


@members {
	/**
	 * Some shortcuts for commonly used types
	 */
	private Type integer  = SimpleType.create("Integer");
	private Type bool     = SimpleType.create("Boolean");
	private Type floating = SimpleType.create("Float");
	private Type Void     = SimpleType.create("Void");
	private Type str      = SimpleType.create("String");
	private Type any      = SimpleType.wildcard;
	private Type Array    = ArrayType.wildcard;
	private Type Function = FunctionType.wildcard;

	/**
	 * This variable is used to keep track about which function we are currently
	 * in. Using this we can decide whether there should be parameter for a
	 * return statement, and if yes which type it is supposed to have.
	 */
	private String currentFunction = null;

	/**
	 * Get the type of a symbol from the symbol table if it is valid in the current
	 * scope.
	 *
	 * @param id	The symbol's name
	 * @return	The type the symbol has, or 'null' if it is not defined in the
	 *		current scope
	 */
	protected Type getTypeByName(String id) {
		for (int i = $Symbols.size()-1; i >= 0; i--)
			if ($Symbols[i]::symbols.containsKey(id))
				return $Symbols[i]::symbols.get(id);
		return null;
	}
}

program
scope Symbols;
@init {
    $Symbols::symbols = new HashMap<String,Type>();
    List<Type> args = new ArrayList<Type>();
    args.add(any);
    $Symbols::symbols.put("print", FunctionType.create(args, Void)); // TODO handle built-in functions more flexibly
}
    : ^(PROG functionDefinition* mainFunction)
    ;

functionDefinition
@init { Type ret = Void; }
    : ^(FUNC ident ^(TYPE type? { ret = $type.t; }) ^(PARAMS p=formalParams?) {
        $Symbols::symbols.put($ident.text, FunctionType.create(null != $p.t ? $p.t : new ArrayList<Type>(), ret));
        currentFunction = $ident.text;
    } block { currentFunction = null; })
    ;

mainFunction
    : ^(FUNC MAIN ^(PARAMS formalParams?) {
        $Symbols::symbols.put("main", FunctionType.create(new ArrayList<Type>(), Void));
        currentFunction = "main";
    }
    block { currentFunction = null; })
    ;

/**
 * Return a list of types of the paramaters a function takes.
 */
formalParams returns [List<Type> t]
@init {$t = new ArrayList<Type>();}
    : (param {$t.add($param.t);})+
    ;

/**
 * Return what type a single parameter was declared as.
 */
param returns [Type t]
    : ^(DECL type ident) {
        $t = $type.t;
        $Symbols::symbols.put($ident.text, $t);
    }
    ;

block
scope Symbols;
@init {
    $Symbols::symbols = new HashMap<String,Type>();
}
    : ^(BLOCK statement*)
    ;

type returns [Type t]
    : ID                                     { $t = SimpleType.create($ID.text); }
    | ^(ARRAY base=type)                     { $t = ArrayType.create($base.t); }
    | ^(COMPLEX container=type element=type) { $t = SimpleType.create($container.t.toString(), $element.t);}
    ;

ident returns [Type t]
    : ID { $t = getTypeByName($ID.text); }
    ;

statement
options { backtrack = true; }
    : declaration
    | expr[any]
    | assignment
    | ^(RETURN expr[((FunctionType)getTypeByName(currentFunction)).getReturnType()]?) {
      Type tmp = ((FunctionType)getTypeByName(currentFunction)).getReturnType();
      if (tmp.equals(Void) && $expr.text != null)
          reportError(new InvalidReturnException(tmp, $expr.t, currentFunction,
              $expr.tree.toString(), $expr.start.getLine(),
              $expr.start.getCharPositionInLine()));
      else if (!tmp.equals(Void) && $expr.text == null)
          reportError(new InvalidReturnException(tmp, null, currentFunction,
          null, $RETURN.getLine(), $RETURN.getCharPositionInLine()));
    }
    | ^(IF_ELSE expr[bool] ^(STAT statement terminator?) ^(STAT statement terminator?))
    | ^(IF expr[bool] ^(STAT statement statement?))
    | ^(FOR param expr[ArrayType.create($param.t)] statement)
    | ^(WHILE expr[bool] statement)
    | block
    | terminator
    ;

declaration returns [Type t]
    : ^(DECL type ident)                    { $Symbols::symbols.put($ident.text, $type.t); $t = $type.t; }
    | ^(DECL_INIT type ident expr[$type.t]) { $Symbols::symbols.put($ident.text, $type.t); $t = $type.t; }
    ;

assignment
    : ^(ASSIGN postfixExpr[any] expr[$postfixExpr.t])
    ;

expr[Type expected] returns [Type t]
@init { Type e = $expected; }
    : ^(PLUS       left=expr[e] right=expr[e]) { 
        $t = returnType("add", $left.t, $right.t, $text, $start);
        checkTypes(e, $t, $text, $start);
        $PLUS.tree.setVarType($t);
    }
    | ^(MINUS      left=expr[e] right=expr[e]) {
        $t = returnType("sub", $left.t, $right.t, $text, $start);
        checkTypes(e, $t, $text, $start);
        $MINUS.tree.setVarType($t);
    }
    | ^(STAR       left=expr[e] right=expr[e]) {
        $t = returnType("mul", $left.t, $right.t, $text, $start);
        checkTypes(e, $t, $text, $start);
        $STAR.tree.setVarType($t);
    }
    | ^(SLASH      left=expr[e] right=expr[e]) {
        $t = returnType("div", $left.t, $right.t, $text, $start);
        checkTypes(e, $t, $text, $start);
        $SLASH.tree.setVarType($t);
    }
    | ^(PERCENT    left=expr[e] right=expr[e]) {
        $t = returnType("mod", $left.t, $right.t, $text, $start);
        checkTypes(e, $t, $text, $start);
        $PERCENT.tree.setVarType($t);
    }
    | ^(AMPAMP     left=expr[e] right=expr[e]) {
        $t = returnType("and", $left.t, $right.t, $text, $start);
        checkTypes(e, $t, $text, $start);
        $AMPAMP.tree.setVarType($t);
    }
    | ^(PIPEPIPE   left=expr[e] right=expr[e]) {
        $t = returnType("or", $left.t, $right.t, $text, $start);
        checkTypes(e, $t, $text, $start);
        $PIPEPIPE.tree.setVarType($t);
    }
    | ^(EQEQ       left=expr[any] right=expr[any]) {
        $t = returnType("equal", $left.t, $right.t, $text, $start);
        checkTypes(e, $t, $text, $start);
        $EQEQ.tree.setVarType($t);
    }
    | ^(BANGEQ     left=expr[any] right=expr[any]) {
        $t = returnType("notEqual", $left.t, $right.t, $text, $start);
        checkTypes(e, $t, $text, $start);
        $BANGEQ.tree.setVarType($t);
    }
    | ^(LESS       left=expr[any] right=expr[any]) {
        $t = returnType("less", $left.t, $right.t, $text, $start);
        checkTypes(e, $t, $text, $start);
        $LESS.tree.setVarType($t);
    }
    | ^(GREATER    left=expr[any] right=expr[any]) {
        $t = returnType("greater", $left.t, $right.t, $text, $start);
        checkTypes(e, $t, $text, $start);
        $GREATER.tree.setVarType($t);
    }
    | ^(LESSEQ     left=expr[any] right=expr[any]) {
        $t = returnType("lessOrEqual", $left.t, $right.t, $text, $start);
        checkTypes(e, $t, $text, $start);
        $LESSEQ.tree.setVarType($t);
    }
    | ^(GREATEREQ  left=expr[any] right=expr[any]) {
        $t = returnType("greaterOrEqual", $left.t, $right.t, $text, $start);
        checkTypes(e, $t, $text, $start);
        $GREATEREQ.tree.setVarType($t);
    }
    | ^(BANG arg=expr[any]) {
        $t = returnType("not", $arg.t, $text, $start);
        checkTypes(e, $t, $text, $start);
        $BANG.tree.setVarType($t);
    }
    | ^(PAREN arg=expr[e]) { $t = $arg.t; $PAREN.tree.setVarType($t); }
    | ^(SIGN (PLUS arg=expr[e]
             |MINUS arg=expr[e]
             )) { $t = $arg.t; checkTypes(e, $t, $text, $start); $SIGN.tree.setVarType($t); } //TODO handle negate methods that change the type
    | postfixExpr[$expected] { $t=$postfixExpr.t; $postfixExpr.tree.setVarType($t); }
    | BOOL   { $t = bool;     checkTypes($expected, $t,   $BOOL.text,   $BOOL);   $BOOL.tree.setVarType($t); }
    | FLOAT  { $t = floating; checkTypes($expected, $t,  $FLOAT.text,  $FLOAT);  $FLOAT.tree.setVarType($t); }
    | INT    { $t = integer;  checkTypes($expected, $t,    $INT.text,    $INT);    $INT.tree.setVarType($t); }
    | STRING { $t = str;      checkTypes($expected, $t, $STRING.text, $STRING); $STRING.tree.setVarType($t); }
    | NULL   { $t = $expected; $NULL.tree.setVarType($expected);  }
    | INFTY  { $t = $expected; $INFTY.tree.setVarType($expected); }
    ;


postfixExpr[Type expected] returns [boolean isFunctionCall, Type t]
@init { List<Type> args = new ArrayList<Type>(); $t = any; }
    : left=ident {
        if (!isDefined($left.text)) {
            $t = SimpleType.create("# NoSuchIdentifier #");
            reportError(new UnknownIdentifierException($left.text, $left.start.getLine(), $left.start.getCharPositionInLine()));
        } else
            $t = $left.t;
        $ident.tree.setVarType($t);
    }
    | ^(DOT obj=postfixExpr[any] ident) {
        $t = checkMember($obj.t, $ident.text, $expected, $ident.start);
        $isFunctionCall = false;
        $DOT.tree.setVarType($t);
    }
    | ^(CALL function=postfixExpr[Function] (expr[any] {args.add($expr.t);})*) {
        $isFunctionCall = true;
        if (!($function.t instanceof FunctionType)) {
            notAFunction($function.text, $function.t, $function.start);
            $t = SimpleType.create("# NotAFunction #");
        } else {
            $t = ((FunctionType)$function.t).getReturnType();
            checkTypes($expected, $t, $function.tree.toString(), $function.start);
            checkArgs($function.tree.toString(), $function.t, args, $function.start);
        }
        $CALL.tree.setVarType($t);
    }
    | ^(INDEX array=postfixExpr[Array] expr[any]) {
        $isFunctionCall = false;
        if (!($array.t instanceof ArrayType)) {
            notAnArray($array.text, $array.t, $array.start);
            $t = SimpleType.create("# NotAnArray #");
        } else {
            $t = ((ArrayType)$array.t).getTypeArgument();
            checkTypes($expected, $t, $array.text, $array.start);
        }
        $INDEX.tree.setVarType($t);
    }
    ;


terminator
    : SEMICOLON
    ;
