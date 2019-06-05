package bo.zhao.action.proxy.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/5
 */
public class UserServiceImpl implements UserService {

    @Override
    public void addUser(String userName) {
        System.out.println("add user " + userName);
    }
}
