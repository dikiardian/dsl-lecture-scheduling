// Generated from antlrfiles/Schedule.g4 by ANTLR 4.7.1
package antlrfiles;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScheduleParser}.
 */
public interface ScheduleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(ScheduleParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(ScheduleParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ScheduleParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ScheduleParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(ScheduleParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(ScheduleParser.EndContext ctx);
}