parser grammar TParser;

options {
     output       = AST;
     superClass   = AbstractTParser;
     tokenVocab   = TLexer;
     backtrack    = true;
     ASTLabelType = TypedTree;
}

// tokens used for constructing the AST
tokens {
    PROG;   // The root node in the generated tree.
    FUNC;   // function definition
    BLOCK;

    RET;   // used to declare return types of functions
    ARRAY;  // array type declaration
    COMPLEX;// used to declare types that use generics, such as "Integer Queue"
    // which is translated to something like Java's "Queue<Integer>"

    DECL;   // variable declaration
    DECL_INIT; // variable declaration and initialization

    CALL;   // function or method call
    INDEX;  // array indexing operation

    PAREN;  // parenthesized expression not the parentheses of a function call
    //(this could be used for generating nice LaTeX output)

    SIGN;   // used do indicate unary usage of '+' or '-'

    PARAMS; // this is used to mark the formal parameters in function definitions

    ASSIGN; // the assignment operation

    IF_ELSE;// if-then-else statement, as opposed to a simple if-then statement without an else statement
    STAT;   // used to group code in 'then' and 'else' blocks
    /*
     * We need this because the user might write something like 'if foo: a=1;' in which case the generated code
     * would look something like 'if (foo) { a = 1; reachedBreakPoint(currentLineNumber); }'.
     * In this case we have to group the assignment and the breakpoint statement so it is clear where the else
     * statement starts even when the user did not actually use a block.
     * To solve this problem we could also simply use a block, but that would possibly create a block in the
     * generated LaTeX code that was not in the original source code, i.e. not intended by the user.
     */
}

@header {
package de.uni_siegen.informatik.bs.alvic;
}

program
    : functionDefinition* mainFunction functionDefinition* -> ^(PROG functionDefinition* mainFunction)
    ;

functionDefinition
    : ID LPAREN formalParams? RPAREN (COLON type)? block
        -> ^(FUNC[$ID, "FUNC"] ID ^(RET type?) ^(PARAMS formalParams?) block)
    ;

/**
 * This is used so a program can be forced to have exaclty one main function but
 * arbitrarily many other functions. Also the main function does not allow
 * returning non-void.
 * Treating the main-function seperately makes code generation.
 */
mainFunction
    : MAIN LPAREN formalParams? RPAREN block
        -> ^(FUNC[$MAIN, "FUNC"] MAIN ^(PARAMS formalParams?) block)
    ;

/**
 * The list of parameters with their respective types used in function definitions.
 * Returns a List of parameter types.
 */
formalParams
    : param (COMMA! param)*
    ;

/**
 * A variable declaration, used in lists of formal parameters and for loops
 */
param
    : type ID -> ^(DECL type ID)
    ;
 
/**
 * Defined this way our code allows curly brackets and begin/end to be combined arbitrarily.
 * For example the following is a valid block:
 *   begin a = 1, }
 * as is
 *   {end
 * as well as the obvious combinations "begin ... end" and "{ ... }".
 */
block
    : SCOPEL statement* SCOPER -> ^(BLOCK[$SCOPEL, "BLOCK"] statement*)
    ;

type
    : (TYPE -> TYPE) (
    //This allows types like "Vertex Queue" which is translated to something like "Queue<Vertex>"
    (typeHelper -> ^(COMPLEX typeHelper $type))
    | (LARRAY RARRAY -> ^(ARRAY[$LARRAY, "ARRAY"] $type))
    )*
    ;

/**
 * This is needed to reference the parent rule $type unabiguously when generating ^(COMPLEX typeHelper $type).
 */
typeHelper : type ;

statement
    : declaration terminator
    | postfixExpr terminator
    // Java does not allow "variable" or "variable[index]" as statements, so we have to forbid those as well
    { if (!$postfixExpr.isFunctionCall)
        reportError(new InvalidStatementException($postfixExpr.text, $postfixExpr.tree)); }
    | assignment terminator

    /* There is no nice way to generate a breakpoint after a return statement.
     * As there are only a few cases (when 'expr' has side effects) where this
     * makes a difference, we simply ignore a semicolon after a return statement.
     */
    | RETURN^ expr? terminator!
    | IF expr COLON t=statement
        ((ELSE)=> ELSE e=statement -> ^(IF_ELSE[$IF, "IF_ELSE"] expr ^(STAT $t) ^(STAT $e))
        | -> ^(IF expr ^(STAT $t))
        )
    | FOR^ param IN! expr COLON! statement
    | WHILE^ expr COLON! statement
    | block
    ;

declaration
    : type ID
        ( -> ^(DECL[$type.start, "DECL"] type ID)
        | EQUAL expr -> ^(DECL_INIT[$type.start, "DECL_INIT"] type ID expr)
        )
    ;

assignment
    : postfixExpr EQUAL expr
    { if ($postfixExpr.isFunctionCall)
        reportError(new InvalidAssignmentException($postfixExpr.text, $expr.text, $postfixExpr.tree));
    } -> ^(ASSIGN[$postfixExpr.start, "ASSIGN"] postfixExpr expr)
    ;

/*
 * Expressions with operator precedence as it is with the corresponding Java operators
 */
expr : andExpr (PIPEPIPE^ andExpr)* ;

andExpr : eqExpr (AMPAMP^ eqExpr)* ;

eqExpr : relExpr ((EQEQ^|BANGEQ^) relExpr)* ;

relExpr : addExpr ((LESS^|GREATER^|LESSEQ^|GREATEREQ^) addExpr)* ;

addExpr : mulExpr ((PLUS^|MINUS^) mulExpr)* ;

mulExpr : atom ((STAR^|SLASH^|PERCENT^) atom)* ;

// Highest priority operators
atom: BANG^ atom
    | LPAREN sign expr RPAREN
      -> ^(SIGN[$LPAREN, "SIGN"] sign expr)
    | LPAREN expr RPAREN -> ^(PAREN[$LPAREN, "PAREN"] expr) // This is needed to make sure the output looks like the input (for outputting LaTeX code for instance). Otherwise we would just use 'LPAREN expr RPAREN -> expr'.
    | postfixExpr
    | constant
    ;

/**
 * This matches identifiers, function calls, attributes, method calls and array
 * indexing combined in every order.
 *
 * isFunctionCall is true if and only if the last part of a postfix expression
 * parsed was a function or method call. We use this to decide whether a given
 * postfix expression can be used as an l-value (i.e. on the left side of an
 * assignment) and whether it can be used as a statement.
 */
postfixExpr returns [boolean isFunctionCall]
@init {$isFunctionCall = false;}
    : (ID -> ID)
      ( DOT right=ID                        {$isFunctionCall = false; }-> ^(DOT $postfixExpr $right)
      | LPAREN (expr (COMMA expr)*)? RPAREN {$isFunctionCall = true; } -> ^(CALL[$LPAREN, "CALL"] $postfixExpr expr*)
      | LARRAY expr RARRAY                  {$isFunctionCall = false; }-> ^(INDEX[$LARRAY, "INDEX"] $postfixExpr expr)
      )*
    ;

/**
 * the available literals
 */
constant
    : BOOL
    | FLOAT
    | INT
    | STRING
    | NULL
    | INFTY
    ;

sign: PLUS | MINUS ;

/**
 * The character used to determine the end of a statement.
 * If it is a semicolon, add a breakpoint.
 */
terminator
    : SEMICOLON
    | COMMA!
    ;
