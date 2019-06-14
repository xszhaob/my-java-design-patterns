package bo.zhao.action.command.demo2;

public class MenuItem {

    private Command command;


    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
