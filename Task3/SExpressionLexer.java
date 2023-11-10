// Generated from SExpressionLexer.g4 by ANTLR 4.13.1
package Task3;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Float=1, Double=2, Integer=3, Long=4, LEFT_PAREN=5, RIGHT_PAREN=6, LEFT_CURLY=7, 
		RIGHT_CURLY=8, LEFT_BRACKET=9, RIGHT_BRACKET=10, PLUS=11, MINUS=12, DIVIDE=13, 
		TIMES=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Digits", "Float", "Double", "Integer", "Long", "LongSuffix", "DoubleSuffix", 
			"FloatSuffix", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_CURLY", "RIGHT_CURLY", 
			"LEFT_BRACKET", "RIGHT_BRACKET", "PLUS", "MINUS", "DIVIDE", "TIMES", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'+'", "'-'", "'/'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Float", "Double", "Integer", "Long", "LEFT_PAREN", "RIGHT_PAREN", 
			"LEFT_CURLY", "RIGHT_CURLY", "LEFT_BRACKET", "RIGHT_BRACKET", "PLUS", 
			"MINUS", "DIVIDE", "TIMES", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
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

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SExpressionLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000f]\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0004\u0000)\b\u0000\u000b\u0000\f\u0000"+
		"*\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012X\b\u0012"+
		"\u000b\u0012\f\u0012Y\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0001"+
		"\u0000\u0003\u0001\u0005\u0002\u0007\u0003\t\u0004\u000b\u0000\r\u0000"+
		"\u000f\u0000\u0011\u0005\u0013\u0006\u0015\u0007\u0017\b\u0019\t\u001b"+
		"\n\u001d\u000b\u001f\f!\r#\u000e%\u000f\u0001\u0000\u0005\u0001\u0000"+
		"09\u0002\u0000LLll\u0002\u0000DDdd\u0002\u0000FFff\u0003\u0000\t\n\r\r"+
		"  [\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0001(\u0001\u0000\u0000\u0000\u0003,\u0001\u0000"+
		"\u0000\u0000\u00052\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000"+
		"\t9\u0001\u0000\u0000\u0000\u000b<\u0001\u0000\u0000\u0000\r>\u0001\u0000"+
		"\u0000\u0000\u000f@\u0001\u0000\u0000\u0000\u0011B\u0001\u0000\u0000\u0000"+
		"\u0013D\u0001\u0000\u0000\u0000\u0015F\u0001\u0000\u0000\u0000\u0017H"+
		"\u0001\u0000\u0000\u0000\u0019J\u0001\u0000\u0000\u0000\u001bL\u0001\u0000"+
		"\u0000\u0000\u001dN\u0001\u0000\u0000\u0000\u001fP\u0001\u0000\u0000\u0000"+
		"!R\u0001\u0000\u0000\u0000#T\u0001\u0000\u0000\u0000%W\u0001\u0000\u0000"+
		"\u0000\')\u0007\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)*\u0001\u0000"+
		"\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+\u0002"+
		"\u0001\u0000\u0000\u0000,-\u0003\u0001\u0000\u0000-.\u0005.\u0000\u0000"+
		".0\u0003\u0001\u0000\u0000/1\u0003\u000f\u0007\u00000/\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u00001\u0004\u0001\u0000\u0000\u000023\u0003"+
		"\u0001\u0000\u000034\u0005.\u0000\u000045\u0003\u0001\u0000\u000056\u0003"+
		"\r\u0006\u00006\u0006\u0001\u0000\u0000\u000078\u0003\u0001\u0000\u0000"+
		"8\b\u0001\u0000\u0000\u00009:\u0003\u0001\u0000\u0000:;\u0003\u000b\u0005"+
		"\u0000;\n\u0001\u0000\u0000\u0000<=\u0007\u0001\u0000\u0000=\f\u0001\u0000"+
		"\u0000\u0000>?\u0007\u0002\u0000\u0000?\u000e\u0001\u0000\u0000\u0000"+
		"@A\u0007\u0003\u0000\u0000A\u0010\u0001\u0000\u0000\u0000BC\u0005(\u0000"+
		"\u0000C\u0012\u0001\u0000\u0000\u0000DE\u0005)\u0000\u0000E\u0014\u0001"+
		"\u0000\u0000\u0000FG\u0005{\u0000\u0000G\u0016\u0001\u0000\u0000\u0000"+
		"HI\u0005}\u0000\u0000I\u0018\u0001\u0000\u0000\u0000JK\u0005[\u0000\u0000"+
		"K\u001a\u0001\u0000\u0000\u0000LM\u0005]\u0000\u0000M\u001c\u0001\u0000"+
		"\u0000\u0000NO\u0005+\u0000\u0000O\u001e\u0001\u0000\u0000\u0000PQ\u0005"+
		"-\u0000\u0000Q \u0001\u0000\u0000\u0000RS\u0005/\u0000\u0000S\"\u0001"+
		"\u0000\u0000\u0000TU\u0005*\u0000\u0000U$\u0001\u0000\u0000\u0000VX\u0007"+
		"\u0004\u0000\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\\\u0006\u0012\u0000\u0000\\&\u0001\u0000\u0000\u0000\u0004\u0000"+
		"*0Y\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}