// Generated from Expr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(ExprParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#callDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallDecl(ExprParser.CallDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(ExprParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(ExprParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#agsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgsList(ExprParser.AgsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#d_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD_block(ExprParser.D_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code d_callDecl}
	 * labeled alternative in {@link ExprParser#d_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD_callDecl(ExprParser.D_callDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code d_form}
	 * labeled alternative in {@link ExprParser#d_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD_form(ExprParser.D_formContext ctx);
	/**
	 * Visit a parse tree produced by the {@code d_while}
	 * labeled alternative in {@link ExprParser#d_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD_while(ExprParser.D_whileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link ExprParser#d_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ExprParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code d_ifm}
	 * labeled alternative in {@link ExprParser#d_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD_ifm(ExprParser.D_ifmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link ExprParser#d_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(ExprParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ibreak}
	 * labeled alternative in {@link ExprParser#d_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIbreak(ExprParser.IbreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#whilei}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilei(ExprParser.WhileiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#d_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD_if(ExprParser.D_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#d_elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD_elseif(ExprParser.D_elseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#d_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD_else(ExprParser.D_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#d_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD_for(ExprParser.D_forContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(ExprParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addaddsubsub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddaddsubsub(ExprParser.AddaddsubsubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ExprParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addsubnum}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddsubnum(ExprParser.AddsubnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code itrue}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItrue(ExprParser.ItrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddsub(ExprParser.AddsubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inull}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInull(ExprParser.InullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifalse}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfalse(ExprParser.IfalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(ExprParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuldiv(ExprParser.MuldivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code call}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(ExprParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imodle}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImodle(ExprParser.ImodleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relate}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelate(ExprParser.RelateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ExprParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code power}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(ExprParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(ExprParser.ExprListContext ctx);
}