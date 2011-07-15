parser grammar TParser;

options {
     output    = AST;
     superClass = AbstractTParser;
     tokenVocab = TLexer;
     backtrack = true;
}

tokens {    // tokens used for constructing the AST
    PROG;   // parent for all functions in the program
    FUNC;   // function definition
    BLOCK;

    TYPE;   // used to declare return types of functions
    ARRAY;  // array type declaration
    COMPLEX;// used to declare types that use generics

    DECL;   // variable declaration
    DECL_INIT; // variable declaration and initialization

    CALL;   // function or method call
    INDEX;  // array indexing operation

    PAREN;  // parenthesized expression, not the parentheses of a function call
    SIGN;   // used do indicate unary usage of '+' or '-'

    PARAMS; // this is used to mark the formal parameters in function definitions

    ASSIGN; // the assignment operator

    IF_ELSE;// if-then-else statement, as opposed to a simple if-then statement
    STAT;   // used to group code in 'then' and 'else' blocks
}

@header {
package de.uni_siegen.informatik.bs.alvic;
}

program
    : functionDefinition* mainFunction -> ^(PROG functionDefinition* mainFunction)
    ;

functionDefinition
    : ident LPAREN formalParams? RPAREN (COLON type)? block
        -> ^(FUNC[$ident.start, "FUNC"] ident ^(TYPE type?) ^(PARAMS formalParams?) block)
    ;

/**
 * This is used so a program can be forced to have exaclty one main function but
 * arbitrarily many other functions. Also the main function does not allow
 * returning non-void.
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
    : type ident -> ^(DECL type ident)
    ;
 
block
    : SCOPEL statement* SCOPER -> ^(BLOCK[$SCOPEL, "BLOCK"] statement*)
    ;

type
    : (simpleType -> simpleType) (
    (typeHelper -> ^(COMPLEX typeHelper $type))//This allows types like "Vertex Queue" which is translated as "Queue<Vertex>"
    | (LARRAY RARRAY -> ^(ARRAY[$LARRAY, "ARRAY"] $type))
    )*
    ;

typeHelper
    : type
    ;

simpleType
    : {TLexer.isTypeName(input.LT(1).getText())}? ID
    ;

ident
    : {!TLexer.isTypeName(input.LT(1).getText())}? ID
    ;

statement
    : declaration terminator
    | postfixExpr terminator
    | assignment terminator
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
    : type ident
        ( -> ^(DECL[$type.start, "DECL"] type ident)
        | EQUAL expr -> ^(DECL_INIT[$type.start, "DECL_INIT"] type ident expr)
        )
    ;

assignment
    : postfixExpr EQUAL expr
        { if ($postfixExpr.isFunctionCall)
              throw new FailedPredicateException(input, "assignment", "!postfixExpr.isFunctionCall");
        } -> ^(ASSIGN[$postfixExpr.start, "ASSIGN"] postfixExpr expr)
    ;

expr
    : andExpr (PIPEPIPE^ andExpr)*
    ;

andExpr
    : eqExpr (AMPAMP^ eqExpr)*
    ;

eqExpr
    : relExpr ((EQEQ^|BANGEQ^) relExpr)*
    ;

relExpr
    : addExpr ((LESS^|GREATER^|LESSEQ^|GREATEREQ^) addExpr)*
    ;

addExpr
    : mulExpr ((PLUS^|MINUS^) mulExpr)*
    ;

mulExpr
    : atom ((STAR^|SLASH^|PERCENT^) atom)*
    ;

atom: BANG^ atom
    | LPAREN sign expr RPAREN
      -> ^(SIGN[$LPAREN, "SIGN"] sign expr)
    | LPAREN expr RPAREN -> ^(PAREN[$LPAREN, "PAREN"] expr) // this is needed to make sure the output looks much like the input (for outputting LaTeX code for instance)
    | postfixExpr
    | constant
    ;

/**
 * This matches identifiers, function calls, attributes and method calls as well
 * as array indexing combined in every order.
 */
postfixExpr returns [boolean isFunctionCall, boolean isValidStatement]
@init {$isFunctionCall = false; $isValidStatement = false;}
    : (ident -> ident)
      ( DOT right=ident                     {$isFunctionCall = false; $isValidStatement = false; }-> ^(DOT $postfixExpr $right)
      | LPAREN (expr (COMMA expr)*)? RPAREN {$isFunctionCall = true;  $isValidStatement = true; } -> ^(CALL[$LPAREN, "CALL"] $postfixExpr expr*)
      | LARRAY expr RARRAY                  {$isFunctionCall = false; $isValidStatement = false; }-> ^(INDEX[$LARRAY, "INDEX"] $postfixExpr expr)
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
