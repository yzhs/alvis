lexer grammar InternalMyDsl;
@header {
package org.xtext.example.mydsl1.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : '(' ;
T14 : ')' ;
T15 : ':' ;
T16 : 'main(' ;
T17 : ',' ;
T18 : 'begin' ;
T19 : 'end' ;
T20 : 'String' ;
T21 : 'Integer' ;
T22 : 'Boolean' ;
T23 : 'return' ;
T24 : 'if' ;
T25 : 'else' ;
T26 : 'for' ;
T27 : 'in' ;
T28 : 'while' ;
T29 : 'mains' ;
T30 : '=' ;
T31 : '||' ;
T32 : '&&' ;
T33 : '==' ;
T34 : '!=' ;
T35 : '<' ;
T36 : '>' ;
T37 : '<=' ;
T38 : '>=' ;
T39 : '+' ;
T40 : '-' ;
T41 : '*' ;
T42 : '/' ;
T43 : '%' ;
T44 : '!' ;
T45 : 'PRINT' ;
T46 : '.' ;
T47 : '[' ;
T48 : ']' ;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 1745
RULE_CONSTANT : ('true'|'false'|('0'..'9')+ '.' ('0'..'9')*|('0'..'9')+|'STRING'|'null'|'infty');

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 1747
RULE_ENDEXPR : (','|';');

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 1749
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 1751
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 1753
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 1755
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 1757
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 1759
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 1761
RULE_ANY_OTHER : .;


