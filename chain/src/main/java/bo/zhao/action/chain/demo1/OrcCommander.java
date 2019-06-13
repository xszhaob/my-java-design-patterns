package bo.zhao.action.chain.demo1;

/**
 * @author Bo.Zhao
 * @since 19/5/22
 */
public class OrcCommander extends RequestHandler {

    public OrcCommander(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals(RequestType.DEFEND_CASTLE)) {
            printHandling(request);
            request.markHandled();
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Orc commander";
    }
}
