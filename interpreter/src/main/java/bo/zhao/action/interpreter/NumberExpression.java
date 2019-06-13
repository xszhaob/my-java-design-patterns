package bo.zhao.action.interpreter;

/**
 * @author Bo.Zhao
 * @since 19/6/12
 */
public class NumberExpression extends Expression {

    private int num;

    public NumberExpression(int num) {
        this.num = num;
    }

    public NumberExpression(String num) {
        this.num = Integer.parseInt(num);
    }

    @Override
    public int interpret() {
        return num;
    }

    @Override
    public String toString() {
        return "number";
    }
}
