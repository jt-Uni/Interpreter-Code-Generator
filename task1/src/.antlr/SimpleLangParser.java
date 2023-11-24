// Generated from c:/Users/James/projects/Interpreter-Code-Generator/task1/src/SimpleLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, LParen=5, Comma=6, RParen=7, LBrace=8, 
		Semicolon=9, RBrace=10, Eq=11, Less=12, LessEq=13, Greater=14, GreaterEq=15, 
		Plus=16, Times=17, Minus=18, Divide=19, And=20, Or=21, Xor=22, Assign=23, 
		Print=24, Space=25, NewLine=26, If=27, Then=28, Else=29, While=30, Do=31, 
		Repeat=32, Skip=33, BoolLit=34, IntLit=35, Idfr=36, WS=37;
	public static final int
		RULE_prog = 0, RULE_dec = 1, RULE_vardec = 2, RULE_typed_idfr = 3, RULE_type = 4, 
		RULE_body = 5, RULE_block = 6, RULE_exp = 7, RULE_binop = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "dec", "vardec", "typed_idfr", "type", "body", "block", "exp", 
			"binop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'bool'", "'unit'", "'until'", "'('", "','", "')'", "'{'", 
			"';'", "'}'", "'=='", "'<'", "'<='", "'>'", "'>='", "'+'", "'*'", "'-'", 
			"'/'", "'&'", "'|'", "'^'", "':='", "'print'", "'space'", "'newline'", 
			"'if'", "'then'", "'else'", "'while'", "'do'", "'repeat'", "'skip'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "LParen", "Comma", "RParen", "LBrace", 
			"Semicolon", "RBrace", "Eq", "Less", "LessEq", "Greater", "GreaterEq", 
			"Plus", "Times", "Minus", "Divide", "And", "Or", "Xor", "Assign", "Print", 
			"Space", "NewLine", "If", "Then", "Else", "While", "Do", "Repeat", "Skip", 
			"BoolLit", "IntLit", "Idfr", "WS"
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
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SimpleLangParser.EOF, 0); }
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				dec();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0) );
			setState(23);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecContext extends ParserRuleContext {
		public Typed_idfrContext typed_idfr() {
			return getRuleContext(Typed_idfrContext.class,0);
		}
		public TerminalNode LParen() { return getToken(SimpleLangParser.LParen, 0); }
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SimpleLangParser.RParen, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			typed_idfr();
			setState(26);
			match(LParen);
			setState(27);
			vardec();
			setState(28);
			match(RParen);
			setState(29);
			body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VardecContext extends ParserRuleContext {
		public List<Typed_idfrContext> typed_idfr() {
			return getRuleContexts(Typed_idfrContext.class);
		}
		public Typed_idfrContext typed_idfr(int i) {
			return getRuleContext(Typed_idfrContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public VardecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterVardec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitVardec(this);
		}
	}

	public final VardecContext vardec() throws RecognitionException {
		VardecContext _localctx = new VardecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vardec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
				{
				setState(31);
				typed_idfr();
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(32);
					match(Comma);
					setState(33);
					typed_idfr();
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Typed_idfrContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Idfr() { return getToken(SimpleLangParser.Idfr, 0); }
		public Typed_idfrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_idfr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterTyped_idfr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitTyped_idfr(this);
		}
	}

	public final Typed_idfrContext typed_idfr() throws RecognitionException {
		Typed_idfrContext _localctx = new Typed_idfrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typed_idfr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			type();
			setState(42);
			match(Idfr);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public ExpContext exp;
		public List<ExpContext> ene = new ArrayList<ExpContext>();
		public TerminalNode LBrace() { return getToken(SimpleLangParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SimpleLangParser.RBrace, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<Typed_idfrContext> typed_idfr() {
			return getRuleContexts(Typed_idfrContext.class);
		}
		public Typed_idfrContext typed_idfr(int i) {
			return getRuleContext(Typed_idfrContext.class,i);
		}
		public List<TerminalNode> Assign() { return getTokens(SimpleLangParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(SimpleLangParser.Assign, i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(SimpleLangParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(SimpleLangParser.Semicolon, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(LBrace);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
				{
				{
				setState(47);
				typed_idfr();
				setState(48);
				match(Assign);
				setState(49);
				exp(0);
				setState(50);
				match(Semicolon);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			((BodyContext)_localctx).exp = exp(0);
			((BodyContext)_localctx).ene.add(((BodyContext)_localctx).exp);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semicolon) {
				{
				{
				setState(58);
				match(Semicolon);
				setState(59);
				((BodyContext)_localctx).exp = exp(0);
				((BodyContext)_localctx).ene.add(((BodyContext)_localctx).exp);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(RBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public ExpContext exp;
		public List<ExpContext> ene = new ArrayList<ExpContext>();
		public TerminalNode LBrace() { return getToken(SimpleLangParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SimpleLangParser.RBrace, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(SimpleLangParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(SimpleLangParser.Semicolon, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(LBrace);
			setState(68);
			((BlockContext)_localctx).exp = exp(0);
			((BlockContext)_localctx).ene.add(((BlockContext)_localctx).exp);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semicolon) {
				{
				{
				setState(69);
				match(Semicolon);
				setState(70);
				((BlockContext)_localctx).exp = exp(0);
				((BlockContext)_localctx).ene.add(((BlockContext)_localctx).exp);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(RBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileExprContext extends ExpContext {
		public TerminalNode While() { return getToken(SimpleLangParser.While, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Do() { return getToken(SimpleLangParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterWhileExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitWhileExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipExprContext extends ExpContext {
		public TerminalNode Skip() { return getToken(SimpleLangParser.Skip, 0); }
		public SkipExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterSkipExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitSkipExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolLitExprContext extends ExpContext {
		public TerminalNode BoolLit() { return getToken(SimpleLangParser.BoolLit, 0); }
		public BoolLitExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterBoolLitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitBoolLitExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfExprContext extends ExpContext {
		public TerminalNode If() { return getToken(SimpleLangParser.If, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Then() { return getToken(SimpleLangParser.Then, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode Else() { return getToken(SimpleLangParser.Else, 0); }
		public IfExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitIfExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewlineExprContext extends ExpContext {
		public TerminalNode NewLine() { return getToken(SimpleLangParser.NewLine, 0); }
		public NewlineExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterNewlineExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitNewlineExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends ExpContext {
		public TerminalNode Idfr() { return getToken(SimpleLangParser.Idfr, 0); }
		public IdExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitIdExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBinOpExprContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public ExprBinOpExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterExprBinOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitExprBinOpExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpaceExprContext extends ExpContext {
		public TerminalNode Space() { return getToken(SimpleLangParser.Space, 0); }
		public SpaceExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterSpaceExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitSpaceExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintExprContext extends ExpContext {
		public TerminalNode Print() { return getToken(SimpleLangParser.Print, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrintExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitPrintExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockExprContext extends ExpContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterBlockExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitBlockExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExprContext extends ExpContext {
		public TerminalNode Idfr() { return getToken(SimpleLangParser.Idfr, 0); }
		public TerminalNode Assign() { return getToken(SimpleLangParser.Assign, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitAssignExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InvokeExprContext extends ExpContext {
		public ExpContext exp;
		public List<ExpContext> args = new ArrayList<ExpContext>();
		public TerminalNode Idfr() { return getToken(SimpleLangParser.Idfr, 0); }
		public TerminalNode LParen() { return getToken(SimpleLangParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SimpleLangParser.RParen, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public InvokeExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInvokeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInvokeExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpExprContext extends ExpContext {
		public TerminalNode LParen() { return getToken(SimpleLangParser.LParen, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SimpleLangParser.RParen, 0); }
		public BinOpExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterBinOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitBinOpExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntExprContext extends ExpContext {
		public TerminalNode IntLit() { return getToken(SimpleLangParser.IntLit, 0); }
		public IntExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitIntExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForExprContext extends ExpContext {
		public TerminalNode Repeat() { return getToken(SimpleLangParser.Repeat, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ForExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterForExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitForExpr(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(79);
				match(Idfr);
				}
				break;
			case 2:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				match(IntLit);
				}
				break;
			case 3:
				{
				_localctx = new BoolLitExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(BoolLit);
				}
				break;
			case 4:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(Idfr);
				setState(83);
				match(Assign);
				setState(84);
				exp(12);
				}
				break;
			case 5:
				{
				_localctx = new BinOpExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(LParen);
				setState(86);
				exp(0);
				setState(87);
				binop();
				setState(88);
				exp(0);
				setState(89);
				match(RParen);
				}
				break;
			case 6:
				{
				_localctx = new InvokeExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(Idfr);
				setState(92);
				match(LParen);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 134469386528L) != 0)) {
					{
					setState(93);
					((InvokeExprContext)_localctx).exp = exp(0);
					((InvokeExprContext)_localctx).args.add(((InvokeExprContext)_localctx).exp);
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(94);
						match(Comma);
						setState(95);
						((InvokeExprContext)_localctx).exp = exp(0);
						((InvokeExprContext)_localctx).args.add(((InvokeExprContext)_localctx).exp);
						}
						}
						setState(100);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(103);
				match(RParen);
				}
				break;
			case 7:
				{
				_localctx = new BlockExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				block();
				}
				break;
			case 8:
				{
				_localctx = new IfExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(If);
				setState(106);
				exp(0);
				setState(107);
				match(Then);
				setState(108);
				block();
				setState(109);
				match(Else);
				setState(110);
				block();
				}
				break;
			case 9:
				{
				_localctx = new PrintExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(Print);
				setState(113);
				exp(6);
				}
				break;
			case 10:
				{
				_localctx = new WhileExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(While);
				setState(115);
				exp(0);
				setState(116);
				match(Do);
				setState(117);
				block();
				}
				break;
			case 11:
				{
				_localctx = new ForExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(Repeat);
				setState(120);
				block();
				setState(121);
				match(T__3);
				setState(122);
				exp(4);
				}
				break;
			case 12:
				{
				_localctx = new SpaceExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(Space);
				}
				break;
			case 13:
				{
				_localctx = new NewlineExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(NewLine);
				}
				break;
			case 14:
				{
				_localctx = new SkipExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(Skip);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprBinOpExprContext(new ExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(129);
					if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
					setState(130);
					binop();
					setState(131);
					exp(11);
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BinopContext extends ParserRuleContext {
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
	 
		public BinopContext() { }
		public void copyFrom(BinopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndBinopContext extends BinopContext {
		public TerminalNode And() { return getToken(SimpleLangParser.And, 0); }
		public TerminalNode Or() { return getToken(SimpleLangParser.Or, 0); }
		public TerminalNode Xor() { return getToken(SimpleLangParser.Xor, 0); }
		public AndBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterAndBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitAndBinop(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimesBinopContext extends BinopContext {
		public TerminalNode Times() { return getToken(SimpleLangParser.Times, 0); }
		public TimesBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterTimesBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitTimesBinop(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusBinopContext extends BinopContext {
		public TerminalNode Plus() { return getToken(SimpleLangParser.Plus, 0); }
		public PlusBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterPlusBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitPlusBinop(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterEqContext extends BinopContext {
		public TerminalNode GreaterEq() { return getToken(SimpleLangParser.GreaterEq, 0); }
		public GreaterEqContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterGreaterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitGreaterEq(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqBinopContext extends BinopContext {
		public TerminalNode Eq() { return getToken(SimpleLangParser.Eq, 0); }
		public EqBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterEqBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitEqBinop(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessBinopContext extends BinopContext {
		public TerminalNode Less() { return getToken(SimpleLangParser.Less, 0); }
		public LessBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterLessBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitLessBinop(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterContext extends BinopContext {
		public TerminalNode Greater() { return getToken(SimpleLangParser.Greater, 0); }
		public GreaterContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitGreater(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessEqBinopContext extends BinopContext {
		public TerminalNode LessEq() { return getToken(SimpleLangParser.LessEq, 0); }
		public LessEqBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterLessEqBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitLessEqBinop(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusBinopContext extends BinopContext {
		public TerminalNode Minus() { return getToken(SimpleLangParser.Minus, 0); }
		public MinusBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterMinusBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitMinusBinop(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivideBinopContext extends BinopContext {
		public TerminalNode Divide() { return getToken(SimpleLangParser.Divide, 0); }
		public DivideBinopContext(BinopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDivideBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDivideBinop(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_binop);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Eq:
				_localctx = new EqBinopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(Eq);
				}
				break;
			case Less:
				_localctx = new LessBinopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(Less);
				}
				break;
			case LessEq:
				_localctx = new LessEqBinopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(LessEq);
				}
				break;
			case Greater:
				_localctx = new GreaterContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				match(Greater);
				}
				break;
			case GreaterEq:
				_localctx = new GreaterEqContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				match(GreaterEq);
				}
				break;
			case Divide:
				_localctx = new DivideBinopContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				match(Divide);
				}
				break;
			case Plus:
				_localctx = new PlusBinopContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(144);
				match(Plus);
				}
				break;
			case Minus:
				_localctx = new MinusBinopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(145);
				match(Minus);
				}
				break;
			case Times:
				_localctx = new TimesBinopContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(146);
				match(Times);
				}
				break;
			case And:
				_localctx = new AndBinopContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(147);
				match(And);
				}
				break;
			case Or:
				_localctx = new AndBinopContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(148);
				match(Or);
				}
				break;
			case Xor:
				_localctx = new AndBinopContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(149);
				match(Xor);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		case 7:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u0099\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"#\b\u0002\n\u0002\f\u0002&\t\u0002\u0003\u0002(\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u00055\b\u0005\n\u0005"+
		"\f\u00058\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005=\b\u0005"+
		"\n\u0005\f\u0005@\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006H\b\u0006\n\u0006\f\u0006K\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007a\b\u0007\n\u0007\f\u0007d\t\u0007"+
		"\u0003\u0007f\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u0080\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u0086\b\u0007\n\u0007\f\u0007\u0089"+
		"\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0097\b\b\u0001\b\u0000\u0001"+
		"\u000e\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0001\u0001\u0000"+
		"\u0001\u0003\u00b0\u0000\u0013\u0001\u0000\u0000\u0000\u0002\u0019\u0001"+
		"\u0000\u0000\u0000\u0004\'\u0001\u0000\u0000\u0000\u0006)\u0001\u0000"+
		"\u0000\u0000\b,\u0001\u0000\u0000\u0000\n.\u0001\u0000\u0000\u0000\fC"+
		"\u0001\u0000\u0000\u0000\u000e\u007f\u0001\u0000\u0000\u0000\u0010\u0096"+
		"\u0001\u0000\u0000\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0012"+
		"\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0013"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0000\u0000\u0001\u0018\u0001"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0003\u0006\u0003\u0000\u001a\u001b"+
		"\u0005\u0005\u0000\u0000\u001b\u001c\u0003\u0004\u0002\u0000\u001c\u001d"+
		"\u0005\u0007\u0000\u0000\u001d\u001e\u0003\n\u0005\u0000\u001e\u0003\u0001"+
		"\u0000\u0000\u0000\u001f$\u0003\u0006\u0003\u0000 !\u0005\u0006\u0000"+
		"\u0000!#\u0003\u0006\u0003\u0000\" \u0001\u0000\u0000\u0000#&\u0001\u0000"+
		"\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%(\u0001"+
		"\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'\u001f\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)*\u0003"+
		"\b\u0004\u0000*+\u0005$\u0000\u0000+\u0007\u0001\u0000\u0000\u0000,-\u0007"+
		"\u0000\u0000\u0000-\t\u0001\u0000\u0000\u0000.6\u0005\b\u0000\u0000/0"+
		"\u0003\u0006\u0003\u000001\u0005\u0017\u0000\u000012\u0003\u000e\u0007"+
		"\u000023\u0005\t\u0000\u000035\u0001\u0000\u0000\u00004/\u0001\u0000\u0000"+
		"\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u000079\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009>\u0003"+
		"\u000e\u0007\u0000:;\u0005\t\u0000\u0000;=\u0003\u000e\u0007\u0000<:\u0001"+
		"\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000AB\u0005\n\u0000\u0000B\u000b\u0001\u0000\u0000\u0000CD\u0005\b"+
		"\u0000\u0000DI\u0003\u000e\u0007\u0000EF\u0005\t\u0000\u0000FH\u0003\u000e"+
		"\u0007\u0000GE\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000"+
		"KI\u0001\u0000\u0000\u0000LM\u0005\n\u0000\u0000M\r\u0001\u0000\u0000"+
		"\u0000NO\u0006\u0007\uffff\uffff\u0000O\u0080\u0005$\u0000\u0000P\u0080"+
		"\u0005#\u0000\u0000Q\u0080\u0005\"\u0000\u0000RS\u0005$\u0000\u0000ST"+
		"\u0005\u0017\u0000\u0000T\u0080\u0003\u000e\u0007\fUV\u0005\u0005\u0000"+
		"\u0000VW\u0003\u000e\u0007\u0000WX\u0003\u0010\b\u0000XY\u0003\u000e\u0007"+
		"\u0000YZ\u0005\u0007\u0000\u0000Z\u0080\u0001\u0000\u0000\u0000[\\\u0005"+
		"$\u0000\u0000\\e\u0005\u0005\u0000\u0000]b\u0003\u000e\u0007\u0000^_\u0005"+
		"\u0006\u0000\u0000_a\u0003\u000e\u0007\u0000`^\u0001\u0000\u0000\u0000"+
		"ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000e]\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0080"+
		"\u0005\u0007\u0000\u0000h\u0080\u0003\f\u0006\u0000ij\u0005\u001b\u0000"+
		"\u0000jk\u0003\u000e\u0007\u0000kl\u0005\u001c\u0000\u0000lm\u0003\f\u0006"+
		"\u0000mn\u0005\u001d\u0000\u0000no\u0003\f\u0006\u0000o\u0080\u0001\u0000"+
		"\u0000\u0000pq\u0005\u0018\u0000\u0000q\u0080\u0003\u000e\u0007\u0006"+
		"rs\u0005\u001e\u0000\u0000st\u0003\u000e\u0007\u0000tu\u0005\u001f\u0000"+
		"\u0000uv\u0003\f\u0006\u0000v\u0080\u0001\u0000\u0000\u0000wx\u0005 \u0000"+
		"\u0000xy\u0003\f\u0006\u0000yz\u0005\u0004\u0000\u0000z{\u0003\u000e\u0007"+
		"\u0004{\u0080\u0001\u0000\u0000\u0000|\u0080\u0005\u0019\u0000\u0000}"+
		"\u0080\u0005\u001a\u0000\u0000~\u0080\u0005!\u0000\u0000\u007fN\u0001"+
		"\u0000\u0000\u0000\u007fP\u0001\u0000\u0000\u0000\u007fQ\u0001\u0000\u0000"+
		"\u0000\u007fR\u0001\u0000\u0000\u0000\u007fU\u0001\u0000\u0000\u0000\u007f"+
		"[\u0001\u0000\u0000\u0000\u007fh\u0001\u0000\u0000\u0000\u007fi\u0001"+
		"\u0000\u0000\u0000\u007fp\u0001\u0000\u0000\u0000\u007fr\u0001\u0000\u0000"+
		"\u0000\u007fw\u0001\u0000\u0000\u0000\u007f|\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0087\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\n\n\u0000\u0000\u0082\u0083\u0003\u0010"+
		"\b\u0000\u0083\u0084\u0003\u000e\u0007\u000b\u0084\u0086\u0001\u0000\u0000"+
		"\u0000\u0085\u0081\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u000f\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u008a\u0097\u0005\u000b\u0000\u0000\u008b\u0097\u0005\f\u0000\u0000"+
		"\u008c\u0097\u0005\r\u0000\u0000\u008d\u0097\u0005\u000e\u0000\u0000\u008e"+
		"\u0097\u0005\u000f\u0000\u0000\u008f\u0097\u0005\u0013\u0000\u0000\u0090"+
		"\u0097\u0005\u0010\u0000\u0000\u0091\u0097\u0005\u0012\u0000\u0000\u0092"+
		"\u0097\u0005\u0011\u0000\u0000\u0093\u0097\u0005\u0014\u0000\u0000\u0094"+
		"\u0097\u0005\u0015\u0000\u0000\u0095\u0097\u0005\u0016\u0000\u0000\u0096"+
		"\u008a\u0001\u0000\u0000\u0000\u0096\u008b\u0001\u0000\u0000\u0000\u0096"+
		"\u008c\u0001\u0000\u0000\u0000\u0096\u008d\u0001\u0000\u0000\u0000\u0096"+
		"\u008e\u0001\u0000\u0000\u0000\u0096\u008f\u0001\u0000\u0000\u0000\u0096"+
		"\u0090\u0001\u0000\u0000\u0000\u0096\u0091\u0001\u0000\u0000\u0000\u0096"+
		"\u0092\u0001\u0000\u0000\u0000\u0096\u0093\u0001\u0000\u0000\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097"+
		"\u0011\u0001\u0000\u0000\u0000\u000b\u0015$\'6>Ibe\u007f\u0087\u0096";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}