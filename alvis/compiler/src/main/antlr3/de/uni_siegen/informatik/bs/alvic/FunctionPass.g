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
	/**
	 * Some shortcuts for commonly used types
	 */
	private Type Void = SimpleType.create("Void");

    private Map<String,Type> functions = new HashMap<String,Type>();
}

program
    : ^(PROG functionDefinition* mainFunction {Compiler.getInstance().setFunctions(functions);})
    ;

functionDefinition
@init { Type ret = Void; }
    : ^(FUNC ident ^(RET type? { ret = $type.t; }) ^(PARAMS p=formalParams?) {
        functions.put($ident.text, FunctionType.create(null != $p.t ? $p.t : new ArrayList<Type>(), ret));
    } block)
    ;

mainFunction
    : ^(FUNC MAIN ^(PARAMS formalParams?) {
        functions.put("main", FunctionType.create(new ArrayList<Type>(), Void));
    } block)
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
    : ^(DECL type ident) {$t = $type.t;}
    ;

block
    : ^(BLOCK statement*)
    ;

type returns [Type t]
    : TYPE                                   { $t = SimpleType.create($TYPE.text); }
    | ^(ARRAY base=type)                     { $t = ArrayType.create($base.t); }
    | ^(COMPLEX container=type element=type) { $t = SimpleType.create($container.t.toString(), $element.t);}
    ;

ident : ID ;

statement
options { backtrack = true; }
    : declaration
    | expr
    | assignment
    | ^(RETURN expr?)
    | ^(IF_ELSE expr ^(STAT statement terminator?) ^(STAT statement terminator?))
    | ^(IF expr ^(STAT statement statement?))
    | ^(FOR param expr statement)
    | ^(WHILE expr statement)
    | block
    | terminator
    ;

declaration
    : ^(DECL type ident)
    | ^(DECL_INIT type ident expr)
    ;

assignment : ^(ASSIGN postfixExpr expr) ;

expr
    : ^(PLUS      expr expr)
    | ^(MINUS     expr expr)
    | ^(STAR      expr expr)
    | ^(SLASH     expr expr)
    | ^(PERCENT   expr expr)
    | ^(AMPAMP    expr expr) 
    | ^(PIPEPIPE  expr expr) 
    | ^(EQEQ      expr expr)
    | ^(BANGEQ    expr expr)
    | ^(LESS      expr expr)
    | ^(GREATER   expr expr)
    | ^(LESSEQ    expr expr)
    | ^(GREATEREQ expr expr)
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
    : left=ident
    | ^(DOT obj=postfixExpr ident)
    | ^(CALL function=postfixExpr expr*)
    | ^(INDEX array=postfixExpr expr) 
    ;


terminator: SEMICOLON ;
