package bo.zhao.action.chain.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/13
 */
public class SuperiorHandler extends Handler {

    public SuperiorHandler(Handler next) {
        super(next);
    }

    @Override
    public void handle(LeaveRequest request) {
        System.out.println("处理" + request.getEmployeeName() + "的请假流程");
        super.handle(request);
    }
}
