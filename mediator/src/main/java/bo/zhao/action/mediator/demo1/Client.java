package bo.zhao.action.mediator.demo1;

/**
 * @author Bo.Zhao
 * @since 19/6/17
 */
public class Client {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User zhangSan = new User("张三");
        zhangSan.setChatRoom(chatRoom);
        User liSi = new User("李四");
        liSi.setChatRoom(chatRoom);

        chatRoom.joinChatRoom(zhangSan);
        chatRoom.joinChatRoom(liSi);
        zhangSan.sendMessage("李四", "李四你好啊！");
    }
}
