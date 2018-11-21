// Generated from antlrfiles/Schedule.g4 by ANTLR 4.7.1
package antlrfiles;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScheduleParser}.
 */
public interface ScheduleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScheduleParser#schedule}.
	 * @param ctx the parse tree
	 */
	void enterSchedule(ScheduleParser.ScheduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScheduleParser#schedule}.
	 * @param ctx the parse tree
	 */
	void exitSchedule(ScheduleParser.ScheduleContext ctx);
}