package bo.zhao.action.proxy.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/5
 */
public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        MyInvocationHandler handler = new MyInvocationHandler(userService);

        UserService service = (UserService) handler.getProxy();
        service.addUser("foo");
    }
}
