package bo.zhao.action.mediator.demo3;

/**
 * @author Bo.Zhao
 * @since 19/6/17
 */
public abstract class PartyMemberBase implements PartyMember {

    protected Party party;

    @Override
    public void joinedParty(Party party) {
        System.out.println(String.format("%s joins the party", this));
        this.party = party;
    }

    @Override
    public void partyAction(Action action) {
        System.out.println(String.format("%s  %s", this, action.getDesc()));
    }

    @Override
    public void act(Action action) {
        if (party != null) {
            System.out.println(String.format("%s  %s", this, action));
            party.act(this, action);
        }
    }

    @Override
    public abstract String toString();
}
