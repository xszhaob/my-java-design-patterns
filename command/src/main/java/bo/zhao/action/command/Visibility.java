package bo.zhao.action.command;

/**
 * @author Bo.Zhao
 * @since 19/5/22
 */
public enum Visibility {

    VISIBLE("visible"), INVISIBLE("invisible");

    private String title;

    Visibility(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
