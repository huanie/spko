// Generated from SExpressionLexer.g4 by ANTLR 4.13.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings(
        {"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue",
                "this-escape"})
public class SExpressionLexer extends Lexer {
    public static final int
            SYMBOL = 1, LEFT_PAREN = 2, RIGHT_PAREN = 3, LEFT_CURLY = 4,
            RIGHT_CURLY = 5, LEFT_BRACKET = 6,
            RIGHT_BRACKET = 7, WS = 8;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\u0004\u0000\b)\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001" +
                    "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004" +
                    "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007" +
                    "\u0007\u0007\u0001\u0000\u0004\u0000\u0013\b\u0000\u000b\u0000\f\u0000" +
                    "\u0014\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001" +
                    "\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001" +
                    "\u0006\u0001\u0007\u0004\u0007$\b\u0007\u000b\u0007\f\u0007%\u0001\u0007" +
                    "\u0001\u0007\u0000\u0000\b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004" +
                    "\t\u0005\u000b\u0006\r\u0007\u000f\b\u0001\u0000\u0002\b\u0000\t\n\r\r" +
                    "  ()[[]]{{}}\u0003\u0000\t\n\r\r  *\u0000\u0001\u0001\u0000\u0000\u0000" +
                    "\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000" +
                    "\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000" +
                    "\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f" +
                    "\u0001\u0000\u0000\u0000\u0001\u0012\u0001\u0000\u0000\u0000\u0003\u0016" +
                    "\u0001\u0000\u0000\u0000\u0005\u0018\u0001\u0000\u0000\u0000\u0007\u001a" +
                    "\u0001\u0000\u0000\u0000\t\u001c\u0001\u0000\u0000\u0000\u000b\u001e\u0001" +
                    "\u0000\u0000\u0000\r \u0001\u0000\u0000\u0000\u000f#\u0001\u0000\u0000" +
                    "\u0000\u0011\u0013\b\u0000\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000" +
                    "\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000" +
                    "\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0002\u0001\u0000\u0000\u0000" +
                    "\u0016\u0017\u0005(\u0000\u0000\u0017\u0004\u0001\u0000\u0000\u0000\u0018" +
                    "\u0019\u0005)\u0000\u0000\u0019\u0006\u0001\u0000\u0000\u0000\u001a\u001b" +
                    "\u0005{\u0000\u0000\u001b\b\u0001\u0000\u0000\u0000\u001c\u001d\u0005" +
                    "}\u0000\u0000\u001d\n\u0001\u0000\u0000\u0000\u001e\u001f\u0005[\u0000" +
                    "\u0000\u001f\f\u0001\u0000\u0000\u0000 !\u0005]\u0000\u0000!\u000e\u0001" +
                    "\u0000\u0000\u0000\"$\u0007\u0001\u0000\u0000#\"\u0001\u0000\u0000\u0000" +
                    "$%\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000" +
                    "\u0000&\'\u0001\u0000\u0000\u0000\'(\u0006\u0007\u0000\u0000(\u0010\u0001" +
                    "\u0000\u0000\u0000\u0003\u0000\u0014%\u0001\u0000\u0001\u0000";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY =
            new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    static {
        RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION);
    }

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public SExpressionLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA,
                _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "SYMBOL", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_CURLY",
                "RIGHT_CURLY", "LEFT_BRACKET",
                "RIGHT_BRACKET", "WS"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, null, "'('", "')'", "'{'", "'}'", "'['", "']'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "SYMBOL", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_CURLY",
                "RIGHT_CURLY",
                "LEFT_BRACKET", "RIGHT_BRACKET", "WS"
        };
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "SExpressionLexer.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}