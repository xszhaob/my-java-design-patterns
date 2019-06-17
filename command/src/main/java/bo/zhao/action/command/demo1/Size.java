package bo.zhao.action.command.demo1;

/**
 * @author Bo.Zhao
 * @since 19/5/22
 */
public enum Size {

    SMALL("small"), NORMAL("normal");

    private String title;

    Size(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return title;
    }
}
