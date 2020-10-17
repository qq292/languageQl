// Generated from Expr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ADDADD=11, SUBSUB=12, MUL=13, DIV=14, ADD=15, SUB=16, MOULD=17, 
		DEF=18, RETURN=19, IF=20, EQUAL=21, LESS=22, GREATER=23, UNEQUAL=24, GREATER_EQUAL=25, 
		LESS_EQUAL=26, WHILE=27, FOR=28, BREAK=29, NULL=30, TRUE=31, FALSE=32, 
		ID=33, INT=34, STRING=35, NOTES=36, LINE_NOTES=37, WS=38;
	public static final int
		RULE_file = 0, RULE_callDecl = 1, RULE_varDecl = 2, RULE_functionDecl = 3, 
		RULE_agsList = 4, RULE_d_block = 5, RULE_d_stat = 6, RULE_whilei = 7, 
		RULE_d_if = 8, RULE_d_elseif = 9, RULE_d_else = 10, RULE_d_for = 11, RULE_expr = 12, 
		RULE_exprList = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "callDecl", "varDecl", "functionDecl", "agsList", "d_block", 
			"d_stat", "whilei", "d_if", "d_elseif", "d_else", "d_for", "expr", "exprList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "','", "'{'", "'}'", "'elseif'", "'else'", 
			"';'", "'**'", "'++'", "'--'", "'*'", "'/'", "'+'", "'-'", "'%'", "'def'", 
			"'return'", "'if'", "'=='", "'<'", "'>'", "'!='", "'>='", "'<='", "'while'", 
			"'for'", "'break'", "'null'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ADDADD", 
			"SUBSUB", "MUL", "DIV", "ADD", "SUB", "MOULD", "DEF", "RETURN", "IF", 
			"EQUAL", "LESS", "GREATER", "UNEQUAL", "GREATER_EQUAL", "LESS_EQUAL", 
			"WHILE", "FOR", "BREAK", "NULL", "TRUE", "FALSE", "ID", "INT", "STRING", 
			"NOTES", "LINE_NOTES", "WS"
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

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<D_ifContext> d_if() {
			return getRuleContexts(D_ifContext.class);
		}
		public D_ifContext d_if(int i) {
			return getRuleContext(D_ifContext.class,i);
		}
		public List<CallDeclContext> callDecl() {
			return getRuleContexts(CallDeclContext.class);
		}
		public CallDeclContext callDecl(int i) {
			return getRuleContext(CallDeclContext.class,i);
		}
		public List<WhileiContext> whilei() {
			return getRuleContexts(WhileiContext.class);
		}
		public WhileiContext whilei(int i) {
			return getRuleContext(WhileiContext.class,i);
		}
		public List<D_forContext> d_for() {
			return getRuleContexts(D_forContext.class);
		}
		public D_forContext d_for(int i) {
			return getRuleContext(D_forContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				setState(34);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(28);
					varDecl();
					}
					break;
				case 2:
					{
					setState(29);
					functionDecl();
					}
					break;
				case 3:
					{
					setState(30);
					d_if();
					}
					break;
				case 4:
					{
					setState(31);
					callDecl();
					}
					break;
				case 5:
					{
					setState(32);
					whilei();
					}
					break;
				case 6:
					{
					setState(33);
					d_for();
					}
					break;
				}
				}
				setState(38);
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

	public static class CallDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public CallDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitCallDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallDeclContext callDecl() throws RecognitionException {
		CallDeclContext _localctx = new CallDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_callDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(ID);
			setState(40);
			match(T__0);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ADD) | (1L << SUB) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(41);
				exprList();
				}
			}

			setState(44);
			match(T__1);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(ID);
			setState(47);
			match(T__2);
			setState(48);
			expr(0);
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(ExprParser.DEF, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public D_blockContext d_block() {
			return getRuleContext(D_blockContext.class,0);
		}
		public AgsListContext agsList() {
			return getRuleContext(AgsListContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(DEF);
			setState(51);
			match(ID);
			setState(52);
			match(T__0);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(53);
				agsList();
				}
			}

			setState(56);
			match(T__1);
			setState(57);
			d_block();
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

	public static class AgsListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public AgsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agsList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAgsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AgsListContext agsList() throws RecognitionException {
		AgsListContext _localctx = new AgsListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_agsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ID);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(60);
				match(T__3);
				setState(61);
				match(ID);
				}
				}
				setState(66);
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

	public static class D_blockContext extends ParserRuleContext {
		public List<D_statContext> d_stat() {
			return getRuleContexts(D_statContext.class);
		}
		public D_statContext d_stat(int i) {
			return getRuleContext(D_statContext.class,i);
		}
		public D_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitD_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final D_blockContext d_block() throws RecognitionException {
		D_blockContext _localctx = new D_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_d_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__4);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << ID))) != 0)) {
				{
				{
				setState(68);
				d_stat();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(T__5);
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

	public static class D_statContext extends ParserRuleContext {
		public D_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d_stat; }
	 
		public D_statContext() { }
		public void copyFrom(D_statContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class D_callDeclContext extends D_statContext {
		public CallDeclContext callDecl() {
			return getRuleContext(CallDeclContext.class,0);
		}
		public D_callDeclContext(D_statContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitD_callDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class D_formContext extends D_statContext {
		public D_forContext d_for() {
			return getRuleContext(D_forContext.class,0);
		}
		public D_formContext(D_statContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitD_form(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IbreakContext extends D_statContext {
		public TerminalNode BREAK() { return getToken(ExprParser.BREAK, 0); }
		public IbreakContext(D_statContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitIbreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends D_statContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public AssignmentContext(D_statContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class D_ifmContext extends D_statContext {
		public D_ifContext d_if() {
			return getRuleContext(D_ifContext.class,0);
		}
		public D_ifmContext(D_statContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitD_ifm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends D_statContext {
		public TerminalNode RETURN() { return getToken(ExprParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(D_statContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class D_whileContext extends D_statContext {
		public WhileiContext whilei() {
			return getRuleContext(WhileiContext.class,0);
		}
		public D_whileContext(D_statContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitD_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final D_statContext d_stat() throws RecognitionException {
		D_statContext _localctx = new D_statContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_d_stat);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new D_callDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				callDecl();
				}
				break;
			case 2:
				_localctx = new D_formContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				d_for();
				}
				break;
			case 3:
				_localctx = new D_whileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				whilei();
				}
				break;
			case 4:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				varDecl();
				}
				break;
			case 5:
				_localctx = new D_ifmContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				d_if();
				}
				break;
			case 6:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				match(RETURN);
				setState(83);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(82);
					expr(0);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new IbreakContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				match(BREAK);
				}
				break;
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

	public static class WhileiContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ExprParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public D_blockContext d_block() {
			return getRuleContext(D_blockContext.class,0);
		}
		public WhileiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilei; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitWhilei(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileiContext whilei() throws RecognitionException {
		WhileiContext _localctx = new WhileiContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whilei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(WHILE);
			setState(89);
			match(T__0);
			setState(90);
			expr(0);
			setState(91);
			match(T__1);
			setState(92);
			d_block();
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

	public static class D_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public D_blockContext d_block() {
			return getRuleContext(D_blockContext.class,0);
		}
		public List<D_elseifContext> d_elseif() {
			return getRuleContexts(D_elseifContext.class);
		}
		public D_elseifContext d_elseif(int i) {
			return getRuleContext(D_elseifContext.class,i);
		}
		public D_elseContext d_else() {
			return getRuleContext(D_elseContext.class,0);
		}
		public D_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d_if; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitD_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final D_ifContext d_if() throws RecognitionException {
		D_ifContext _localctx = new D_ifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_d_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(IF);
			setState(95);
			match(T__0);
			setState(96);
			expr(0);
			setState(97);
			match(T__1);
			setState(98);
			d_block();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(99);
				d_elseif();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(105);
				d_else();
				}
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

	public static class D_elseifContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public D_blockContext d_block() {
			return getRuleContext(D_blockContext.class,0);
		}
		public D_elseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d_elseif; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitD_elseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final D_elseifContext d_elseif() throws RecognitionException {
		D_elseifContext _localctx = new D_elseifContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_d_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__6);
			setState(109);
			match(T__0);
			setState(110);
			expr(0);
			setState(111);
			match(T__1);
			setState(112);
			d_block();
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

	public static class D_elseContext extends ParserRuleContext {
		public D_blockContext d_block() {
			return getRuleContext(D_blockContext.class,0);
		}
		public D_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d_else; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitD_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final D_elseContext d_else() throws RecognitionException {
		D_elseContext _localctx = new D_elseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_d_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__7);
			setState(115);
			d_block();
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

	public static class D_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ExprParser.FOR, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public D_blockContext d_block() {
			return getRuleContext(D_blockContext.class,0);
		}
		public D_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d_for; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitD_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final D_forContext d_for() throws RecognitionException {
		D_forContext _localctx = new D_forContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_d_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(FOR);
			setState(118);
			match(T__0);
			setState(119);
			varDecl();
			setState(120);
			match(T__8);
			setState(121);
			expr(0);
			setState(122);
			match(T__8);
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(123);
				varDecl();
				}
				break;
			case 2:
				{
				setState(124);
				expr(0);
				}
				break;
			}
			setState(127);
			match(T__1);
			setState(128);
			d_block();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddaddsubsubContext extends ExprContext {
		public Token op;
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode ADDADD() { return getToken(ExprParser.ADDADD, 0); }
		public TerminalNode SUBSUB() { return getToken(ExprParser.SUBSUB, 0); }
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public AddaddsubsubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAddaddsubsub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddsubnumContext extends ExprContext {
		public Token op;
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode SUB() { return getToken(ExprParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(ExprParser.ADD, 0); }
		public AddsubnumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAddsubnum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ItrueContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(ExprParser.TRUE, 0); }
		public ItrueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitItrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddsubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ExprParser.SUB, 0); }
		public AddsubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAddsub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InullContext extends ExprContext {
		public TerminalNode NULL() { return getToken(ExprParser.NULL, 0); }
		public InullContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitInull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfalseContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(ExprParser.FALSE, 0); }
		public IfalseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitIfalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MuldivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExprParser.DIV, 0); }
		public MuldivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMuldiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallContext extends ExprContext {
		public CallDeclContext callDecl() {
			return getRuleContext(CallDeclContext.class,0);
		}
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImodleContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOULD() { return getToken(ExprParser.MOULD, 0); }
		public ImodleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitImodle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelateContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(ExprParser.EQUAL, 0); }
		public TerminalNode LESS() { return getToken(ExprParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(ExprParser.GREATER, 0); }
		public TerminalNode UNEQUAL() { return getToken(ExprParser.UNEQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(ExprParser.GREATER_EQUAL, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(ExprParser.LESS_EQUAL, 0); }
		public RelateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitRelate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(131);
				callDecl();
				}
				break;
			case 2:
				{
				_localctx = new AddsubnumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				((AddsubnumContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((AddsubnumContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(133);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				_localctx = new AddaddsubsubContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				match(ID);
				setState(135);
				((AddaddsubsubContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADDADD || _la==SUBSUB) ) {
					((AddaddsubsubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(136);
					match(INT);
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new InullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(NULL);
				}
				break;
			case 5:
				{
				_localctx = new ItrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(TRUE);
				}
				break;
			case 6:
				{
				_localctx = new IfalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(FALSE);
				}
				break;
			case 7:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(INT);
				}
				break;
			case 9:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(STRING);
				}
				break;
			case 10:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(T__0);
				setState(146);
				expr(0);
				setState(147);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(166);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(152);
						match(T__9);
						setState(153);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ImodleContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(154);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(155);
						match(MOULD);
						setState(156);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new MuldivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(158);
						((MuldivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MuldivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(159);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new AddsubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(160);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(161);
						((AddsubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddsubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(162);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new RelateContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(164);
						((RelateContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << LESS) | (1L << GREATER) | (1L << UNEQUAL) | (1L << GREATER_EQUAL) | (1L << LESS_EQUAL))) != 0)) ) {
							((RelateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(165);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			expr(0);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(172);
				match(T__3);
				setState(173);
				expr(0);
				}
				}
				setState(178);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00b6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\7\2%\n"+
		"\2\f\2\16\2(\13\2\3\3\3\3\3\3\5\3-\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\5\59\n\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6A\n\6\f\6\16\6D\13\6\3\7"+
		"\3\7\7\7H\n\7\f\7\16\7K\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bV"+
		"\n\b\3\b\5\bY\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"g\n\n\f\n\16\nj\13\n\3\n\5\nm\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0080\n\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008c\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0098\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00a9\n\16\f\16\16"+
		"\16\u00ac\13\16\3\17\3\17\3\17\7\17\u00b1\n\17\f\17\16\17\u00b4\13\17"+
		"\3\17\2\3\32\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\7\3\2\21\22\3\2"+
		"#$\3\2\r\16\3\2\17\20\3\2\27\34\2\u00cb\2&\3\2\2\2\4)\3\2\2\2\6\60\3\2"+
		"\2\2\b\64\3\2\2\2\n=\3\2\2\2\fE\3\2\2\2\16X\3\2\2\2\20Z\3\2\2\2\22`\3"+
		"\2\2\2\24n\3\2\2\2\26t\3\2\2\2\30w\3\2\2\2\32\u0097\3\2\2\2\34\u00ad\3"+
		"\2\2\2\36%\5\6\4\2\37%\5\b\5\2 %\5\22\n\2!%\5\4\3\2\"%\5\20\t\2#%\5\30"+
		"\r\2$\36\3\2\2\2$\37\3\2\2\2$ \3\2\2\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2"+
		"%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\3\3\2\2\2(&\3\2\2\2)*\7#\2\2*,\7\3\2"+
		"\2+-\5\34\17\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\4\2\2/\5\3\2\2\2\60\61"+
		"\7#\2\2\61\62\7\5\2\2\62\63\5\32\16\2\63\7\3\2\2\2\64\65\7\24\2\2\65\66"+
		"\7#\2\2\668\7\3\2\2\679\5\n\6\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:;\7\4"+
		"\2\2;<\5\f\7\2<\t\3\2\2\2=B\7#\2\2>?\7\6\2\2?A\7#\2\2@>\3\2\2\2AD\3\2"+
		"\2\2B@\3\2\2\2BC\3\2\2\2C\13\3\2\2\2DB\3\2\2\2EI\7\7\2\2FH\5\16\b\2GF"+
		"\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\b\2\2M"+
		"\r\3\2\2\2NY\5\4\3\2OY\5\30\r\2PY\5\20\t\2QY\5\6\4\2RY\5\22\n\2SU\7\25"+
		"\2\2TV\5\32\16\2UT\3\2\2\2UV\3\2\2\2VY\3\2\2\2WY\7\37\2\2XN\3\2\2\2XO"+
		"\3\2\2\2XP\3\2\2\2XQ\3\2\2\2XR\3\2\2\2XS\3\2\2\2XW\3\2\2\2Y\17\3\2\2\2"+
		"Z[\7\35\2\2[\\\7\3\2\2\\]\5\32\16\2]^\7\4\2\2^_\5\f\7\2_\21\3\2\2\2`a"+
		"\7\26\2\2ab\7\3\2\2bc\5\32\16\2cd\7\4\2\2dh\5\f\7\2eg\5\24\13\2fe\3\2"+
		"\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2km\5\26\f\2lk\3"+
		"\2\2\2lm\3\2\2\2m\23\3\2\2\2no\7\t\2\2op\7\3\2\2pq\5\32\16\2qr\7\4\2\2"+
		"rs\5\f\7\2s\25\3\2\2\2tu\7\n\2\2uv\5\f\7\2v\27\3\2\2\2wx\7\36\2\2xy\7"+
		"\3\2\2yz\5\6\4\2z{\7\13\2\2{|\5\32\16\2|\177\7\13\2\2}\u0080\5\6\4\2~"+
		"\u0080\5\32\16\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082"+
		"\7\4\2\2\u0082\u0083\5\f\7\2\u0083\31\3\2\2\2\u0084\u0085\b\16\1\2\u0085"+
		"\u0098\5\4\3\2\u0086\u0087\t\2\2\2\u0087\u0098\t\3\2\2\u0088\u0089\7#"+
		"\2\2\u0089\u008b\t\4\2\2\u008a\u008c\7$\2\2\u008b\u008a\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u0098\3\2\2\2\u008d\u0098\7 \2\2\u008e\u0098\7!\2"+
		"\2\u008f\u0098\7\"\2\2\u0090\u0098\7#\2\2\u0091\u0098\7$\2\2\u0092\u0098"+
		"\7%\2\2\u0093\u0094\7\3\2\2\u0094\u0095\5\32\16\2\u0095\u0096\7\4\2\2"+
		"\u0096\u0098\3\2\2\2\u0097\u0084\3\2\2\2\u0097\u0086\3\2\2\2\u0097\u0088"+
		"\3\2\2\2\u0097\u008d\3\2\2\2\u0097\u008e\3\2\2\2\u0097\u008f\3\2\2\2\u0097"+
		"\u0090\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0093\3\2"+
		"\2\2\u0098\u00aa\3\2\2\2\u0099\u009a\f\16\2\2\u009a\u009b\7\f\2\2\u009b"+
		"\u00a9\5\32\16\16\u009c\u009d\f\r\2\2\u009d\u009e\7\23\2\2\u009e\u00a9"+
		"\5\32\16\16\u009f\u00a0\f\f\2\2\u00a0\u00a1\t\5\2\2\u00a1\u00a9\5\32\16"+
		"\r\u00a2\u00a3\f\13\2\2\u00a3\u00a4\t\2\2\2\u00a4\u00a9\5\32\16\f\u00a5"+
		"\u00a6\f\n\2\2\u00a6\u00a7\t\6\2\2\u00a7\u00a9\5\32\16\13\u00a8\u0099"+
		"\3\2\2\2\u00a8\u009c\3\2\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a8"+
		"\u00a5\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\33\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b2\5\32\16\2\u00ae"+
		"\u00af\7\6\2\2\u00af\u00b1\5\32\16\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3"+
		"\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\35\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\22$&,8BIUXhl\177\u008b\u0097\u00a8\u00aa\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}