// Generated from testGrammar.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testGrammarParser}.
 */
public interface testGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(testGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(testGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(testGrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(testGrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(testGrammarParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(testGrammarParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(testGrammarParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(testGrammarParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(testGrammarParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(testGrammarParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(testGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(testGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(testGrammarParser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(testGrammarParser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(testGrammarParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(testGrammarParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(testGrammarParser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(testGrammarParser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(testGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(testGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(testGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(testGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(testGrammarParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(testGrammarParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(testGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(testGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(testGrammarParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(testGrammarParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(testGrammarParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(testGrammarParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(testGrammarParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(testGrammarParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(testGrammarParser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(testGrammarParser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(testGrammarParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(testGrammarParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(testGrammarParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(testGrammarParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(testGrammarParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(testGrammarParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(testGrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(testGrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(testGrammarParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(testGrammarParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrammarParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(testGrammarParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrammarParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(testGrammarParser.Bool_literalContext ctx);
}