package bo.zhao.action.chain.demo1;

/**
 * @author Bo.Zhao
 * @since 19/5/22
 */
public class OrcKing {

    RequestHandler chain;

    public OrcKing() {
        buildChain();
    }

    private void buildChain() {
        chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(Request request) {
        chain.handleRequest(request);
    }
}
