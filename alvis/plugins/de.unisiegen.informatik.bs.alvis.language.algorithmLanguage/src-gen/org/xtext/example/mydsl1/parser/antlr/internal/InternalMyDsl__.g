lexer grammar InternalMyDsl;
@header {
package org.xtext.example.mydsl1.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : '(' ;
T13 : ')' ;
T14 : ':' ;
T15 : 'main' ;
T16 : ',' ;
T17 : 'begin' ;
T18 : '{' ;
T19 : 'end' ;
T20 : '}' ;
T21 : 'String' ;
T22 : 'Integer' ;
T23 : 'Boolean' ;
T24 : 'Graph' ;
T25 : 'Vertex' ;
T26 : 'Edge' ;
T27 : 'Queue' ;
T28 : 'return' ;
T29 : 'if' ;
T30 : 'else' ;
T31 : 'for' ;
T32 : 'in' ;
T33 : 'while' ;
T34 : '[]' ;
T35 : '=' ;
T36 : '||' ;
T37 : '&&' ;
T38 : '==' ;
T39 : '!=' ;
T40 : '<' ;
T41 : '>' ;
T42 : '<=' ;
T43 : '>=' ;
T44 : '*' ;
T45 : '/' ;
T46 : '%' ;
T47 : '!' ;
T48 : '.' ;
T49 : '[' ;
T50 : ']' ;
T51 : 'true' ;
T52 : 'false' ;
T53 : 'null' ;
T54 : 'infty' ;
T55 : ';' ;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2347
RULE_SIGN : ('+'|'-');

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2349
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2351
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2353
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2355
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2357
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2359
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2361
RULE_ANY_OTHER : .;


