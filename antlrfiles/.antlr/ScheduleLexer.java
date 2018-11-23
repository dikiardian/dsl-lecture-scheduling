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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, BasicOperator=9, 
		AssignmentOperator=10, OtherOperator=11, Kind=12, Name=13, Class=14, Dosen=15, 
		Capacity=16, Facility=17, Sks=18, Tingkat=19, Day=20, Time=21, WhiteSpace=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "BasicOperator", 
		"AssignmentOperator", "OtherOperator", "Kind", "Name", "Class", "Dosen", 
		"Capacity", "Facility", "Sks", "Tingkat", "Day", "Time", "WhiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'kapasitas'", "':'", "','", "'fasilitas'", "'sks'", "'tingkat'", 
		"')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "BasicOperator", 
		"AssignmentOperator", "OtherOperator", "Kind", "Name", "Class", "Dosen", 
		"Capacity", "Facility", "Sks", "Tingkat", "Day", "Time", "WhiteSpace"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u011e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\nk\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0098"+
		"\n\r\3\16\3\16\6\16\u009c\n\16\r\16\16\16\u009d\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\6\17\u00aa\n\17\r\17\16\17\u00ab\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00b7\n\20\r\20\16\20\u00b8\3"+
		"\20\3\20\3\21\6\21\u00be\n\21\r\21\16\21\u00bf\3\22\3\22\7\22\u00c4\n"+
		"\22\f\22\16\22\u00c7\13\22\3\22\3\22\6\22\u00cb\n\22\r\22\16\22\u00cc"+
		"\3\22\6\22\u00d0\n\22\r\22\16\22\u00d1\3\22\7\22\u00d5\n\22\f\22\16\22"+
		"\u00d8\13\22\3\22\3\22\7\22\u00dc\n\22\f\22\16\22\u00df\13\22\3\22\3\22"+
		"\6\22\u00e3\n\22\r\22\16\22\u00e4\3\22\6\22\u00e8\n\22\r\22\16\22\u00e9"+
		"\7\22\u00ec\n\22\f\22\16\22\u00ef\13\22\3\22\7\22\u00f2\n\22\f\22\16\22"+
		"\u00f5\13\22\3\22\3\22\3\23\6\23\u00fa\n\23\r\23\16\23\u00fb\3\24\6\24"+
		"\u00ff\n\24\r\24\16\24\u0100\3\25\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u010a"+
		"\n\25\r\25\16\25\u010b\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u0114\n\26\r"+
		"\26\16\26\u0115\3\27\6\27\u0119\n\27\r\27\16\27\u011a\3\27\3\27\2\2\30"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\6\3\2$$\5\2\62;C\\c|\3\2\62;\5"+
		"\2\13\f\17\17\"\"\2\u0135\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2"+
		"\2\2\rI\3\2\2\2\17M\3\2\2\2\21U\3\2\2\2\23j\3\2\2\2\25l\3\2\2\2\27s\3"+
		"\2\2\2\31\u0097\3\2\2\2\33\u0099\3\2\2\2\35\u00a1\3\2\2\2\37\u00ad\3\2"+
		"\2\2!\u00bd\3\2\2\2#\u00c1\3\2\2\2%\u00f9\3\2\2\2\'\u00fe\3\2\2\2)\u0102"+
		"\3\2\2\2+\u010d\3\2\2\2-\u0118\3\2\2\2/\60\7*\2\2\60\4\3\2\2\2\61\62\7"+
		"m\2\2\62\63\7c\2\2\63\64\7r\2\2\64\65\7c\2\2\65\66\7u\2\2\66\67\7k\2\2"+
		"\678\7v\2\289\7c\2\29:\7u\2\2:\6\3\2\2\2;<\7<\2\2<\b\3\2\2\2=>\7.\2\2"+
		">\n\3\2\2\2?@\7h\2\2@A\7c\2\2AB\7u\2\2BC\7k\2\2CD\7n\2\2DE\7k\2\2EF\7"+
		"v\2\2FG\7c\2\2GH\7u\2\2H\f\3\2\2\2IJ\7u\2\2JK\7m\2\2KL\7u\2\2L\16\3\2"+
		"\2\2MN\7v\2\2NO\7k\2\2OP\7p\2\2PQ\7i\2\2QR\7m\2\2RS\7c\2\2ST\7v\2\2T\20"+
		"\3\2\2\2UV\7+\2\2V\22\3\2\2\2WX\7C\2\2XY\7F\2\2Yk\7F\2\2Z[\7F\2\2[\\\7"+
		"G\2\2\\]\7N\2\2]^\7G\2\2^_\7V\2\2_k\7G\2\2`a\7W\2\2ab\7R\2\2bc\7F\2\2"+
		"cd\7C\2\2de\7V\2\2ek\7G\2\2fg\7U\2\2gh\7J\2\2hi\7Q\2\2ik\7Y\2\2jW\3\2"+
		"\2\2jZ\3\2\2\2j`\3\2\2\2jf\3\2\2\2k\24\3\2\2\2lm\7C\2\2mn\7U\2\2no\7U"+
		"\2\2op\7K\2\2pq\7I\2\2qr\7P\2\2r\26\3\2\2\2st\7G\2\2tu\7Z\2\2uv\7K\2\2"+
		"vw\7V\2\2w\30\3\2\2\2xy\7F\2\2yz\7Q\2\2z{\7U\2\2{|\7G\2\2|\u0098\7P\2"+
		"\2}~\7T\2\2~\177\7W\2\2\177\u0080\7C\2\2\u0080\u0081\7P\2\2\u0081\u0082"+
		"\7I\2\2\u0082\u0083\7C\2\2\u0083\u0098\7P\2\2\u0084\u0085\7H\2\2\u0085"+
		"\u0086\7C\2\2\u0086\u0087\7U\2\2\u0087\u0088\7K\2\2\u0088\u0089\7N\2\2"+
		"\u0089\u008a\7K\2\2\u008a\u008b\7V\2\2\u008b\u008c\7C\2\2\u008c\u0098"+
		"\7U\2\2\u008d\u008e\7O\2\2\u008e\u008f\7C\2\2\u008f\u0090\7V\2\2\u0090"+
		"\u0091\7C\2\2\u0091\u0092\7M\2\2\u0092\u0093\7W\2\2\u0093\u0094\7N\2\2"+
		"\u0094\u0095\7K\2\2\u0095\u0096\7C\2\2\u0096\u0098\7J\2\2\u0097x\3\2\2"+
		"\2\u0097}\3\2\2\2\u0097\u0084\3\2\2\2\u0097\u008d\3\2\2\2\u0098\32\3\2"+
		"\2\2\u0099\u009b\7$\2\2\u009a\u009c\n\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a0\7$\2\2\u00a0\34\3\2\2\2\u00a1\u00a2\7m\2\2\u00a2\u00a3"+
		"\7g\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7u\2\2\u00a6"+
		"\u00a7\7<\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00aa\t\3\2\2\u00a9\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\36\3\2\2\2\u00ad\u00ae\7f\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7u\2\2\u00b0"+
		"\u00b1\7g\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7<\2\2\u00b3\u00b4\3\2\2"+
		"\2\u00b4\u00b6\7$\2\2\u00b5\u00b7\n\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\7$\2\2\u00bb \3\2\2\2\u00bc\u00be\t\4\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\"\3\2\2\2"+
		"\u00c1\u00c5\7]\2\2\u00c2\u00c4\5-\27\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00cf\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00ca\7$\2\2\u00c9\u00cb\n\2\2\2\u00ca\u00c9\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d0\7$\2\2\u00cf\u00c8\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00ed\3\2\2\2\u00d3"+
		"\u00d5\5-\27\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00dd\7.\2\2\u00da\u00dc\5-\27\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e7\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e2\7$\2\2\u00e1\u00e3\n\2\2\2\u00e2\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e8\7$\2\2\u00e7\u00e0\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00d6\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00f3\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\5-\27\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7_\2\2\u00f7"+
		"$\3\2\2\2\u00f8\u00fa\t\4\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2"+
		"\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc&\3\2\2\2\u00fd\u00ff\t"+
		"\4\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101(\3\2\2\2\u0102\u0103\7j\2\2\u0103\u0104\7c\2\2\u0104"+
		"\u0105\7t\2\2\u0105\u0106\7k\2\2\u0106\u0107\7<\2\2\u0107\u0109\3\2\2"+
		"\2\u0108\u010a\t\4\2\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c*\3\2\2\2\u010d\u010e\7l\2\2\u010e\u010f"+
		"\7c\2\2\u010f\u0110\7o\2\2\u0110\u0111\7<\2\2\u0111\u0113\3\2\2\2\u0112"+
		"\u0114\t\4\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116,\3\2\2\2\u0117\u0119\t\5\2\2\u0118\u0117"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011d\b\27\2\2\u011d.\3\2\2\2\27\2j\u0097\u009d\u00ab"+
		"\u00b8\u00bf\u00c5\u00cc\u00d1\u00d6\u00dd\u00e4\u00e9\u00ed\u00f3\u00fb"+
		"\u0100\u010b\u0115\u011a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}