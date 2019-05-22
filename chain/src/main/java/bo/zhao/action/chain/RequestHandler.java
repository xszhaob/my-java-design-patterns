package bo.zhao.action.chain;

/**
 * @author Bo.Zhao
 * @since 19/5/22
 */
public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        if (next != null) {
            next.handleRequest(request);
        }
    }

    protected void printHandling(Request request) {
        System.out.println(String.format("%s handling request \"%s\"", this, request));
    }

    @Override
    public abstract String toString();
}
