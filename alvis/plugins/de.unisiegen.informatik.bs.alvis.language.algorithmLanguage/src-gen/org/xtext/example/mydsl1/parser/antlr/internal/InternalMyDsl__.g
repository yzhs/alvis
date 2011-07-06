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
T18 : 'end' ;
T19 : 'String' ;
T20 : 'Integer' ;
T21 : 'Boolean' ;
T22 : 'Graph' ;
T23 : 'Vertex' ;
T24 : 'Edge' ;
T25 : 'return' ;
T26 : 'if' ;
T27 : 'else' ;
T28 : 'for' ;
T29 : 'in' ;
T30 : 'while' ;
T31 : '[]' ;
T32 : '=' ;
T33 : '||' ;
T34 : '&&' ;
T35 : '==' ;
T36 : '!=' ;
T37 : '<' ;
T38 : '>' ;
T39 : '<=' ;
T40 : '>=' ;
T41 : '*' ;
T42 : '/' ;
T43 : '%' ;
T44 : '!' ;
T45 : '.' ;
T46 : '[' ;
T47 : ']' ;
T48 : 'true' ;
T49 : 'false' ;
T50 : 'null' ;
T51 : 'infty' ;
T52 : ';' ;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2319
RULE_SIGN : ('+'|'-');

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2321
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2323
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2325
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2327
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2329
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2331
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2333
RULE_ANY_OTHER : .;


