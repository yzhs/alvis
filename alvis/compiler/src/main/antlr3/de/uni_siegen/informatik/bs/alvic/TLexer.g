lexer grammar TLexer;

options {
   superClass = AbstractTLexer;
}

@header {
    package de.uni_siegen.informatik.bs.alvic;
	import java.util.ArrayList;
}

@members {
	/**
	 * This method sets the attribute tokenText to a List of all keywords
	 * and types that are allowed in Alvis' language. The types are plugin
	 * specific types, as well as the builtin ones.
	 */
	protected void allTokens() {
		// TODO discuss, is there a nicer way to get all tokens?
		tokenText = new ArrayList<String>();
		tokenText.add("if");
		tokenText.add("else");
		tokenText.add("begin");
		tokenText.add("end");

		tokenText.add("for");
		tokenText.add("while");
		tokenText.add("in");

		tokenText.addAll(types);

		// adding all identifiers for autocompletion
		for (Token tok : this.getIdentifier()) {
			if (!isKnownToken(tok)) {
				tokenText.add(tok.getText());
			}
		}
	}

	/**
	 * This is used to mark Java keywords we do not use as forbidden. With
	 * so this all identifiers can be used in the compiled source as Java
	 * identifiers.
	 * @return	List of all Tokens that are Java keywords, but not used in
	 *		Alvis' language
	 */
	public List<Token> getForbidden() {
		this.scan();
		ArrayList<Token> result = new ArrayList<Token>();

		for (Token token : tokens) {
			if (token.getType() == JAVAKEYWORD) {
				result.add(token);
			}
		}
		return result;
	}

	/**
	 * @return List of all Tokens in the input stream that are keywords
	 */
	public List<Token> getKeywords() {
		this.scan();
		ArrayList<Token> result = new ArrayList<Token>();

		for (Token token : tokens) {
			if (token.getType() == IF ||
			    token.getType() == ELSE ||
			    token.getType() == FOR ||
			    token.getType() == IN ||
			    token.getType() == WHILE ||
			    token.getType() == SCOPEL ||
			    token.getType() == SCOPER ||
			    token.getType() == JAVAKEYWORD) {
				result.add(token);
			}
		}
		return result;
	}

	/**
	 * @return List of all Tokens in the input stream that are identifiers
	 */
	public List<Token> getIdentifier() {
		this.scan();
		ArrayList<Token> result = new ArrayList<Token>();
		
		for (Token token : tokens) {
			if (token.getType() == ID && !isTypeName(token.getText())) {
				result.add(token);
			}
		}
		return result;
	}
}

// '.' is used to access object's attributes and methods
DOT : '.' ;


/*
 * binary operators
 */
// arithmetic operators
PLUS   : '+';
MINUS  : '-';
STAR   : '*';
SLASH  : '/';
PERCENT: '%'; // modulo operator
// boolean operators
AMPAMP  : '&&';
PIPEPIPE: '||';
// The following two tokens are not used at the moment but might be added later.
//AMP     : '&' ;
//PIPE    : '|' ;
// relational operators
EQEQ     : '==';
BANGEQ   : '!=';
LESS     : '<' ;
GREATER  : '>' ;
LESSEQ   : '<=';
GREATEREQ: '>=';

/*
 * unary operators
 */
/* '+' and '-' are also used as binary operators. Therefore they are not added
 * here as well.
 */
// PLUS : '+';
// MINUS: '-';
BANG : '!' ; // boolean not


LPAREN : '(' ;
RPAREN : ')' ;
LARRAY : '[' ;
RARRAY : ']' ;

// assignment operator
EQUAL : '=' ;

// terminates loop headers, conditions of if-statements and used to start the declaration of a function's return type
COLON : ':' ;
DOUBLECOLON : '::' ;

/*
 * Statement terminators
 */
SEMICOLON : ';' ;
COMMA : ',' ;


/*
 * Keywords that are used by Alvis' language
 */
IF  : 'if' ;
ELSE: 'else' ;
FOR : 'for' ;
IN  : 'in' ;
WHILE : 'while' ;
RETURN: 'return' ;

SCOPEL : 'begin' | '{' ;
SCOPER : 'end'   | '}' ;

// This is used to indicate that a function is the main function.
MAIN: 'main' ;


/**
 * Alvis' language allows the following literals
 */
INT : '0'..'9'+ ;

FLOAT : '0'..'9'+'.'('0'..'9')* ;

INFTY : 'infty' ;

BOOL: 'true'|'false';

STRING :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"' ;

NULL : 'null' ;

/**
 * escape sequences
 */
fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;


/* 
 * These keywords are not used, but have to be forbidden as identifiers, as they
 * can not be used in the resulting Java source.
 */
JAVAKEYWORD :
   ( 'abstract' | 'assert' | 'boolean' | 'byte' | 'catch' | 'class' | 'const' | 'default'
   | 'double' | 'enum' | 'extends' | 'final' | 'finally' | 'float' | 'goto' | 'implements'
   | 'import' | 'int' | 'instanceof' | 'interface' | 'long' | 'native' | 'new' | 'package'
   | 'private' | 'protected' | 'public' | 'return' | 'short' | 'static' | 'strictfp' | 'super'
   | 'synchronized' | 'this' | 'throw' | 'transient' | 'try' | 'void' | 'volatile' ) ;


ID  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;


COMMENT
    : '//' ~('\n'|'\r')* ('\r'|'\n') { $channel=HIDDEN; }
    | '/*' ( options {greedy=false;} : . )* '*/' { $channel=HIDDEN; }
    ;

WHITESPACE
    : (' '|'\t'|'\r'|'\n') { $channel=HIDDEN; }
    ;

