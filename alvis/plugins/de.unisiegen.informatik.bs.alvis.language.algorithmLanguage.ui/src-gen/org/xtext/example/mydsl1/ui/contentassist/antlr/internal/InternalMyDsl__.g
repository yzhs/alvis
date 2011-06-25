lexer grammar InternalMyDsl;
@header {
package org.xtext.example.mydsl1.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T13 : 'String' ;
T14 : 'Integer' ;
T15 : 'Boolean' ;
T16 : '==' ;
T17 : '!=' ;
T18 : '<' ;
T19 : '>' ;
T20 : '<=' ;
T21 : '>=' ;
T22 : '+' ;
T23 : '-' ;
T24 : '*' ;
T25 : '/' ;
T26 : '%' ;
T27 : '(' ;
T28 : ')' ;
T29 : ':' ;
T30 : 'main(' ;
T31 : ',' ;
T32 : 'begin' ;
T33 : 'end' ;
T34 : 'return' ;
T35 : 'if' ;
T36 : 'else' ;
T37 : 'for' ;
T38 : 'in' ;
T39 : 'while' ;
T40 : 'mains' ;
T41 : '=' ;
T42 : '||' ;
T43 : '&&' ;
T44 : '!' ;
T45 : 'PRINT' ;
T46 : '.' ;
T47 : '[' ;
T48 : ']' ;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 4917
RULE_CONSTANT : ('true'|'false'|('0'..'9')+ '.' ('0'..'9')*|('0'..'9')+|'STRING'|'null'|'infty');

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 4919
RULE_ENDEXPR : (','|';');

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 4921
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 4923
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 4925
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 4927
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 4929
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 4931
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 4933
RULE_ANY_OTHER : .;


