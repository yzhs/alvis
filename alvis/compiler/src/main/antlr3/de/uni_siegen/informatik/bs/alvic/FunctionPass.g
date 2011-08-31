tree grammar FunctionPass;

options {
     output       = AST;
     superClass   = AbstractTreeParser;
     tokenVocab   = TParser;
     ASTLabelType = TypedTree;
}

@header {
package de.uni_siegen.informatik.bs.alvic;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
}


@members {
	private Type Void = SimpleType.create("Void");

    private Map<String,Type> functions = new HashMap<String,Type>();
}

// Tell the compiler what functions there are, so the type checker can handle mutual recursion
program
    : ^(PROG functionDefinition* mainFunction {Compiler.getInstance().setFunctions(functions);})
    ;

functionDefinition
@init { Type ret = Void; }
    : ^(FUNC ID ^(RET type? { ret = $type.t; }) ^(PARAMS p=formalParams?) {
        checkAndPut(functions, $ID.text, FunctionType.create(null != $p.t ? $p.t : new ArrayList<Type>(), ret), $functionDefinition.tree);
    } statement)
    ;

mainFunction
    : ^(FUNC MAIN ^(PARAMS p=formalParams?) {
        checkAndPut(functions, "main", FunctionType.create(null != $p.t ? $p.t : new ArrayList<Type>(), Void), $mainFunction.tree);
    } statement)
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
    : ^(DECL type ID) {$t = $type.t;}
    ;

type returns [Type t]
    : TYPE                                   { $t = SimpleType.create($TYPE.text); }
    | ^(ARRAY base=type)                     { $t = ArrayType.create($base.t); }
    | ^(COMPLEX container=type element=type) { $t = SimpleType.create($container.t.toString(), $element.t);}
    ;

statement
options { backtrack = true; }
    : declaration
    | expr
    | assignment
    | ^(RETURN expr?)
    | ^(IF_ELSE expr ^(STAT statement SEMICOLON?) ^(STAT statement SEMICOLON?))
    | ^(IF expr ^(STAT statement statement?))
    | ^(FOR param expr statement)
    | ^(WHILE expr statement)
    | ^(BLOCK statement*)
    | SEMICOLON
    ;

declaration
    : ^(DECL type ID)
    | ^(DECL_INIT type ID expr)
    ;

assignment : ^(ASSIGN postfixExpr expr) ;

binop : PLUS | MINUS | STAR | SLASH | PERCENT | AMPAMP | PIPEPIPE | EQEQ | BANGEQ | LESS | GREATER | LESSEQ | GREATEREQ ;

expr: ^(binop expr expr)
    | ^(BANG expr)
    | ^(PAREN expr)
    | ^(SIGN (PLUS expr | MINUS expr))
    | postfixExpr
    | BOOL
    | FLOAT
    | INT
    | STRING
    | NULL
    | INFTY
    ;


postfixExpr
    : left=ID
    | ^(DOT obj=postfixExpr ID)
    | ^(CALL function=postfixExpr expr*)
    | ^(INDEX array=postfixExpr expr)
    ;
