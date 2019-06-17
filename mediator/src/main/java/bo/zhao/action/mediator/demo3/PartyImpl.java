package bo.zhao.action.mediator.demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bo.Zhao
 * @since 19/6/17
 */
public class PartyImpl implements Party {

    private final List<PartyMember> members;

    public PartyImpl() {
        members = new ArrayList<>();
    }

    @Override
    public void addMember(PartyMember member) {
        members.add(member);
        member.joinedParty(this);
    }

    @Override
    public void act(PartyMember actor, Action action) {
        for (PartyMember member : members) {
            if (!member.equals(actor)) {
                member.partyAction(action);
            }
        }
    }
}
