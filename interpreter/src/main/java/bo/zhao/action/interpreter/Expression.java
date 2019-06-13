package bo.zhao.action.interpreter;

/**
 * @author Bo.Zhao
 * @since 19/6/12
 */
public abstract class Expression {

    public abstract int interpret();

    @Override
    public abstract String toString();
}
