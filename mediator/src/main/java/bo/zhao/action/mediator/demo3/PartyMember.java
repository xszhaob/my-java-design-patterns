package bo.zhao.action.mediator.demo3;

/**
 * @author Bo.Zhao
 * @since 19/6/17
 */
public interface PartyMember {
    void joinedParty(Party party);

    void partyAction(Action action);

    void act(Action action);
}
