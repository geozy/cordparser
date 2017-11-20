// Generated from CordSAS.g4 by ANTLR 4.4


import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CordSASParser}.
 */

public interface CordSASListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CordSASParser#calculation}.
	 * @param ctx the parse tree
	 */
	void enterCalculation(@NotNull CordSASParser.CalculationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CordSASParser#calculation}.
	 * @param ctx the parse tree
	 */
	void exitCalculation(@NotNull CordSASParser.CalculationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiDiv}
	 * labeled alternative in {@link CordSASParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiDiv(@NotNull CordSASParser.MultiDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiDiv}
	 * labeled alternative in {@link CordSASParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiDiv(@NotNull CordSASParser.MultiDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link CordSASParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(@NotNull CordSASParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CordSASParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(@NotNull CordSASParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link CordSASParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull CordSASParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link CordSASParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull CordSASParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link CordSASParser#methodArguments}.
	 * @param ctx the parse tree
	 */
	void enterMethodArguments(@NotNull CordSASParser.MethodArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CordSASParser#methodArguments}.
	 * @param ctx the parse tree
	 */
	void exitMethodArguments(@NotNull CordSASParser.MethodArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leafCall}
	 * labeled alternative in {@link CordSASParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLeafCall(@NotNull CordSASParser.LeafCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leafCall}
	 * labeled alternative in {@link CordSASParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLeafCall(@NotNull CordSASParser.LeafCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockExpr}
	 * labeled alternative in {@link CordSASParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpr(@NotNull CordSASParser.BlockExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockExpr}
	 * labeled alternative in {@link CordSASParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpr(@NotNull CordSASParser.BlockExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CordSASParser#leaf}.
	 * @param ctx the parse tree
	 */
	void enterLeaf(@NotNull CordSASParser.LeafContext ctx);
	/**
	 * Exit a parse tree produced by {@link CordSASParser#leaf}.
	 * @param ctx the parse tree
	 */
	void exitLeaf(@NotNull CordSASParser.LeafContext ctx);
	/**
	 * Enter a parse tree produced by {@link CordSASParser#dataref}.
	 * @param ctx the parse tree
	 */
	void enterDataref(@NotNull CordSASParser.DatarefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CordSASParser#dataref}.
	 * @param ctx the parse tree
	 */
	void exitDataref(@NotNull CordSASParser.DatarefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link CordSASParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(@NotNull CordSASParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link CordSASParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(@NotNull CordSASParser.MethodCallContext ctx);
}