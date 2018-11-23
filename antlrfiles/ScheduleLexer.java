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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, BasicOperator=14, AssignmentOperator=15, 
		OtherOperator=16, Kind=17, Name=18, Class=19, Dosen=20, Capacity=21, Facility=22, 
		Sks=23, Tingkat=24, Day=25, Time=26, WhiteSpace=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "BasicOperator", "AssignmentOperator", 
		"OtherOperator", "Kind", "Name", "Class", "Dosen", "Capacity", "Facility", 
		"Sks", "Tingkat", "Day", "Time", "WhiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'nama'", "':'", "'kapasitas'", "','", "'fasilitas'", "'sks'", 
		"'tingkat'", "')'", "'kelas'", "'dosen'", "'hari'", "'jam'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "BasicOperator", "AssignmentOperator", "OtherOperator", "Kind", 
		"Name", "Class", "Dosen", "Capacity", "Facility", "Sks", "Tingkat", "Day", 
		"Time", "WhiteSpace"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u0132\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008f\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c2\n\22\3\23\3\23\6\23\u00c6"+
		"\n\23\r\23\16\23\u00c7\3\23\3\23\3\24\3\24\6\24\u00ce\n\24\r\24\16\24"+
		"\u00cf\3\24\3\24\3\25\3\25\6\25\u00d6\n\25\r\25\16\25\u00d7\3\25\3\25"+
		"\3\26\6\26\u00dd\n\26\r\26\16\26\u00de\3\27\3\27\7\27\u00e3\n\27\f\27"+
		"\16\27\u00e6\13\27\3\27\3\27\6\27\u00ea\n\27\r\27\16\27\u00eb\3\27\6\27"+
		"\u00ef\n\27\r\27\16\27\u00f0\3\27\7\27\u00f4\n\27\f\27\16\27\u00f7\13"+
		"\27\3\27\3\27\7\27\u00fb\n\27\f\27\16\27\u00fe\13\27\3\27\3\27\6\27\u0102"+
		"\n\27\r\27\16\27\u0103\3\27\6\27\u0107\n\27\r\27\16\27\u0108\7\27\u010b"+
		"\n\27\f\27\16\27\u010e\13\27\3\27\7\27\u0111\n\27\f\27\16\27\u0114\13"+
		"\27\3\27\3\27\3\30\6\30\u0119\n\30\r\30\16\30\u011a\3\31\6\31\u011e\n"+
		"\31\r\31\16\31\u011f\3\32\6\32\u0123\n\32\r\32\16\32\u0124\3\33\6\33\u0128"+
		"\n\33\r\33\16\33\u0129\3\34\6\34\u012d\n\34\r\34\16\34\u012e\3\34\3\34"+
		"\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"\3\2\5\3\2$$\3\2\62;\5\2\13\f\17\17\"\"\2\u014a\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7@\3\2\2\2\tB\3"+
		"\2\2\2\13L\3\2\2\2\rN\3\2\2\2\17X\3\2\2\2\21\\\3\2\2\2\23d\3\2\2\2\25"+
		"f\3\2\2\2\27l\3\2\2\2\31r\3\2\2\2\33w\3\2\2\2\35\u008e\3\2\2\2\37\u0090"+
		"\3\2\2\2!\u0097\3\2\2\2#\u00c1\3\2\2\2%\u00c3\3\2\2\2\'\u00cb\3\2\2\2"+
		")\u00d3\3\2\2\2+\u00dc\3\2\2\2-\u00e0\3\2\2\2/\u0118\3\2\2\2\61\u011d"+
		"\3\2\2\2\63\u0122\3\2\2\2\65\u0127\3\2\2\2\67\u012c\3\2\2\29:\7*\2\2:"+
		"\4\3\2\2\2;<\7p\2\2<=\7c\2\2=>\7o\2\2>?\7c\2\2?\6\3\2\2\2@A\7<\2\2A\b"+
		"\3\2\2\2BC\7m\2\2CD\7c\2\2DE\7r\2\2EF\7c\2\2FG\7u\2\2GH\7k\2\2HI\7v\2"+
		"\2IJ\7c\2\2JK\7u\2\2K\n\3\2\2\2LM\7.\2\2M\f\3\2\2\2NO\7h\2\2OP\7c\2\2"+
		"PQ\7u\2\2QR\7k\2\2RS\7n\2\2ST\7k\2\2TU\7v\2\2UV\7c\2\2VW\7u\2\2W\16\3"+
		"\2\2\2XY\7u\2\2YZ\7m\2\2Z[\7u\2\2[\20\3\2\2\2\\]\7v\2\2]^\7k\2\2^_\7p"+
		"\2\2_`\7i\2\2`a\7m\2\2ab\7c\2\2bc\7v\2\2c\22\3\2\2\2de\7+\2\2e\24\3\2"+
		"\2\2fg\7m\2\2gh\7g\2\2hi\7n\2\2ij\7c\2\2jk\7u\2\2k\26\3\2\2\2lm\7f\2\2"+
		"mn\7q\2\2no\7u\2\2op\7g\2\2pq\7p\2\2q\30\3\2\2\2rs\7j\2\2st\7c\2\2tu\7"+
		"t\2\2uv\7k\2\2v\32\3\2\2\2wx\7l\2\2xy\7c\2\2yz\7o\2\2z\34\3\2\2\2{|\7"+
		"C\2\2|}\7F\2\2}\u008f\7F\2\2~\177\7F\2\2\177\u0080\7G\2\2\u0080\u0081"+
		"\7N\2\2\u0081\u0082\7G\2\2\u0082\u0083\7V\2\2\u0083\u008f\7G\2\2\u0084"+
		"\u0085\7W\2\2\u0085\u0086\7R\2\2\u0086\u0087\7F\2\2\u0087\u0088\7C\2\2"+
		"\u0088\u0089\7V\2\2\u0089\u008f\7G\2\2\u008a\u008b\7U\2\2\u008b\u008c"+
		"\7J\2\2\u008c\u008d\7Q\2\2\u008d\u008f\7Y\2\2\u008e{\3\2\2\2\u008e~\3"+
		"\2\2\2\u008e\u0084\3\2\2\2\u008e\u008a\3\2\2\2\u008f\36\3\2\2\2\u0090"+
		"\u0091\7C\2\2\u0091\u0092\7U\2\2\u0092\u0093\7U\2\2\u0093\u0094\7K\2\2"+
		"\u0094\u0095\7I\2\2\u0095\u0096\7P\2\2\u0096 \3\2\2\2\u0097\u0098\7G\2"+
		"\2\u0098\u0099\7Z\2\2\u0099\u009a\7K\2\2\u009a\u009b\7V\2\2\u009b\"\3"+
		"\2\2\2\u009c\u009d\7F\2\2\u009d\u009e\7Q\2\2\u009e\u009f\7U\2\2\u009f"+
		"\u00a0\7G\2\2\u00a0\u00c2\7P\2\2\u00a1\u00a2\7T\2\2\u00a2\u00a3\7W\2\2"+
		"\u00a3\u00a4\7C\2\2\u00a4\u00a5\7P\2\2\u00a5\u00a6\7I\2\2\u00a6\u00a7"+
		"\7C\2\2\u00a7\u00c2\7P\2\2\u00a8\u00a9\7H\2\2\u00a9\u00aa\7C\2\2\u00aa"+
		"\u00ab\7U\2\2\u00ab\u00ac\7K\2\2\u00ac\u00ad\7N\2\2\u00ad\u00ae\7K\2\2"+
		"\u00ae\u00af\7V\2\2\u00af\u00b0\7C\2\2\u00b0\u00c2\7U\2\2\u00b1\u00b2"+
		"\7O\2\2\u00b2\u00b3\7C\2\2\u00b3\u00b4\7V\2\2\u00b4\u00b5\7C\2\2\u00b5"+
		"\u00b6\7M\2\2\u00b6\u00b7\7W\2\2\u00b7\u00b8\7N\2\2\u00b8\u00b9\7K\2\2"+
		"\u00b9\u00ba\7C\2\2\u00ba\u00c2\7J\2\2\u00bb\u00bc\7L\2\2\u00bc\u00bd"+
		"\7C\2\2\u00bd\u00be\7F\2\2\u00be\u00bf\7Y\2\2\u00bf\u00c0\7C\2\2\u00c0"+
		"\u00c2\7N\2\2\u00c1\u009c\3\2\2\2\u00c1\u00a1\3\2\2\2\u00c1\u00a8\3\2"+
		"\2\2\u00c1\u00b1\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c2$\3\2\2\2\u00c3\u00c5"+
		"\7$\2\2\u00c4\u00c6\n\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7$"+
		"\2\2\u00ca&\3\2\2\2\u00cb\u00cd\7$\2\2\u00cc\u00ce\n\2\2\2\u00cd\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\7$\2\2\u00d2(\3\2\2\2\u00d3\u00d5\7$\2\2\u00d4"+
		"\u00d6\n\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7$\2\2\u00da"+
		"*\3\2\2\2\u00db\u00dd\t\3\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2"+
		"\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df,\3\2\2\2\u00e0\u00e4\7"+
		"]\2\2\u00e1\u00e3\5\67\34\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00ee\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e7\u00e9\7$\2\2\u00e8\u00ea\n\2\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ef\7$\2\2\u00ee\u00e7\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u010c\3\2\2\2\u00f2\u00f4\5\67"+
		"\34\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fc\7."+
		"\2\2\u00f9\u00fb\5\67\34\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0106\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00ff\u0101\7$\2\2\u0100\u0102\n\2\2\2\u0101\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0107\7$\2\2\u0106\u00ff\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u00f5\3\2"+
		"\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u0112\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0111\5\67\34\2\u0110\u010f\3"+
		"\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7_\2\2\u0116.\3\2\2\2\u0117"+
		"\u0119\t\3\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\60\3\2\2\2\u011c\u011e\t\3\2\2\u011d\u011c"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\62\3\2\2\2\u0121\u0123\t\3\2\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2"+
		"\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\64\3\2\2\2\u0126\u0128"+
		"\t\3\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\66\3\2\2\2\u012b\u012d\t\4\2\2\u012c\u012b\3\2\2"+
		"\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0131\b\34\2\2\u01318\3\2\2\2\27\2\u008e\u00c1\u00c7\u00cf"+
		"\u00d7\u00de\u00e4\u00eb\u00f0\u00f5\u00fc\u0103\u0108\u010c\u0112\u011a"+
		"\u011f\u0124\u0129\u012e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}