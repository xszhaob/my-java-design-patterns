package bo.zhao.action.chain.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/13
 */
public class FinanceManagerHandler extends Handler {

    public FinanceManagerHandler(Handler next) {
        super(next);
    }

    @Override
    public void handle(LeaveRequest request) {
        if (request.getType() == LeaveType.PERSONAL) {
            System.out.println("请事假" + request.getLeaveDays() + "天，需扣除工资");
        }
        super.handle(request);
    }
}
