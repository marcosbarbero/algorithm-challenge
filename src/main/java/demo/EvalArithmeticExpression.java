package demo;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author Marcos Barbero
 */
public class EvalArithmeticExpression {

    static final ScriptEngine javaScript = new ScriptEngineManager().getEngineByName("JavaScript");

    public static void main(String... args) {
        eval("5 + 3");
        eval("((4 - 2^3 + 1) * -sqrt(3*3+4*4)) / 2");
    }

    private static void eval(final String expression) {
        Object eval;
        try {
            eval = javaScript.eval(expression);
        } catch (ScriptException e) {
            eval = "The expression'" + expression + "' is not an valid expression";
        }
        System.out.println(eval);
    }
}
