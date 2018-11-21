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
		BasicOperator=1, AssignmentOperator=2, OtherOperator=3, Kind=4, Name=5, 
		Facility=6, Capacity=7, Time=8, WhiteSpace=9;
	public static final int
		RULE_model = 0, RULE_assign = 1, RULE_end = 2;
	public static final String[] ruleNames = {
		"model", "assign", "end"
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
			do {
				{
				{
				setState(8);
				match(Name);
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Name );
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Capacity) {
				{
				{
				setState(13);
				match(Capacity);
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Facility) {
				{
				{
				setState(19);
				match(Facility);
				}
				}
				setState(24);
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
		public TerminalNode Time() { return getToken(ScheduleParser.Time, 0); }
		public List<TerminalNode> Name() { return getTokens(ScheduleParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(ScheduleParser.Name, i);
		}
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
			setState(25);
			match(AssignmentOperator);
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				match(Name);
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Name );
			setState(31);
			match(Time);
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
			setState(33);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13&\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\6\2\f\n\2\r\2\16\2\r\3\2\7\2\21\n\2\f\2\16\2\24"+
		"\13\2\3\2\7\2\27\n\2\f\2\16\2\32\13\2\3\3\3\3\6\3\36\n\3\r\3\16\3\37\3"+
		"\3\3\3\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2&\2\b\3\2\2\2\4\33\3\2\2\2\6#\3\2"+
		"\2\2\b\t\7\3\2\2\t\13\7\6\2\2\n\f\7\7\2\2\13\n\3\2\2\2\f\r\3\2\2\2\r\13"+
		"\3\2\2\2\r\16\3\2\2\2\16\22\3\2\2\2\17\21\7\t\2\2\20\17\3\2\2\2\21\24"+
		"\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\30\3\2\2\2\24\22\3\2\2\2\25\27"+
		"\7\b\2\2\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\3"+
		"\3\2\2\2\32\30\3\2\2\2\33\35\7\4\2\2\34\36\7\7\2\2\35\34\3\2\2\2\36\37"+
		"\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\7\n\2\2\"\5\3\2\2\2#$"+
		"\7\5\2\2$\7\3\2\2\2\6\r\22\30\37";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}