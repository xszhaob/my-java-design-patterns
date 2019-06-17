package bo.zhao.action.command.demo2;

public class Client {

    public static void main(String[] args) {
        Document document = new Document("围城");
        document.setText("围在城里的人想出来，城外的人想进去，人生的愿望大都如此。");

        Command command = new CopyCommand(document);
        MenuItem copyItem = new MenuItem();
        copyItem.setCommand(command);
        copyItem.execute();
    }
}
