package bo.zhao.action.command;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Bo.Zhao
 * @since 19/5/22
 */
public class Wizard {

    private Deque<Command> undoStack = new LinkedList<>();
    private Deque<Command> redoStack = new LinkedList<>();

    public void castSpell(Command command, Target target) {
        System.out.println(String.format("%s casts %s at %s", this, command, target));
        command.execute(target);
        undoStack.offerLast(command);
    }

    public void undoLastSpell() {
        if (!undoStack.isEmpty()) {
            Command previousSpell = undoStack.pollLast();
            redoStack.offerLast(previousSpell);
            previousSpell.undo();
        }
    }


    public void redoLastSpell() {
        if (!redoStack.isEmpty()) {
            Command previousSpell = redoStack.pollLast();
            undoStack.offerLast(previousSpell);
            previousSpell.redo();
        }
    }

    @Override
    public String toString() {
        return "Wizard";
    }
}
