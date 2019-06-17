package bo.zhao.action.mediator.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bo.Zhao
 * @since 19/6/17
 */
public class ChatRoom {

    private Map<String, User> userMap = new HashMap<>();

    public void joinChatRoom(User user) {
        userMap.put(user.getName(), user);
    }


    public void setMessage(String receiverName, String message, User sendUser) {
        User receiveUser = userMap.get(receiverName);
        receiveUser.receiveMessage(sendUser.getName(), message);
    }
}
