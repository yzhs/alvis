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
T15 : 'Graph' ;
T16 : 'Vertex' ;
T17 : 'Edge' ;
T18 : '==' ;
T19 : '!=' ;
T20 : '<' ;
T21 : '>' ;
T22 : '<=' ;
T23 : '>=' ;
T24 : '*' ;
T25 : '/' ;
T26 : '%' ;
T27 : ',' ;
T28 : ';' ;
T29 : '(' ;
T30 : ')' ;
T31 : ':' ;
T32 : 'begin' ;
T33 : 'end' ;
T34 : 'return' ;
T35 : 'if' ;
T36 : 'else' ;
T37 : 'for' ;
T38 : 'in' ;
T39 : 'while' ;
T40 : '[]' ;
T41 : '=' ;
T42 : '||' ;
T43 : '&&' ;
T44 : '!' ;
T45 : '.' ;
T46 : '[' ;
T47 : ']' ;
T48 : 'true' ;
T49 : 'false' ;
T50 : 'main' ;
T51 : 'null' ;
T52 : 'infty' ;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5563
RULE_SIGN : ('+'|'-');

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5565
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5567
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5569
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5571
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5573
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5575
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5577
RULE_ANY_OTHER : .;


