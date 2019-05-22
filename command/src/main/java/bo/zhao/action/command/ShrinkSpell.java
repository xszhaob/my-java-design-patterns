package bo.zhao.action.command;

/**
 * @author Bo.Zhao
 * @since 19/5/22
 */
public class ShrinkSpell extends Command {

    private Target target;

    private Size oldSize;

    @Override
    public void execute(Target target) {
        oldSize = target.getSize();
        target.setSize(Size.SMALL);
        this.target = target;
    }

    @Override
    public void undo() {
        if (oldSize != null && target != null) {
            Size tmp = target.getSize();
            target.setSize(oldSize);
            oldSize = tmp;
        }
    }

    @Override
    public void redo() {
        undo();
    }

    @Override
    public String toString() {
        return "Shrink spell";
    }
}
