/*
 * Copyright (c) 2011 Colin Benner
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the
 * Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
tree grammar TypeChecker;

options {
     output       = AST;
     superClass   = AbstractTypeChecker;
     tokenVocab   = FunctionPass;
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
    $Symbols::symbols = Compiler.getInstance().getFunctions();
}
    : ^(PROG functionDefinition* mainFunction)
    ;

functionDefinition
    : ^(FUNC ident ^(RET type?) ^(PARAMS p=formalParams?) { currentFunction = $ident.text; } block { currentFunction = null; })
    ;

mainFunction
    : ^(FUNC MAIN ^(PARAMS formalParams?) { currentFunction = "main"; } block { currentFunction = null; })
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
        checkAndPut($Symbols::symbols, $ident.text, $t, $param.tree);
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
    : TYPE                                   { $t = SimpleType.create($TYPE.text); }
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
    | ^(RETURN expr[any/*((FunctionType)getTypeByName(currentFunction)).getReturnType()*/]?) {
      Type tmp = ((FunctionType)getTypeByName(currentFunction)).getReturnType();
      if (tmp.equals(Void) && $expr.text != null)
          reportError(new InvalidReturnException(tmp, $expr.t, currentFunction,
              $expr.tree.treeToString(parser), $expr.tree));
      else if (!tmp.equals(Void) && $expr.text == null){
          reportError(new InvalidReturnException(tmp, null, currentFunction,
          null, $RETURN));}
      else if ($expr.tree != null && !tmp.equals($expr.t))
          reportError(new InvalidReturnException(tmp, $expr.t, currentFunction,
              $expr.tree.treeToString(parser), $expr.tree));
    }
    | ^(IF_ELSE expr[bool] ^(STAT statement terminator?) ^(STAT statement terminator?))
    | ^(IF expr[bool] ^(STAT statement statement?))
    | ^(FOR param expr[ArrayType.create($param.t)] statement)
    | ^(WHILE expr[bool] statement)
    | block
    | terminator
    ;

declaration returns [Type t]
    : ^(DECL type ident)                    { checkAndPut($Symbols::symbols, $ident.text, $type.t, $declaration.tree); $t = $type.t; }
    | ^(DECL_INIT type ident expr[$type.t]) { checkAndPut($Symbols::symbols, $ident.text, $type.t, $declaration.tree); $t = $type.t; }
    ;

assignment
    : ^(ASSIGN postfixExpr[any] expr[$postfixExpr.t])
    ;

expr[Type expected] returns [Type t]
@init { Type e = $expected; }
    : ^(PLUS       left=expr[e] right=expr[e]) { 
        $t = returnType("add", $left.t, $right.t, $PLUS.tree);
        checkTypes(e, $t, $text, $PLUS.tree);
        $PLUS.tree.setVarType($t);
    }
    | ^(MINUS      left=expr[e] right=expr[e]) {
        $t = returnType("sub", $left.t, $right.t, $MINUS.tree);
        checkTypes(e, $t, $text, $MINUS.tree);
        $MINUS.tree.setVarType($t);
    }
    | ^(STAR       left=expr[e] right=expr[e]) {
        $t = returnType("mul", $left.t, $right.t, $STAR.tree);
        checkTypes(e, $t, $text, $STAR.tree);
        $STAR.tree.setVarType($t);
    }
    | ^(SLASH      left=expr[e] right=expr[e]) {
        $t = returnType("div", $left.t, $right.t, $SLASH.tree);
        checkTypes(e, $t, $text, $SLASH.tree);
        $SLASH.tree.setVarType($t);
    }
    | ^(PERCENT    left=expr[e] right=expr[e]) {
        $t = returnType("mod", $left.t, $right.t, $PERCENT.tree);
        checkTypes(e, $t, $text, $PERCENT.tree);
        $PERCENT.tree.setVarType($t);
    }
    | ^(AMPAMP     left=expr[e] right=expr[e]) {
        $t = returnType("and", $left.t, $right.t, $AMPAMP.tree);
        checkTypes(e, $t, $text, $AMPAMP.tree);
        $AMPAMP.tree.setVarType($t);
    }
    | ^(PIPEPIPE   left=expr[e] right=expr[e]) {
        $t = returnType("or", $left.t, $right.t, $PIPEPIPE.tree);
        checkTypes(e, $t, $text, $PIPEPIPE.tree);
        $PIPEPIPE.tree.setVarType($t);
    }
    | ^(EQEQ       left=expr[any] right=expr[any]) {
        $t = returnType("equal", $left.t, $right.t, $EQEQ.tree);
        checkTypes(e, $t, $text, $EQEQ.tree);
        $EQEQ.tree.setVarType($t);
    }
    | ^(BANGEQ     left=expr[any] right=expr[any]) {
        $t = returnType("notEqual", $left.t, $right.t, $BANGEQ.tree);
        checkTypes(e, $t, $text, $BANGEQ.tree);
        $BANGEQ.tree.setVarType($t);
    }
    | ^(LESS       left=expr[any] right=expr[any]) {
        $t = returnType("less", $left.t, $right.t, $LESS.tree);
        checkTypes(e, $t, $text, $LESS.tree);
        $LESS.tree.setVarType($t);
    }
    | ^(GREATER    left=expr[any] right=expr[any]) {
        $t = returnType("greater", $left.t, $right.t, $GREATER.tree);
        checkTypes(e, $t, $text, $GREATER.tree);
        $GREATER.tree.setVarType($t);
    }
    | ^(LESSEQ     left=expr[any] right=expr[any]) {
        $t = returnType("lessOrEqual", $left.t, $right.t, $LESSEQ.tree);
        checkTypes(e, $t, $text, $LESSEQ.tree);
        $LESSEQ.tree.setVarType($t);
    }
    | ^(GREATEREQ  left=expr[any] right=expr[any]) {
        $t = returnType("greaterOrEqual", $left.t, $right.t, $GREATEREQ.tree);
        checkTypes(e, $t, $text, $GREATEREQ.tree);
        $GREATEREQ.tree.setVarType($t);
    }
    | ^(BANG arg=expr[any]) {
        $t = returnType("not", $arg.t, $BANG.tree);
        checkTypes(e, $t, $text, $BANG.tree);
        $BANG.tree.setVarType($t);
    }
    | ^(PAREN arg=expr[e]) { $t = $arg.t; $PAREN.tree.setVarType($t); }
    | ^(SIGN (PLUS arg=expr[e]
             |MINUS arg=expr[e]
             )) { $t = $arg.t; checkTypes(e, $t, $text, $PLUS.text == null ? $MINUS.tree : $PLUS.tree); $SIGN.tree.setVarType($t); } //TODO handle negate methods that change the type
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
            reportError(new UnknownIdentifierException($left.text, $left.tree));
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
            checkTypes($expected, $t, $function.tree.treeToString(parser), $function.tree);
            checkArgs($function.tree.toString(), $function.t, args, $function.tree);
        }
        $CALL.tree.setVarType($t);
    }
    | ^(INDEX array=postfixExpr[Array] expr[any]) {
        $isFunctionCall = false;
        if (!($array.t instanceof ArrayType)) {
            notAnArray($array.text, $array.t, $array.tree);
            $t = SimpleType.create("# NotAnArray #");
        } else {
            $t = ((ArrayType)$array.t).getTypeArgument();
            checkTypes($expected, $t, $array.text, $array.tree);
        }
        $INDEX.tree.setVarType($t);
    }
    ;


terminator
    : SEMICOLON
    ;
