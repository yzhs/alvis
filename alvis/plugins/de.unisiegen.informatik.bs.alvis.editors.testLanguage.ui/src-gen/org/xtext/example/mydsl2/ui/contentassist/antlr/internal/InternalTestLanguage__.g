lexer grammar InternalTestLanguage;
@header {
package org.xtext.example.mydsl2.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'Datatype' ;
T12 : 'entity' ;
T13 : '{' ;
T14 : '}' ;

// $ANTLR src "../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g" 605
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g" 607
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g" 609
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g" 611
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g" 613
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g" 615
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g" 617
RULE_ANY_OTHER : .;


