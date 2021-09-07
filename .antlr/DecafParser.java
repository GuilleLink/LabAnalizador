// Generated from c:\Users\Guillermo\Desktop\SegundoSemestre\Compiladores\Lab\LabAnalizador\Decaf.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, ID=40, NUM=41, CHAR=42, WS=43, QUOTES=44, APOSTROPHE=45, CHAR_LITERAL=46;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_varDeclaration = 2, RULE_structDeclaration = 3, 
		RULE_varType = 4, RULE_methodDeclaration = 5, RULE_methodType = 6, RULE_parameter = 7, 
		RULE_parameterType = 8, RULE_block = 9, RULE_statement = 10, RULE_location = 11, 
		RULE_var_id = 12, RULE_array_id = 13, RULE_expression = 14, RULE_methodCall = 15, 
		RULE_op = 16, RULE_arith_op = 17, RULE_rel_op = 18, RULE_eq_op = 19, RULE_cond_op = 20, 
		RULE_literal = 21, RULE_int_literal = 22, RULE_bool_literal = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "varDeclaration", "structDeclaration", "varType", 
			"methodDeclaration", "methodType", "parameter", "parameterType", "block", 
			"statement", "location", "var_id", "array_id", "expression", "methodCall", 
			"op", "arith_op", "rel_op", "eq_op", "cond_op", "literal", "int_literal", 
			"bool_literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'Program'", "'{'", "'}'", "';'", "'['", "']'", "'struct'", 
			"'int'", "'boolean'", "'char'", "'void'", "'('", "')'", "','", "'if'", 
			"'else'", "'while'", "'return'", "'='", "'+='", "'-='", "'.'", "'*'", 
			"'/'", "'%'", "'+'", "'-'", "'!'", "'<'", "'>'", "'<='", "'>='", "'=='", 
			"'!='", "'&&'", "'||'", "'true'", "'false'", null, null, null, null, 
			"'\"'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "NUM", "CHAR", "WS", "QUOTES", "APOSTROPHE", 
			"CHAR_LITERAL"
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
	public String getGrammarFileName() { return "Decaf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DecafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__0);
			setState(49);
			match(T__1);
			setState(50);
			match(T__2);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				{
				setState(51);
				declaration();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(T__3);
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

	public static class DeclarationContext extends ParserRuleContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				structDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				varDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				methodDeclaration();
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	 
		public VarDeclarationContext() { }
		public void copyFrom(VarDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclaration_ArrayContext extends VarDeclarationContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode NUM() { return getToken(DecafParser.NUM, 0); }
		public VarDeclaration_ArrayContext(VarDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class VarDeclaration_IDContext extends VarDeclarationContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public VarDeclaration_IDContext(VarDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclaration);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new VarDeclaration_IDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				varType();
				setState(65);
				match(ID);
				setState(66);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new VarDeclaration_ArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				varType();
				setState(69);
				match(ID);
				setState(70);
				match(T__5);
				setState(71);
				match(NUM);
				setState(72);
				match(T__6);
				setState(73);
				match(T__4);
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structDeclaration);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(T__7);
				setState(78);
				match(ID);
				setState(79);
				match(T__2);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
					{
					{
					setState(80);
					varDeclaration();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__7);
				setState(88);
				match(ID);
				setState(89);
				match(T__2);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
					{
					{
					setState(90);
					varDeclaration();
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(96);
				match(T__3);
				setState(97);
				match(T__4);
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

	public static class VarTypeContext extends ParserRuleContext {
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
	 
		public VarTypeContext() { }
		public void copyFrom(VarTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarType_voidContext extends VarTypeContext {
		public VarType_voidContext(VarTypeContext ctx) { copyFrom(ctx); }
	}
	public static class VarType_intContext extends VarTypeContext {
		public VarType_intContext(VarTypeContext ctx) { copyFrom(ctx); }
	}
	public static class VarType_charContext extends VarTypeContext {
		public VarType_charContext(VarTypeContext ctx) { copyFrom(ctx); }
	}
	public static class VarType_structContext extends VarTypeContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public VarType_structContext(VarTypeContext ctx) { copyFrom(ctx); }
	}
	public static class VarType_structDeclarationContext extends VarTypeContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public VarType_structDeclarationContext(VarTypeContext ctx) { copyFrom(ctx); }
	}
	public static class VarType_booleanContext extends VarTypeContext {
		public VarType_booleanContext(VarTypeContext ctx) { copyFrom(ctx); }
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varType);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new VarType_intContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(T__8);
				}
				break;
			case 2:
				_localctx = new VarType_booleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new VarType_charContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(T__10);
				}
				break;
			case 4:
				_localctx = new VarType_structContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				match(T__7);
				setState(104);
				match(ID);
				}
				break;
			case 5:
				_localctx = new VarType_structDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				structDeclaration();
				}
				break;
			case 6:
				_localctx = new VarType_voidContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				match(T__11);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				methodType();
				setState(110);
				match(ID);
				setState(111);
				match(T__12);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(112);
					match(T__11);
					}
				}

				setState(115);
				match(T__13);
				setState(116);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				methodType();
				setState(119);
				match(ID);
				setState(120);
				match(T__12);
				setState(121);
				parameter();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(122);
					match(T__14);
					setState(123);
					parameter();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129);
				match(T__13);
				setState(130);
				block();
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

	public static class MethodTypeContext extends ParserRuleContext {
		public MethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodType; }
	 
		public MethodTypeContext() { }
		public void copyFrom(MethodTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodType_voidContext extends MethodTypeContext {
		public MethodType_voidContext(MethodTypeContext ctx) { copyFrom(ctx); }
	}
	public static class MethodType_intContext extends MethodTypeContext {
		public MethodType_intContext(MethodTypeContext ctx) { copyFrom(ctx); }
	}
	public static class MethodType_booleanContext extends MethodTypeContext {
		public MethodType_booleanContext(MethodTypeContext ctx) { copyFrom(ctx); }
	}
	public static class MethodType_charContext extends MethodTypeContext {
		public MethodType_charContext(MethodTypeContext ctx) { copyFrom(ctx); }
	}

	public final MethodTypeContext methodType() throws RecognitionException {
		MethodTypeContext _localctx = new MethodTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodType);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new MethodType_intContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(T__8);
				}
				break;
			case T__10:
				_localctx = new MethodType_charContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(T__10);
				}
				break;
			case T__9:
				_localctx = new MethodType_booleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(T__9);
				}
				break;
			case T__11:
				_localctx = new MethodType_voidContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				match(T__11);
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

	public static class ParameterContext extends ParserRuleContext {
		public ParameterTypeContext parameterType() {
			return getRuleContext(ParameterTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				parameterType();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(141);
					match(ID);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				parameterType();
				setState(145);
				match(ID);
				setState(146);
				match(T__5);
				setState(147);
				match(T__6);
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

	public static class ParameterTypeContext extends ParserRuleContext {
		public ParameterTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterType; }
	 
		public ParameterTypeContext() { }
		public void copyFrom(ParameterTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParameterType_booleanContext extends ParameterTypeContext {
		public ParameterType_booleanContext(ParameterTypeContext ctx) { copyFrom(ctx); }
	}
	public static class ParameterType_charContext extends ParameterTypeContext {
		public ParameterType_charContext(ParameterTypeContext ctx) { copyFrom(ctx); }
	}
	public static class ParameterType_intContext extends ParameterTypeContext {
		public ParameterType_intContext(ParameterTypeContext ctx) { copyFrom(ctx); }
	}
	public static class ParameterType_voidContext extends ParameterTypeContext {
		public ParameterType_voidContext(ParameterTypeContext ctx) { copyFrom(ctx); }
	}

	public final ParameterTypeContext parameterType() throws RecognitionException {
		ParameterTypeContext _localctx = new ParameterTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterType);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new ParameterType_intContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(T__8);
				}
				break;
			case T__10:
				_localctx = new ParameterType_charContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(T__10);
				}
				break;
			case T__9:
				_localctx = new ParameterType_booleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(T__9);
				}
				break;
			case T__11:
				_localctx = new ParameterType_voidContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(T__11);
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

	public static class BlockContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__2);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				{
				setState(158);
				varDeclaration();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__12) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << T__28) | (1L << T__37) | (1L << T__38) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(164);
				statement();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(T__3);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Statement_blockContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Statement_blockContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class Statement_whileContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Statement_whileContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class Statement_methodCallContext extends StatementContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public Statement_methodCallContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class Statement_incrementContext extends StatementContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_incrementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class Statement_returnContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_returnContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class Statement_decrementContext extends StatementContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_decrementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class Statement_ifContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Statement_ifContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class Statement_expressionContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_expressionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class Statement_assignValueContext extends StatementContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_assignValueContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new Statement_ifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(T__15);
				setState(173);
				match(T__12);
				setState(174);
				expression(0);
				setState(175);
				match(T__13);
				setState(176);
				block();
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(177);
					match(T__16);
					setState(178);
					block();
					}
				}

				}
				break;
			case 2:
				_localctx = new Statement_whileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(T__17);
				setState(182);
				match(T__12);
				setState(183);
				expression(0);
				setState(184);
				match(T__13);
				setState(185);
				block();
				}
				break;
			case 3:
				_localctx = new Statement_returnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(T__18);
				setState(188);
				expression(0);
				setState(189);
				match(T__4);
				}
				break;
			case 4:
				_localctx = new Statement_methodCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				methodCall();
				setState(192);
				match(T__4);
				}
				break;
			case 5:
				_localctx = new Statement_blockContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				block();
				}
				break;
			case 6:
				_localctx = new Statement_assignValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				location();
				setState(196);
				match(T__19);
				setState(197);
				expression(0);
				setState(198);
				match(T__4);
				}
				break;
			case 7:
				_localctx = new Statement_incrementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(200);
				location();
				setState(201);
				match(T__20);
				setState(202);
				expression(0);
				setState(203);
				match(T__4);
				}
				break;
			case 8:
				_localctx = new Statement_decrementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(205);
				location();
				setState(206);
				match(T__21);
				setState(207);
				expression(0);
				setState(208);
				match(T__4);
				}
				break;
			case 9:
				_localctx = new Statement_expressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__28) | (1L << T__37) | (1L << T__38) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					setState(210);
					expression(0);
					}
				}

				setState(213);
				match(T__4);
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

	public static class LocationContext extends ParserRuleContext {
		public Var_idContext var_id() {
			return getRuleContext(Var_idContext.class,0);
		}
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(216);
				var_id();
				}
				break;
			case 2:
				{
				setState(217);
				array_id();
				}
				break;
			}
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(220);
				match(T__22);
				setState(221);
				location();
				}
				break;
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

	public static class Var_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public Var_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_id; }
	}

	public final Var_idContext var_id() throws RecognitionException {
		Var_idContext _localctx = new Var_idContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(ID);
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

	public static class Array_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Array_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_id; }
	}

	public final Array_idContext array_id() throws RecognitionException {
		Array_idContext _localctx = new Array_idContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_array_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(ID);
			setState(227);
			match(T__5);
			setState(228);
			int_literal();
			setState(229);
			match(T__6);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expression_SecondPrecedenceContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_SecondPrecedenceContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Expression_literalContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Expression_literalContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Expression_locationContext extends ExpressionContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Expression_locationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Expression_negative_intContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_negative_intContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Expression_firstPrecedenceContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_firstPrecedenceContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Expression_negate_boolContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_negate_boolContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Expression_methodCallContext extends ExpressionContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public Expression_methodCallContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Expression_operatorsContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public Expression_operatorsContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Expression_parenthesisContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_parenthesisContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new Expression_locationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(232);
				location();
				}
				break;
			case 2:
				{
				_localctx = new Expression_methodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				methodCall();
				}
				break;
			case 3:
				{
				_localctx = new Expression_literalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				literal();
				}
				break;
			case 4:
				{
				_localctx = new Expression_negative_intContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				match(T__27);
				setState(236);
				expression(3);
				}
				break;
			case 5:
				{
				_localctx = new Expression_negate_boolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				match(T__28);
				setState(238);
				expression(2);
				}
				break;
			case 6:
				{
				_localctx = new Expression_parenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				match(T__12);
				setState(240);
				expression(0);
				setState(241);
				match(T__13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new Expression_firstPrecedenceContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(246);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(247);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new Expression_SecondPrecedenceContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(249);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(250);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new Expression_operatorsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(251);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(252);
						op();
						setState(253);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(ID);
			setState(261);
			match(T__12);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__28) | (1L << T__37) | (1L << T__38) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(262);
				expression(0);
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(263);
					match(T__14);
					}
				}

				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			match(T__13);
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

	public static class OpContext extends ParserRuleContext {
		public Arith_opContext arith_op() {
			return getRuleContext(Arith_opContext.class,0);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_op);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				arith_op();
				}
				break;
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				eq_op();
				}
				break;
			case T__29:
			case T__30:
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				rel_op();
				}
				break;
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				cond_op();
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

	public static class Arith_opContext extends ParserRuleContext {
		public Arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_op; }
	}

	public final Arith_opContext arith_op() throws RecognitionException {
		Arith_opContext _localctx = new Arith_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
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

	public static class Rel_opContext extends ParserRuleContext {
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
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

	public static class Eq_opContext extends ParserRuleContext {
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !(_la==T__33 || _la==T__34) ) {
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

	public static class Cond_opContext extends ParserRuleContext {
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				int_literal();
				}
				break;
			case T__37:
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				bool_literal();
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

	public static class Int_literalContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(DecafParser.NUM, 0); }
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_int_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(NUM);
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

	public static class Bool_literalContext extends ParserRuleContext {
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( !(_la==T__37 || _la==T__38) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u012a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\3\3\3\3\3\5\3A\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\5\3\5\3\5\3"+
		"\5\7\5T\n\5\f\5\16\5W\13\5\3\5\3\5\3\5\3\5\3\5\7\5^\n\5\f\5\16\5a\13\5"+
		"\3\5\3\5\5\5e\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6n\n\6\3\7\3\7\3\7\3\7"+
		"\5\7t\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\177\n\7\f\7\16\7\u0082"+
		"\13\7\3\7\3\7\3\7\5\7\u0087\n\7\3\b\3\b\3\b\3\b\5\b\u008d\n\b\3\t\3\t"+
		"\5\t\u0091\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0098\n\t\3\n\3\n\3\n\3\n\5\n\u009e"+
		"\n\n\3\13\3\13\7\13\u00a2\n\13\f\13\16\13\u00a5\13\13\3\13\7\13\u00a8"+
		"\n\13\f\13\16\13\u00ab\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u00b6\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d6"+
		"\n\f\3\f\5\f\u00d9\n\f\3\r\3\r\5\r\u00dd\n\r\3\r\3\r\5\r\u00e1\n\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00f6\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u0102\n\20\f\20\16\20\u0105\13\20\3\21\3\21\3\21"+
		"\3\21\5\21\u010b\n\21\7\21\u010d\n\21\f\21\16\21\u0110\13\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\5\22\u0118\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\5\27\u0124\n\27\3\30\3\30\3\31\3\31\3\31\2\3\36\32\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\t\3\2\32\34\3\2\35\36"+
		"\3\2\32\36\3\2 #\3\2$%\3\2&\'\3\2()\2\u0144\2\62\3\2\2\2\4@\3\2\2\2\6"+
		"M\3\2\2\2\bd\3\2\2\2\nm\3\2\2\2\f\u0086\3\2\2\2\16\u008c\3\2\2\2\20\u0097"+
		"\3\2\2\2\22\u009d\3\2\2\2\24\u009f\3\2\2\2\26\u00d8\3\2\2\2\30\u00dc\3"+
		"\2\2\2\32\u00e2\3\2\2\2\34\u00e4\3\2\2\2\36\u00f5\3\2\2\2 \u0106\3\2\2"+
		"\2\"\u0117\3\2\2\2$\u0119\3\2\2\2&\u011b\3\2\2\2(\u011d\3\2\2\2*\u011f"+
		"\3\2\2\2,\u0123\3\2\2\2.\u0125\3\2\2\2\60\u0127\3\2\2\2\62\63\7\3\2\2"+
		"\63\64\7\4\2\2\648\7\5\2\2\65\67\5\4\3\2\66\65\3\2\2\2\67:\3\2\2\28\66"+
		"\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\6\2\2<\3\3\2\2\2=A\5\b\5\2"+
		">A\5\6\4\2?A\5\f\7\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\5\3\2\2\2BC\5\n\6"+
		"\2CD\7*\2\2DE\7\7\2\2EN\3\2\2\2FG\5\n\6\2GH\7*\2\2HI\7\b\2\2IJ\7+\2\2"+
		"JK\7\t\2\2KL\7\7\2\2LN\3\2\2\2MB\3\2\2\2MF\3\2\2\2N\7\3\2\2\2OP\7\n\2"+
		"\2PQ\7*\2\2QU\7\5\2\2RT\5\6\4\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2"+
		"\2VX\3\2\2\2WU\3\2\2\2Xe\7\6\2\2YZ\7\n\2\2Z[\7*\2\2[_\7\5\2\2\\^\5\6\4"+
		"\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\6"+
		"\2\2ce\7\7\2\2dO\3\2\2\2dY\3\2\2\2e\t\3\2\2\2fn\7\13\2\2gn\7\f\2\2hn\7"+
		"\r\2\2ij\7\n\2\2jn\7*\2\2kn\5\b\5\2ln\7\16\2\2mf\3\2\2\2mg\3\2\2\2mh\3"+
		"\2\2\2mi\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\13\3\2\2\2op\5\16\b\2pq\7*\2\2q"+
		"s\7\17\2\2rt\7\16\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\20\2\2vw\5\24"+
		"\13\2w\u0087\3\2\2\2xy\5\16\b\2yz\7*\2\2z{\7\17\2\2{\u0080\5\20\t\2|}"+
		"\7\21\2\2}\177\5\20\t\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\20"+
		"\2\2\u0084\u0085\5\24\13\2\u0085\u0087\3\2\2\2\u0086o\3\2\2\2\u0086x\3"+
		"\2\2\2\u0087\r\3\2\2\2\u0088\u008d\7\13\2\2\u0089\u008d\7\r\2\2\u008a"+
		"\u008d\7\f\2\2\u008b\u008d\7\16\2\2\u008c\u0088\3\2\2\2\u008c\u0089\3"+
		"\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\17\3\2\2\2\u008e"+
		"\u0090\5\22\n\2\u008f\u0091\7*\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0098\3\2\2\2\u0092\u0093\5\22\n\2\u0093\u0094\7*\2\2\u0094"+
		"\u0095\7\b\2\2\u0095\u0096\7\t\2\2\u0096\u0098\3\2\2\2\u0097\u008e\3\2"+
		"\2\2\u0097\u0092\3\2\2\2\u0098\21\3\2\2\2\u0099\u009e\7\13\2\2\u009a\u009e"+
		"\7\r\2\2\u009b\u009e\7\f\2\2\u009c\u009e\7\16\2\2\u009d\u0099\3\2\2\2"+
		"\u009d\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\23"+
		"\3\2\2\2\u009f\u00a3\7\5\2\2\u00a0\u00a2\5\6\4\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a9\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\5\26\f\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\6\2\2\u00ad\25\3\2\2\2\u00ae\u00af"+
		"\7\22\2\2\u00af\u00b0\7\17\2\2\u00b0\u00b1\5\36\20\2\u00b1\u00b2\7\20"+
		"\2\2\u00b2\u00b5\5\24\13\2\u00b3\u00b4\7\23\2\2\u00b4\u00b6\5\24\13\2"+
		"\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00d9\3\2\2\2\u00b7\u00b8"+
		"\7\24\2\2\u00b8\u00b9\7\17\2\2\u00b9\u00ba\5\36\20\2\u00ba\u00bb\7\20"+
		"\2\2\u00bb\u00bc\5\24\13\2\u00bc\u00d9\3\2\2\2\u00bd\u00be\7\25\2\2\u00be"+
		"\u00bf\5\36\20\2\u00bf\u00c0\7\7\2\2\u00c0\u00d9\3\2\2\2\u00c1\u00c2\5"+
		" \21\2\u00c2\u00c3\7\7\2\2\u00c3\u00d9\3\2\2\2\u00c4\u00d9\5\24\13\2\u00c5"+
		"\u00c6\5\30\r\2\u00c6\u00c7\7\26\2\2\u00c7\u00c8\5\36\20\2\u00c8\u00c9"+
		"\7\7\2\2\u00c9\u00d9\3\2\2\2\u00ca\u00cb\5\30\r\2\u00cb\u00cc\7\27\2\2"+
		"\u00cc\u00cd\5\36\20\2\u00cd\u00ce\7\7\2\2\u00ce\u00d9\3\2\2\2\u00cf\u00d0"+
		"\5\30\r\2\u00d0\u00d1\7\30\2\2\u00d1\u00d2\5\36\20\2\u00d2\u00d3\7\7\2"+
		"\2\u00d3\u00d9\3\2\2\2\u00d4\u00d6\5\36\20\2\u00d5\u00d4\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\7\7\2\2\u00d8\u00ae\3\2"+
		"\2\2\u00d8\u00b7\3\2\2\2\u00d8\u00bd\3\2\2\2\u00d8\u00c1\3\2\2\2\u00d8"+
		"\u00c4\3\2\2\2\u00d8\u00c5\3\2\2\2\u00d8\u00ca\3\2\2\2\u00d8\u00cf\3\2"+
		"\2\2\u00d8\u00d5\3\2\2\2\u00d9\27\3\2\2\2\u00da\u00dd\5\32\16\2\u00db"+
		"\u00dd\5\34\17\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3"+
		"\2\2\2\u00de\u00df\7\31\2\2\u00df\u00e1\5\30\r\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\31\3\2\2\2\u00e2\u00e3\7*\2\2\u00e3\33\3\2\2\2\u00e4"+
		"\u00e5\7*\2\2\u00e5\u00e6\7\b\2\2\u00e6\u00e7\5.\30\2\u00e7\u00e8\7\t"+
		"\2\2\u00e8\35\3\2\2\2\u00e9\u00ea\b\20\1\2\u00ea\u00f6\5\30\r\2\u00eb"+
		"\u00f6\5 \21\2\u00ec\u00f6\5,\27\2\u00ed\u00ee\7\36\2\2\u00ee\u00f6\5"+
		"\36\20\5\u00ef\u00f0\7\37\2\2\u00f0\u00f6\5\36\20\4\u00f1\u00f2\7\17\2"+
		"\2\u00f2\u00f3\5\36\20\2\u00f3\u00f4\7\20\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00e9\3\2\2\2\u00f5\u00eb\3\2\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00ed\3\2"+
		"\2\2\u00f5\u00ef\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f6\u0103\3\2\2\2\u00f7"+
		"\u00f8\f\b\2\2\u00f8\u00f9\t\2\2\2\u00f9\u0102\5\36\20\t\u00fa\u00fb\f"+
		"\7\2\2\u00fb\u00fc\t\3\2\2\u00fc\u0102\5\36\20\b\u00fd\u00fe\f\6\2\2\u00fe"+
		"\u00ff\5\"\22\2\u00ff\u0100\5\36\20\7\u0100\u0102\3\2\2\2\u0101\u00f7"+
		"\3\2\2\2\u0101\u00fa\3\2\2\2\u0101\u00fd\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\37\3\2\2\2\u0105\u0103\3\2\2"+
		"\2\u0106\u0107\7*\2\2\u0107\u010e\7\17\2\2\u0108\u010a\5\36\20\2\u0109"+
		"\u010b\7\21\2\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3"+
		"\2\2\2\u010c\u0108\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\20"+
		"\2\2\u0112!\3\2\2\2\u0113\u0118\5$\23\2\u0114\u0118\5(\25\2\u0115\u0118"+
		"\5&\24\2\u0116\u0118\5*\26\2\u0117\u0113\3\2\2\2\u0117\u0114\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118#\3\2\2\2\u0119\u011a\t\4\2\2"+
		"\u011a%\3\2\2\2\u011b\u011c\t\5\2\2\u011c\'\3\2\2\2\u011d\u011e\t\6\2"+
		"\2\u011e)\3\2\2\2\u011f\u0120\t\7\2\2\u0120+\3\2\2\2\u0121\u0124\5.\30"+
		"\2\u0122\u0124\5\60\31\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124"+
		"-\3\2\2\2\u0125\u0126\7+\2\2\u0126/\3\2\2\2\u0127\u0128\t\b\2\2\u0128"+
		"\61\3\2\2\2\368@MU_dms\u0080\u0086\u008c\u0090\u0097\u009d\u00a3\u00a9"+
		"\u00b5\u00d5\u00d8\u00dc\u00e0\u00f5\u0101\u0103\u010a\u010e\u0117\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}