grammar PseudoCode;

options {
  //backtrack = true;
  language = Java;
  output = AST;
}

@header {package compiler;}
@lexer::header {package compiler;}

WHITESPACE : (' '|'\t'|'\r'|'\n')+ { $channel = HIDDEN; };

DIGIT : '0'..'9';

LETTER : '_' | 'a'..'z' | 'A'..'Z';

IDENT : LETTER (LETTER|DIGIT)*;

terminator : ','|';'; //the statement terminators

int_ : DIGIT*;
char_ : ~('"'|'\r'|'\n');
string_ : '"' (char_*) '"';

program: function_definition; //TODO: allow multiple functions

function_definition: IDENT '(' params? ')' block;

params : param (',' param)*;

param: type IDENT;

type: simple_type; //TODO: handle arrays

simple_type : 'int'|'String'|'Graph'|'Vertex'|'Color';

variable_declaration: type var_ident (',' var_ident)* ';';

block: '{' (statement*) '}' | 'begin' (statement*) 'end';

statement: variable_declaration |
  function_call terminator |
  assignment (terminator assignment)* terminator| 
  'if' boolexp block ('else' block)? |
  'for' IDENT 'in' expr block |
  'while' boolexp block |
  'do' block 'while' boolexp ',';

lvalue : var_ident ('['expr']')?;

var_ident : IDENT;
fun_ident : IDENT;

assignment: lvalue '=' expr;

expr: term (('+'|'-') term)*;

term: factor (('*'|'/'|'%') factor)*;

factor: var_ident | '(' expr ')' | function_call | constant;

function_call : fun_ident '('args')';

args : expr (',' expr)*;

constant : int_ | string_;

boolexp: expr ('<'|'>'|'=='|'!='|'>='|'<=') expr;

/* vim:set ts=2 sw=2 ft=antlr et: */
