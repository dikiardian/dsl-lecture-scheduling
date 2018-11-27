// Generated from /home/diki/kuliah/rplsd/tugas dsl/dsl-lecture-scheduling/antlrfiles/Schedule.g4 by ANTLR 4.7.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, BasicOperator=15, AssignmentOperator=16, 
		OtherOperator=17, Kind=18, String=19, Integer=20, ArrayOfString=21, WhiteSpace=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "BasicOperator", "AssignmentOperator", 
		"OtherOperator", "Kind", "String", "Integer", "ArrayOfString", "WhiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'nama'", "':'", "','", "'kapasitas'", "'fasilitas'", "'sks'", 
		"'tingkat'", "')'", "'ruang'", "'dosen'", "'hari'", "'jam'", "'durasi'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "BasicOperator", "AssignmentOperator", "OtherOperator", 
		"Kind", "String", "Integer", "ArrayOfString", "WhiteSpace"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0117\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u008c\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u009a\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00a4\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00cb\n\23\3\24\3\24\6\24\u00cf\n\24\r\24\16"+
		"\24\u00d0\3\24\3\24\3\25\6\25\u00d6\n\25\r\25\16\25\u00d7\3\26\3\26\7"+
		"\26\u00dc\n\26\f\26\16\26\u00df\13\26\3\26\3\26\6\26\u00e3\n\26\r\26\16"+
		"\26\u00e4\3\26\6\26\u00e8\n\26\r\26\16\26\u00e9\3\26\7\26\u00ed\n\26\f"+
		"\26\16\26\u00f0\13\26\3\26\3\26\7\26\u00f4\n\26\f\26\16\26\u00f7\13\26"+
		"\3\26\3\26\6\26\u00fb\n\26\r\26\16\26\u00fc\3\26\6\26\u0100\n\26\r\26"+
		"\16\26\u0101\7\26\u0104\n\26\f\26\16\26\u0107\13\26\3\26\7\26\u010a\n"+
		"\26\f\26\16\26\u010d\13\26\3\26\3\26\3\27\6\27\u0112\n\27\r\27\16\27\u0113"+
		"\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\5\3\2$$\3\2\62"+
		";\5\2\13\f\17\17\"\"\2\u012b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\66\3\2\2\2\t8\3\2\2\2\13:"+
		"\3\2\2\2\rD\3\2\2\2\17N\3\2\2\2\21R\3\2\2\2\23Z\3\2\2\2\25\\\3\2\2\2\27"+
		"b\3\2\2\2\31h\3\2\2\2\33m\3\2\2\2\35q\3\2\2\2\37\u008b\3\2\2\2!\u0099"+
		"\3\2\2\2#\u00a3\3\2\2\2%\u00ca\3\2\2\2\'\u00cc\3\2\2\2)\u00d5\3\2\2\2"+
		"+\u00d9\3\2\2\2-\u0111\3\2\2\2/\60\7*\2\2\60\4\3\2\2\2\61\62\7p\2\2\62"+
		"\63\7c\2\2\63\64\7o\2\2\64\65\7c\2\2\65\6\3\2\2\2\66\67\7<\2\2\67\b\3"+
		"\2\2\289\7.\2\29\n\3\2\2\2:;\7m\2\2;<\7c\2\2<=\7r\2\2=>\7c\2\2>?\7u\2"+
		"\2?@\7k\2\2@A\7v\2\2AB\7c\2\2BC\7u\2\2C\f\3\2\2\2DE\7h\2\2EF\7c\2\2FG"+
		"\7u\2\2GH\7k\2\2HI\7n\2\2IJ\7k\2\2JK\7v\2\2KL\7c\2\2LM\7u\2\2M\16\3\2"+
		"\2\2NO\7u\2\2OP\7m\2\2PQ\7u\2\2Q\20\3\2\2\2RS\7v\2\2ST\7k\2\2TU\7p\2\2"+
		"UV\7i\2\2VW\7m\2\2WX\7c\2\2XY\7v\2\2Y\22\3\2\2\2Z[\7+\2\2[\24\3\2\2\2"+
		"\\]\7t\2\2]^\7w\2\2^_\7c\2\2_`\7p\2\2`a\7i\2\2a\26\3\2\2\2bc\7f\2\2cd"+
		"\7q\2\2de\7u\2\2ef\7g\2\2fg\7p\2\2g\30\3\2\2\2hi\7j\2\2ij\7c\2\2jk\7t"+
		"\2\2kl\7k\2\2l\32\3\2\2\2mn\7l\2\2no\7c\2\2op\7o\2\2p\34\3\2\2\2qr\7f"+
		"\2\2rs\7w\2\2st\7t\2\2tu\7c\2\2uv\7u\2\2vw\7k\2\2w\36\3\2\2\2xy\7C\2\2"+
		"yz\7F\2\2z\u008c\7F\2\2{|\7F\2\2|}\7G\2\2}~\7N\2\2~\177\7G\2\2\177\u0080"+
		"\7V\2\2\u0080\u008c\7G\2\2\u0081\u0082\7W\2\2\u0082\u0083\7R\2\2\u0083"+
		"\u0084\7F\2\2\u0084\u0085\7C\2\2\u0085\u0086\7V\2\2\u0086\u008c\7G\2\2"+
		"\u0087\u0088\7U\2\2\u0088\u0089\7J\2\2\u0089\u008a\7Q\2\2\u008a\u008c"+
		"\7Y\2\2\u008bx\3\2\2\2\u008b{\3\2\2\2\u008b\u0081\3\2\2\2\u008b\u0087"+
		"\3\2\2\2\u008c \3\2\2\2\u008d\u008e\7C\2\2\u008e\u008f\7U\2\2\u008f\u0090"+
		"\7U\2\2\u0090\u0091\7K\2\2\u0091\u0092\7I\2\2\u0092\u009a\7P\2\2\u0093"+
		"\u0094\7T\2\2\u0094\u0095\7G\2\2\u0095\u0096\7O\2\2\u0096\u0097\7Q\2\2"+
		"\u0097\u0098\7X\2\2\u0098\u009a\7G\2\2\u0099\u008d\3\2\2\2\u0099\u0093"+
		"\3\2\2\2\u009a\"\3\2\2\2\u009b\u009c\7G\2\2\u009c\u009d\7Z\2\2\u009d\u009e"+
		"\7K\2\2\u009e\u00a4\7V\2\2\u009f\u00a0\7J\2\2\u00a0\u00a1\7G\2\2\u00a1"+
		"\u00a2\7N\2\2\u00a2\u00a4\7R\2\2\u00a3\u009b\3\2\2\2\u00a3\u009f\3\2\2"+
		"\2\u00a4$\3\2\2\2\u00a5\u00a6\7F\2\2\u00a6\u00a7\7Q\2\2\u00a7\u00a8\7"+
		"U\2\2\u00a8\u00a9\7G\2\2\u00a9\u00cb\7P\2\2\u00aa\u00ab\7T\2\2\u00ab\u00ac"+
		"\7W\2\2\u00ac\u00ad\7C\2\2\u00ad\u00ae\7P\2\2\u00ae\u00af\7I\2\2\u00af"+
		"\u00b0\7C\2\2\u00b0\u00cb\7P\2\2\u00b1\u00b2\7H\2\2\u00b2\u00b3\7C\2\2"+
		"\u00b3\u00b4\7U\2\2\u00b4\u00b5\7K\2\2\u00b5\u00b6\7N\2\2\u00b6\u00b7"+
		"\7K\2\2\u00b7\u00b8\7V\2\2\u00b8\u00b9\7C\2\2\u00b9\u00cb\7U\2\2\u00ba"+
		"\u00bb\7O\2\2\u00bb\u00bc\7C\2\2\u00bc\u00bd\7V\2\2\u00bd\u00be\7C\2\2"+
		"\u00be\u00bf\7M\2\2\u00bf\u00c0\7W\2\2\u00c0\u00c1\7N\2\2\u00c1\u00c2"+
		"\7K\2\2\u00c2\u00c3\7C\2\2\u00c3\u00cb\7J\2\2\u00c4\u00c5\7L\2\2\u00c5"+
		"\u00c6\7C\2\2\u00c6\u00c7\7F\2\2\u00c7\u00c8\7Y\2\2\u00c8\u00c9\7C\2\2"+
		"\u00c9\u00cb\7N\2\2\u00ca\u00a5\3\2\2\2\u00ca\u00aa\3\2\2\2\u00ca\u00b1"+
		"\3\2\2\2\u00ca\u00ba\3\2\2\2\u00ca\u00c4\3\2\2\2\u00cb&\3\2\2\2\u00cc"+
		"\u00ce\7$\2\2\u00cd\u00cf\n\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\7$\2\2\u00d3(\3\2\2\2\u00d4\u00d6\t\3\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8*\3\2\2\2"+
		"\u00d9\u00dd\7]\2\2\u00da\u00dc\5-\27\2\u00db\u00da\3\2\2\2\u00dc\u00df"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e7\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e2\7$\2\2\u00e1\u00e3\n\2\2\2\u00e2\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e8\7$\2\2\u00e7\u00e0\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u0105\3\2\2\2\u00eb"+
		"\u00ed\5-\27\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1"+
		"\u00f5\7.\2\2\u00f2\u00f4\5-\27\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00ff\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00fa\7$\2\2\u00f9\u00fb\n\2\2\2\u00fa\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0100\7$\2\2\u00ff\u00f8\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103"+
		"\u00ee\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u010b\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010a\5-\27\2\u0109"+
		"\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7_\2\2\u010f"+
		",\3\2\2\2\u0110\u0112\t\4\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2"+
		"\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116"+
		"\b\27\2\2\u0116.\3\2\2\2\23\2\u008b\u0099\u00a3\u00ca\u00d0\u00d7\u00dd"+
		"\u00e4\u00e9\u00ee\u00f5\u00fc\u0101\u0105\u010b\u0113\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}