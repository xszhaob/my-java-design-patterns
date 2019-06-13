package bo.zhao.action.chain.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/13
 */
public class HRHandler extends Handler {

    public HRHandler(Handler next) {
        super(next);
    }

    @Override
    public void handle(LeaveRequest request) {
        if (request.getType() == LeaveType.ANNUAL) {
            System.out.println("请年假" + request.getLeaveDays() + "天，从年假中扣除");
        }
        super.handle(request);
    }
}
