package org.xtext.example.mydsl1.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_CONSTANT=6;
    public static final int RULE_INT=8;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T48=48;
    public static final int RULE_SIGN=5;
    public static final int T43=43;
    public static final int Tokens=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=9;
    public static final int T44=44;
    public static final int RULE_STRING=7;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T15=15;
    public static final int RULE_WS=11;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g"; }

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:10:5: ( '(' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:10:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:11:5: ( ')' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:11:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:12:5: ( ':' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:12:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:13:5: ( 'main(' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:13:7: 'main('
            {
            match("main("); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:14:5: ( ',' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:14:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:15:5: ( 'begin' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:15:7: 'begin'
            {
            match("begin"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:16:5: ( 'end' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:16:7: 'end'
            {
            match("end"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:17:5: ( 'String' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:17:7: 'String'
            {
            match("String"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:18:5: ( 'Integer' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:18:7: 'Integer'
            {
            match("Integer"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:19:5: ( 'Boolean' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:19:7: 'Boolean'
            {
            match("Boolean"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:20:5: ( 'return' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:20:7: 'return'
            {
            match("return"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:21:5: ( 'if' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:21:7: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:22:5: ( 'else' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:22:7: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:23:5: ( 'for' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:23:7: 'for'
            {
            match("for"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:24:5: ( 'in' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:24:7: 'in'
            {
            match("in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:25:5: ( 'while' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:25:7: 'while'
            {
            match("while"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:26:5: ( '[]' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:26:7: '[]'
            {
            match("[]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:27:5: ( '=' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:27:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:28:5: ( '||' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:28:7: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:29:5: ( '&&' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:29:7: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:30:5: ( '==' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:30:7: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:31:5: ( '!=' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:31:7: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:32:5: ( '<' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:32:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:33:5: ( '>' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:33:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:34:5: ( '<=' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:34:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:35:5: ( '>=' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:35:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:36:5: ( '+' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:36:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:37:5: ( '-' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:37:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:38:5: ( '*' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:38:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:39:5: ( '/' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:39:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:40:5: ( '%' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:40:7: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:41:5: ( '!' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:41:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:42:5: ( '.' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:42:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:43:5: ( '[' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:43:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:44:5: ( ']' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:44:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:45:5: ( ';' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:45:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start RULE_CONSTANT
    public final void mRULE_CONSTANT() throws RecognitionException {
        try {
            int _type = RULE_CONSTANT;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1767:15: ( ( 'true' | 'false' | ( '0' .. '9' )+ '.' ( '0' .. '9' )* | ( '0' .. '9' )+ | RULE_STRING | 'null' | 'infty' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1767:17: ( 'true' | 'false' | ( '0' .. '9' )+ '.' ( '0' .. '9' )* | ( '0' .. '9' )+ | RULE_STRING | 'null' | 'infty' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1767:17: ( 'true' | 'false' | ( '0' .. '9' )+ '.' ( '0' .. '9' )* | ( '0' .. '9' )+ | RULE_STRING | 'null' | 'infty' )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1767:18: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1767:25: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1767:33: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1767:33: ( '0' .. '9' )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1767:34: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);

                    match('.'); 
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1767:49: ( '0' .. '9' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1767:50: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1767:61: ( '0' .. '9' )+
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1767:61: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1767:62: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;
                case 5 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1767:73: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;
                case 6 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1767:85: 'null'
                    {
                    match("null"); 


                    }
                    break;
                case 7 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1767:92: 'infty'
                    {
                    match("infty"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_CONSTANT

    // $ANTLR start RULE_SIGN
    public final void mRULE_SIGN() throws RecognitionException {
        try {
            int _type = RULE_SIGN;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1769:11: ( ( '+' | '-' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1769:13: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SIGN

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1771:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1771:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1771:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1773:10: ( ( '0' .. '9' )+ )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1773:12: ( '0' .. '9' )+
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1773:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1773:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1775:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1775:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1775:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1775:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1775:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1775:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFE')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1775:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1775:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1775:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1775:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFE')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1775:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1775:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1777:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1777:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1777:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFE')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1777:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1779:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1779:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1779:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1779:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1779:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1779:41: ( '\\r' )? '\\n'
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1779:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1779:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1781:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1781:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1781:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1783:16: ( . )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1783:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:8: ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | RULE_CONSTANT | RULE_SIGN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=45;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:10: T13
                {
                mT13(); 

                }
                break;
            case 2 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:14: T14
                {
                mT14(); 

                }
                break;
            case 3 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:18: T15
                {
                mT15(); 

                }
                break;
            case 4 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:22: T16
                {
                mT16(); 

                }
                break;
            case 5 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:26: T17
                {
                mT17(); 

                }
                break;
            case 6 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:30: T18
                {
                mT18(); 

                }
                break;
            case 7 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:34: T19
                {
                mT19(); 

                }
                break;
            case 8 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:38: T20
                {
                mT20(); 

                }
                break;
            case 9 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:42: T21
                {
                mT21(); 

                }
                break;
            case 10 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:46: T22
                {
                mT22(); 

                }
                break;
            case 11 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:50: T23
                {
                mT23(); 

                }
                break;
            case 12 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:54: T24
                {
                mT24(); 

                }
                break;
            case 13 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:58: T25
                {
                mT25(); 

                }
                break;
            case 14 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:62: T26
                {
                mT26(); 

                }
                break;
            case 15 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:66: T27
                {
                mT27(); 

                }
                break;
            case 16 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:70: T28
                {
                mT28(); 

                }
                break;
            case 17 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:74: T29
                {
                mT29(); 

                }
                break;
            case 18 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:78: T30
                {
                mT30(); 

                }
                break;
            case 19 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:82: T31
                {
                mT31(); 

                }
                break;
            case 20 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:86: T32
                {
                mT32(); 

                }
                break;
            case 21 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:90: T33
                {
                mT33(); 

                }
                break;
            case 22 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:94: T34
                {
                mT34(); 

                }
                break;
            case 23 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:98: T35
                {
                mT35(); 

                }
                break;
            case 24 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:102: T36
                {
                mT36(); 

                }
                break;
            case 25 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:106: T37
                {
                mT37(); 

                }
                break;
            case 26 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:110: T38
                {
                mT38(); 

                }
                break;
            case 27 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:114: T39
                {
                mT39(); 

                }
                break;
            case 28 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:118: T40
                {
                mT40(); 

                }
                break;
            case 29 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:122: T41
                {
                mT41(); 

                }
                break;
            case 30 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:126: T42
                {
                mT42(); 

                }
                break;
            case 31 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:130: T43
                {
                mT43(); 

                }
                break;
            case 32 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:134: T44
                {
                mT44(); 

                }
                break;
            case 33 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:138: T45
                {
                mT45(); 

                }
                break;
            case 34 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:142: T46
                {
                mT46(); 

                }
                break;
            case 35 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:146: T47
                {
                mT47(); 

                }
                break;
            case 36 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:150: T48
                {
                mT48(); 

                }
                break;
            case 37 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:154: RULE_CONSTANT
                {
                mRULE_CONSTANT(); 

                }
                break;
            case 38 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:168: RULE_SIGN
                {
                mRULE_SIGN(); 

                }
                break;
            case 39 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:178: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 40 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:186: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 41 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:195: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 42 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:207: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 43 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:223: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 44 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:239: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 45 :
                // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1:247: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA4_eotS =
        "\3\uffff\1\7\5\uffff";
    static final String DFA4_eofS =
        "\11\uffff";
    static final String DFA4_minS =
        "\1\42\2\uffff\1\56\5\uffff";
    static final String DFA4_maxS =
        "\1\164\2\uffff\1\71\5\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\4\1\3";
    static final String DFA4_specialS =
        "\11\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\4\4\uffff\1\4\10\uffff\12\3\54\uffff\1\2\2\uffff\1\6\4\uffff"+
            "\1\5\5\uffff\1\1",
            "",
            "",
            "\1\10\1\uffff\12\3",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1767:17: ( 'true' | 'false' | ( '0' .. '9' )+ '.' ( '0' .. '9' )* | ( '0' .. '9' )+ | RULE_STRING | 'null' | 'infty' )";
        }
    }
    static final String DFA15_eotS =
        "\4\uffff\1\52\1\uffff\11\52\1\71\1\73\2\45\1\77\1\101\1\103\3\uffff"+
        "\1\111\4\uffff\1\52\1\117\2\45\1\52\6\uffff\1\52\2\uffff\7\52\1"+
        "\142\1\143\3\52\26\uffff\1\52\1\uffff\1\117\6\uffff\1\52\1\uffff"+
        "\2\52\1\155\6\52\2\uffff\1\164\3\52\2\uffff\3\52\1\uffff\1\173\5"+
        "\52\1\uffff\2\52\2\117\1\uffff\1\u0083\1\uffff\4\52\2\117\1\u0088"+
        "\1\uffff\1\u0089\2\52\1\u008c\2\uffff\1\u008d\1\u008e\3\uffff";
    static final String DFA15_eofS =
        "\u008f\uffff";
    static final String DFA15_minS =
        "\1\0\3\uffff\1\141\1\uffff\1\145\1\154\1\164\1\156\1\157\1\145\1"+
        "\146\1\141\1\150\1\135\1\75\1\174\1\46\3\75\3\uffff\1\52\4\uffff"+
        "\1\162\1\60\2\0\1\165\6\uffff\1\151\2\uffff\1\147\1\144\1\163\1"+
        "\162\1\164\1\157\1\164\2\60\1\162\1\154\1\151\26\uffff\1\165\1\uffff"+
        "\1\60\1\42\1\0\1\uffff\1\42\1\0\1\uffff\1\154\1\uffff\1\156\1\151"+
        "\1\60\1\145\1\151\1\145\1\154\1\165\1\164\2\uffff\1\60\1\163\1\154"+
        "\1\145\2\0\1\154\1\50\1\156\1\uffff\1\60\1\156\1\147\1\145\1\162"+
        "\1\171\1\uffff\2\145\2\60\1\uffff\1\60\1\uffff\1\147\1\145\1\141"+
        "\1\156\3\60\1\uffff\1\60\1\162\1\156\1\60\2\uffff\2\60\3\uffff";
    static final String DFA15_maxS =
        "\1\ufffe\3\uffff\1\141\1\uffff\1\145\1\156\1\164\1\156\1\157\1\145"+
        "\1\156\1\157\1\150\1\135\1\75\1\174\1\46\3\75\3\uffff\1\57\4\uffff"+
        "\1\162\1\71\2\ufffe\1\165\6\uffff\1\151\2\uffff\1\147\1\144\1\163"+
        "\1\162\1\164\1\157\1\164\2\172\1\162\1\154\1\151\26\uffff\1\165"+
        "\1\uffff\1\71\1\164\1\ufffe\1\uffff\1\164\1\ufffe\1\uffff\1\154"+
        "\1\uffff\1\156\1\151\1\172\1\145\1\151\1\145\1\154\1\165\1\164\2"+
        "\uffff\1\172\1\163\1\154\1\145\2\ufffe\1\154\1\50\1\156\1\uffff"+
        "\1\172\1\156\1\147\1\145\1\162\1\171\1\uffff\2\145\2\172\1\uffff"+
        "\1\172\1\uffff\1\147\1\145\1\141\1\156\3\172\1\uffff\1\172\1\162"+
        "\1\156\1\172\2\uffff\2\172\3\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\20\uffff\1\33\1\34\1\35\1\uffff"+
        "\1\37\1\41\1\43\1\44\5\uffff\1\47\1\54\1\55\1\1\1\2\1\3\1\uffff"+
        "\1\47\1\5\14\uffff\1\21\1\42\1\25\1\22\1\23\1\24\1\26\1\40\1\31"+
        "\1\27\1\32\1\30\1\33\1\34\1\35\1\53\1\52\1\36\1\37\1\41\1\43\1\44"+
        "\1\uffff\1\45\3\uffff\1\45\2\uffff\1\45\1\uffff\1\54\11\uffff\1"+
        "\17\1\14\11\uffff\1\7\6\uffff\1\16\4\uffff\1\4\1\uffff\1\15\7\uffff"+
        "\1\6\4\uffff\1\20\1\10\2\uffff\1\13\1\11\1\12";
    static final String DFA15_specialS =
        "\u008f\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\45\2\44\2\45\1\44\22\45\1\44\1\23\1\40\2\45\1\32\1\22\1"+
            "\41\1\1\1\2\1\30\1\26\1\5\1\27\1\33\1\31\12\37\1\3\1\35\1\24"+
            "\1\20\1\25\2\45\1\43\1\12\6\43\1\11\11\43\1\10\7\43\1\17\1\45"+
            "\1\34\1\45\1\43\1\45\1\43\1\6\2\43\1\7\1\15\2\43\1\14\3\43\1"+
            "\4\1\42\3\43\1\13\1\43\1\36\2\43\1\16\3\43\1\45\1\21\uff82\45",
            "",
            "",
            "",
            "\1\51",
            "",
            "\1\54",
            "\1\56\1\uffff\1\55",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\64\7\uffff\1\63",
            "\1\66\15\uffff\1\65",
            "\1\67",
            "\1\70",
            "\1\72",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\100",
            "\1\102",
            "",
            "",
            "",
            "\1\110\4\uffff\1\107",
            "",
            "",
            "",
            "",
            "\1\116",
            "\12\120",
            "\42\122\1\123\71\122\1\121\uffa2\122",
            "\47\125\1\126\64\125\1\124\uffa2\125",
            "\1\127",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\131",
            "",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\5\52\1\141\24\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\147",
            "",
            "\12\120",
            "\1\150\4\uffff\1\150\64\uffff\1\150\5\uffff\1\150\3\uffff\1"+
            "\150\7\uffff\1\150\3\uffff\1\150\1\uffff\1\150",
            "\42\122\1\123\71\122\1\121\uffa2\122",
            "",
            "\1\151\4\uffff\1\151\64\uffff\1\151\5\uffff\1\151\3\uffff\1"+
            "\151\7\uffff\1\151\3\uffff\1\151\1\uffff\1\151",
            "\47\125\1\126\64\125\1\124\uffa2\125",
            "",
            "\1\152",
            "",
            "\1\153",
            "\1\154",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\165",
            "\1\166",
            "\1\167",
            "\42\122\1\123\71\122\1\121\uffa2\122",
            "\47\125\1\126\64\125\1\124\uffa2\125",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u008a",
            "\1\u008b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | RULE_CONSTANT | RULE_SIGN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}