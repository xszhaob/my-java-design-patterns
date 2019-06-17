package bo.zhao.action.mediator.demo1;

/**
 * @author Bo.Zhao
 * @since 19/6/17
 */
public class User {

    private final String name;

    private ChatRoom chatRoom;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public void sendMessage(String receiverName, String message) {
        chatRoom.setMessage(receiverName, message, this);
    }

    public void receiveMessage(String sendUserName, String message) {
        System.out.println(this.name + "收到【" + sendUserName + "】的消息：" + message);
    }

    @Override
    public String
    toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
