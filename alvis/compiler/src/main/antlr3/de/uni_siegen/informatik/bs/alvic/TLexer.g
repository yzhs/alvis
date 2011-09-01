/*                                                                                                                                                                                                                                            
 * Copyright (c) 2011 Colin Benner
 * Permission is hereby granted, free of charge, to any person obtaining a copy of                                                                                                                                                            
 * this software and associated documentation files (the "Software"), to deal in the                                                                                                                                                          
 * Software without restriction, including without limitation the rights to use,                                                                                                                                                              
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the                                                                                                                                                            
 * Software, and to permit persons to whom the Software is furnished to do so,                                                                                                                                                                
 * subject to the following conditions:                                                                                                                                                                                                       
 * The above copyright notice and this permission notice shall be included in all                                                                                                                                                             
 * copies or substantial portions of the Software.                                                                                                                                                                                            
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,                                                                                                                                                        
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A                                                                                                                                                              
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT                                                                                                                                                         
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION                                                                                                                                                          
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE                                                                                                                                                             
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.                                                                                                                                                                                     
 */
lexer grammar TLexer;

options {
   superClass = AbstractTLexer;
}

tokens {
    TYPE;
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
		tokenText = new ArrayList<String>();
        
        tokenText.addAll(allKeywords());

		tokenText.addAll(types);

		// adding all identifiers for autocompletion
		for (Token tok : this.getIdentifiers()) {
			if (!isKnownToken(tok)) {
				tokenText.add(tok.getText());
			}
		}
	}

	public List<Token> getTokens() {
		return tokens;
	}

	/**
	 * This is used to mark Java keywords we do not use as forbidden so that they
     * can not be used as identifiers. Therefore all of our identifiers can be used
     * in the generated Java code as Java identifiers.
	 * @return	List of all Tokens that are Java keywords, but not used in
	 *		Alvis' language
	 */
	public List<Token> getForbidden() {
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

    public List<Token> beginBlock() {
        List<Token> result = new ArrayList<Token>();
        for (Token token : tokens)
            if (token.getType() == SCOPEL)
                result.add(token);
        return result;
    }

    public List<Token> endBlock() {
        List<Token> result = new ArrayList<Token>();
        for (Token token : tokens)
            if (token.getType() == SCOPER)
                result.add(token);
        return result;
    }

	/**
	 * @return List of all Tokens in the input stream that are identifiers
	 */
	public List<Token> getIdentifiers() {
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
BANG : '!' ; // boolean not
// '+' and '-' are also binary operators and have thus already been added.
// PLUS : '+';
// MINUS: '-';


LPAREN : '(' ;
RPAREN : ')' ;
LARRAY : '[' ;
RARRAY : ']' ;

// assignment operator
EQUAL : '=' ;

/*
 * Statement terminators
 */
SEMICOLON : ';' ;
COMMA : ',' ;
// terminates loop headers, conditions of if-statements and used to start the declaration of a function's return type
COLON : ':' ;


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

// This is used as the name of the main function of an algorithm.
MAIN: 'main' ;


/**
 * Alvis' language allows the following literals
 */
INT : '0'..'9'+ ;

FLOAT : '0'..'9'+'.'('0'..'9')* ;

BOOL: 'true'|'false';

STRING :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"' ;

NULL : 'null' ;
INFTY : 'infty' ;

/**
 * escape sequences to be used in strings
 */
fragment
ESC_SEQ : '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') ;


/* 
 * These keywords are not used, but have to be forbidden as identifiers, as they
 * can not be used in the resulting Java code.
 */
JAVAKEYWORD :
   ( 'abstract' | 'assert' | 'boolean' | 'break' | 'byte' | 'catch' | 'class' | 'const' | 'continue'
   | 'default' | 'double' | 'enum' | 'extends' | 'final' | 'finally' | 'float' | 'goto' | 'implements'
   | 'import' | 'int' | 'instanceof' | 'interface' | 'long' | 'native' | 'new' | 'package'
   | 'private' | 'protected' | 'public' | 'return' | 'short' | 'static' | 'strictfp' | 'super'
   | 'synchronized' | 'this' | 'throw' | 'transient' | 'try' | 'void' | 'volatile' ) ;


ID  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* {
        if (isTypeName($text))
            $type = TYPE;
    };


COMMENT
    : '//' ~('\n'|'\r')* ('\r'|'\n') { skip(); }
    | '/*' ( options {greedy=false;} : . )* '*/' { skip(); }
    ;

WHITESPACE : (' '|'\t'|'\r'|'\n') { skip(); } ;

