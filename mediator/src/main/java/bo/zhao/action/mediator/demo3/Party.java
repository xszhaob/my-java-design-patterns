package bo.zhao.action.mediator.demo3;

/**
 * @author Bo.Zhao
 * @since 19/6/17
 */
public interface Party {

    void addMember(PartyMember member);

    void act(PartyMember actor, Action action);
}
