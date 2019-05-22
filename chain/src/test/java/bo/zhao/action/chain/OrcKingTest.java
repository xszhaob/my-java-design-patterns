package bo.zhao.action.chain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Bo.Zhao
 * @since 19/5/22
 */
public class OrcKingTest {

    private static final Request[] REQUESTS = new Request[]{
            new Request(RequestType.DEFEND_CASTLE, "Don't let the barbarians enter my castle!!"),
            new Request(RequestType.TORTURE_PRISONER, "Don't just stand there, tickle him!"),
            new Request(RequestType.COLLECT_TAX, "Don't steal, the King hates competition ..."),
    };


    @Test
    public void testMakeRequest() {
        final OrcKing orcKing = new OrcKing();

        for (Request request : REQUESTS) {
            orcKing.makeRequest(request);
            Assertions.assertTrue(request.isHandled());
        }
    }
}
