// Generated from antlrfiles/Schedule.g4 by ANTLR 4.7.1
package antlrfiles;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScheduleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, BasicOperator=14, AssignmentOperator=15, 
		OtherOperator=16, Kind=17, Name=18, Class=19, Dosen=20, Capacity=21, Facility=22, 
		Sks=23, Tingkat=24, Day=25, Time=26, WhiteSpace=27;
	public static final int
		RULE_model = 0, RULE_assign = 1, RULE_end = 2;
	public static final String[] ruleNames = {
		"model", "assign", "end"
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

	@Override
	public String getGrammarFileName() { return "Schedule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ScheduleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModelContext extends ParserRuleContext {
		public TerminalNode BasicOperator() { return getToken(ScheduleParser.BasicOperator, 0); }
		public TerminalNode Kind() { return getToken(ScheduleParser.Kind, 0); }
		public List<TerminalNode> Name() { return getTokens(ScheduleParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(ScheduleParser.Name, i);
		}
		public List<TerminalNode> Capacity() { return getTokens(ScheduleParser.Capacity); }
		public TerminalNode Capacity(int i) {
			return getToken(ScheduleParser.Capacity, i);
		}
		public List<TerminalNode> Facility() { return getTokens(ScheduleParser.Facility); }
		public TerminalNode Facility(int i) {
			return getToken(ScheduleParser.Facility, i);
		}
		public List<TerminalNode> Sks() { return getTokens(ScheduleParser.Sks); }
		public TerminalNode Sks(int i) {
			return getToken(ScheduleParser.Sks, i);
		}
		public List<TerminalNode> Tingkat() { return getTokens(ScheduleParser.Tingkat); }
		public TerminalNode Tingkat(int i) {
			return getToken(ScheduleParser.Tingkat, i);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitModel(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			match(BasicOperator);
			setState(7);
			match(Kind);
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Name) {
				{
				setState(8);
				match(Name);
				}
			}

			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(11);
				match(T__0);
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(12);
					match(T__1);
					setState(13);
					match(T__2);
					setState(14);
					match(Name);
					}
				}

				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(17);
					match(T__3);
					setState(18);
					match(T__2);
					setState(19);
					match(Capacity);
					}
				}

				setState(26);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(22);
					match(T__4);
					setState(23);
					match(T__5);
					setState(24);
					match(T__2);
					setState(25);
					match(Facility);
					}
					break;
				}
				setState(32);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(28);
					match(T__4);
					setState(29);
					match(T__6);
					setState(30);
					match(T__2);
					setState(31);
					match(Sks);
					}
					break;
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(34);
					match(T__4);
					setState(35);
					match(T__7);
					setState(36);
					match(T__2);
					setState(37);
					match(Tingkat);
					}
				}

				setState(40);
				match(T__8);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode AssignmentOperator() { return getToken(ScheduleParser.AssignmentOperator, 0); }
		public TerminalNode Class() { return getToken(ScheduleParser.Class, 0); }
		public TerminalNode Dosen() { return getToken(ScheduleParser.Dosen, 0); }
		public TerminalNode Day() { return getToken(ScheduleParser.Day, 0); }
		public TerminalNode Time() { return getToken(ScheduleParser.Time, 0); }
		public TerminalNode Name() { return getToken(ScheduleParser.Name, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(AssignmentOperator);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Name) {
				{
				setState(47);
				match(Name);
				}
			}

			{
			setState(50);
			match(T__0);
			setState(51);
			match(T__9);
			setState(52);
			match(T__2);
			setState(53);
			match(Class);
			setState(54);
			match(T__4);
			setState(55);
			match(T__10);
			setState(56);
			match(T__2);
			setState(57);
			match(Dosen);
			setState(58);
			match(T__4);
			setState(59);
			match(T__11);
			setState(60);
			match(T__2);
			setState(61);
			match(Day);
			setState(62);
			match(T__4);
			setState(63);
			match(T__12);
			setState(64);
			match(T__2);
			setState(65);
			match(Time);
			setState(66);
			match(T__8);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndContext extends ParserRuleContext {
		public TerminalNode OtherOperator() { return getToken(ScheduleParser.OtherOperator, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScheduleListener ) ((ScheduleListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(OtherOperator);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35I\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\5\2\f\n\2\3\2\3\2\3\2\3\2\5\2\22\n\2\3\2\3\2\3"+
		"\2\5\2\27\n\2\3\2\3\2\3\2\3\2\5\2\35\n\2\3\2\3\2\3\2\3\2\5\2#\n\2\3\2"+
		"\3\2\3\2\3\2\5\2)\n\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\3\3\5\3\63\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2M\2\b\3\2\2\2\4\60\3\2\2\2\6F\3\2\2\2\b"+
		"\t\7\20\2\2\t\13\7\23\2\2\n\f\7\24\2\2\13\n\3\2\2\2\13\f\3\2\2\2\f-\3"+
		"\2\2\2\r\21\7\3\2\2\16\17\7\4\2\2\17\20\7\5\2\2\20\22\7\24\2\2\21\16\3"+
		"\2\2\2\21\22\3\2\2\2\22\26\3\2\2\2\23\24\7\6\2\2\24\25\7\5\2\2\25\27\7"+
		"\27\2\2\26\23\3\2\2\2\26\27\3\2\2\2\27\34\3\2\2\2\30\31\7\7\2\2\31\32"+
		"\7\b\2\2\32\33\7\5\2\2\33\35\7\30\2\2\34\30\3\2\2\2\34\35\3\2\2\2\35\""+
		"\3\2\2\2\36\37\7\7\2\2\37 \7\t\2\2 !\7\5\2\2!#\7\31\2\2\"\36\3\2\2\2\""+
		"#\3\2\2\2#(\3\2\2\2$%\7\7\2\2%&\7\n\2\2&\'\7\5\2\2\')\7\32\2\2($\3\2\2"+
		"\2()\3\2\2\2)*\3\2\2\2*,\7\13\2\2+\r\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2"+
		"\2\2.\3\3\2\2\2/-\3\2\2\2\60\62\7\21\2\2\61\63\7\24\2\2\62\61\3\2\2\2"+
		"\62\63\3\2\2\2\63\64\3\2\2\2\64\65\7\3\2\2\65\66\7\f\2\2\66\67\7\5\2\2"+
		"\678\7\25\2\289\7\7\2\29:\7\r\2\2:;\7\5\2\2;<\7\26\2\2<=\7\7\2\2=>\7\16"+
		"\2\2>?\7\5\2\2?@\7\33\2\2@A\7\7\2\2AB\7\17\2\2BC\7\5\2\2CD\7\34\2\2DE"+
		"\7\13\2\2E\5\3\2\2\2FG\7\22\2\2G\7\3\2\2\2\n\13\21\26\34\"(-\62";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}