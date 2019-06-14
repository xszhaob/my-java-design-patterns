package bo.zhao.action.command.demo1;

/**
 * @author Bo.Zhao
 * @since 19/5/22
 */
public abstract class Command {

    public abstract void execute(Target target);

    public abstract void undo();

    public abstract void redo();

    @Override
    public abstract String toString();
}
