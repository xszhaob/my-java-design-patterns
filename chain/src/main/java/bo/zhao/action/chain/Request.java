package bo.zhao.action.chain;

import java.util.Objects;

/**
 * @author Bo.Zhao
 * @since 19/5/22
 */
public class Request {
    private final RequestType requestType;

    private final String requestDescription;

    private boolean handled;

    public Request(RequestType requestType, String requestDescription) {
        this.requestType = Objects.requireNonNull(requestType);
        this.requestDescription = Objects.requireNonNull(requestDescription);
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public boolean isHandled() {
        return handled;
    }

    public void markHandled() {
        this.handled = true;
    }

    @Override
    public String toString() {
        return getRequestDescription();
    }
}
