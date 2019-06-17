package bo.zhao.action.command.demo2;

public class CopyCommand extends Command {

    public CopyCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        if (!(receiver instanceof Document)) {
            throw new IllegalArgumentException("receiver must be Document class");
        }
        Document document = (Document) receiver;
        System.out.println("Copy string from "
                + document.getTitle() +
                ", the copy content is \"" + document.copy(1, 5) + "\"");
    }
}
