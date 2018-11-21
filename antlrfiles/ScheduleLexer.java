// Generated from antlrfiles/Schedule.g4 by ANTLR 4.7.1
package antlrfiles;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScheduleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BasicOperator=1, AssignmentOperator=2, OtherOperator=3, Kind=4, Name=5, 
		Facility=6, Capacity=7, Time=8, WhiteSpace=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BasicOperator", "AssignmentOperator", "OtherOperator", "Kind", "Name", 
		"Facility", "Capacity", "Time", "WhiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BasicOperator", "AssignmentOperator", "OtherOperator", "Kind", 
		"Name", "Facility", "Capacity", "Time", "WhiteSpace"
	};
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


	public ScheduleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Schedule.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2%\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6\3\6\3\6\3\6\3\6\6\6Y\n\6\r\6\16"+
		"\6Z\3\7\3\7\3\7\3\7\3\7\6\7b\n\7\r\7\16\7c\3\b\3\b\3\b\3\b\3\b\6\bk\n"+
		"\b\r\b\16\bl\3\t\3\t\3\t\3\t\3\t\6\tt\n\t\r\t\16\tu\3\n\6\ny\n\n\r\n\16"+
		"\nz\3\n\3\n\2\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\6\5\2"+
		"\62;C\\c|\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u0087\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\3$\3\2\2\2\5&\3\2\2\2\7-\3\2\2\2\tQ\3\2\2\2"+
		"\13S\3\2\2\2\r\\\3\2\2\2\17e\3\2\2\2\21n\3\2\2\2\23x\3\2\2\2\25\26\7C"+
		"\2\2\26\27\7F\2\2\27%\7F\2\2\30\31\7F\2\2\31\32\7G\2\2\32\33\7N\2\2\33"+
		"\34\7G\2\2\34\35\7V\2\2\35%\7G\2\2\36\37\7W\2\2\37 \7R\2\2 !\7F\2\2!\""+
		"\7C\2\2\"#\7V\2\2#%\7G\2\2$\25\3\2\2\2$\30\3\2\2\2$\36\3\2\2\2%\4\3\2"+
		"\2\2&\'\7C\2\2\'(\7U\2\2()\7U\2\2)*\7K\2\2*+\7I\2\2+,\7P\2\2,\6\3\2\2"+
		"\2-.\7G\2\2./\7Z\2\2/\60\7K\2\2\60\61\7V\2\2\61\b\3\2\2\2\62\63\7F\2\2"+
		"\63\64\7Q\2\2\64\65\7U\2\2\65\66\7G\2\2\66R\7P\2\2\678\7T\2\289\7W\2\2"+
		"9:\7C\2\2:;\7P\2\2;<\7I\2\2<=\7C\2\2=R\7P\2\2>?\7H\2\2?@\7C\2\2@A\7U\2"+
		"\2AB\7K\2\2BC\7N\2\2CD\7K\2\2DE\7V\2\2EF\7C\2\2FR\7U\2\2GH\7O\2\2HI\7"+
		"C\2\2IJ\7V\2\2JK\7C\2\2KL\7M\2\2LM\7W\2\2MN\7N\2\2NO\7K\2\2OP\7C\2\2P"+
		"R\7J\2\2Q\62\3\2\2\2Q\67\3\2\2\2Q>\3\2\2\2QG\3\2\2\2R\n\3\2\2\2ST\7/\2"+
		"\2TU\7p\2\2UV\7\"\2\2VX\3\2\2\2WY\t\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2"+
		"\2Z[\3\2\2\2[\f\3\2\2\2\\]\7/\2\2]^\7h\2\2^_\7\"\2\2_a\3\2\2\2`b\t\3\2"+
		"\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\16\3\2\2\2ef\7/\2\2fg\7e\2"+
		"\2gh\7\"\2\2hj\3\2\2\2ik\t\4\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2"+
		"\2m\20\3\2\2\2no\7/\2\2op\7v\2\2pq\7\"\2\2qs\3\2\2\2rt\t\4\2\2sr\3\2\2"+
		"\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\22\3\2\2\2wy\t\5\2\2xw\3\2\2\2yz\3\2"+
		"\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\n\2\2}\24\3\2\2\2\n\2$QZcluz\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}