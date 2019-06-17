package bo.zhao.action.mediator.demo3;

/**
 * @author Bo.Zhao
 * @since 19/6/17
 */
public enum Action {
    HUNT("hunted a rabbit", "arrives for dinner"), TALE("tells a tale", "comes to listen"), GOLD(
            "found gold", "takes his share of the gold"), ENEMY("spotted enemies", "runs for cover"), NONE(
            "", "");

    private String title;
    private String desc;

    Action(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return title;
    }
}
