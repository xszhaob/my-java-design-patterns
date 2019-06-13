package bo.zhao.action.chain.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/13
 */
public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(LeaveRequest request) {
        if (next != null) {
            next.handle(request);
        }
    }
}
