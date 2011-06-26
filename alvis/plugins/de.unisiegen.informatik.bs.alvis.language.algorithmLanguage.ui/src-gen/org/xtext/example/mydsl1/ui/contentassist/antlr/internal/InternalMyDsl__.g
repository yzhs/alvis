lexer grammar InternalMyDsl;
@header {
package org.xtext.example.mydsl1.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : 'String' ;
T13 : 'Integer' ;
T14 : 'Boolean' ;
T15 : '==' ;
T16 : '!=' ;
T17 : '<' ;
T18 : '>' ;
T19 : '<=' ;
T20 : '>=' ;
T21 : '*' ;
T22 : '/' ;
T23 : '%' ;
T24 : 'true' ;
T25 : 'false' ;
T26 : ',' ;
T27 : ';' ;
T28 : '(' ;
T29 : ')' ;
T30 : ':' ;
T31 : 'begin' ;
T32 : 'end' ;
T33 : 'return' ;
T34 : 'if' ;
T35 : 'else' ;
T36 : 'for' ;
T37 : 'in' ;
T38 : 'while' ;
T39 : '[]' ;
T40 : '=' ;
T41 : '||' ;
T42 : '&&' ;
T43 : '!' ;
T44 : '.' ;
T45 : '[' ;
T46 : ']' ;
T47 : 'main' ;
T48 : 'null' ;
T49 : 'infty' ;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5786
RULE_SIGN : ('+'|'-');

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5788
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5790
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5792
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5794
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5796
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5798
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5800
RULE_ANY_OTHER : .;


