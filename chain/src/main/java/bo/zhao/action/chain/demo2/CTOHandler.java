package bo.zhao.action.chain.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/13
 */
public class CTOHandler extends Handler {

    public CTOHandler(Handler next) {
        super(next);
    }

    @Override
    public void handle(LeaveRequest request) {
        if (request.getLeaveDays() > 1) {
            System.out.println("请假时间大于1天，需要CTO同意");
        }
        super.handle(request);
    }
}
