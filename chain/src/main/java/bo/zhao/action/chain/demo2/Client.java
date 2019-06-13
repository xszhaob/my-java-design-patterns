package bo.zhao.action.chain.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/13
 */
public class Client {

    public static void main(String[] args) {

        Handler handler = new SuperiorHandler(new HRHandler(new FinanceManagerHandler(new CTOHandler(null))));

        handler.handle(new LeaveRequest(LeaveType.PERSONAL, 3, "张三"));
    }
}
