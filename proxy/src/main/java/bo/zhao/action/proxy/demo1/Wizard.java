package bo.zhao.action.proxy.demo1;

/**
 * @author Bo.Zhao
 * @since 19/6/5
 */
public class Wizard {
    private String name;

    public Wizard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
