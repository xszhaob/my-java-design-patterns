package bo.zhao.action.facade.demo;

/**
 * @author Bo.Zhao
 * @since 19/6/3
 */
public class Client {
    public static void main(String[] args) {
        Query query = new Query();
        String data = query.query("testId");
        System.out.println(data);
    }
}
