package bo.zhao.action.command;

/**
 * @author Bo.Zhao
 * @since 19/5/22
 */
public class Goblin extends Target {

    public Goblin() {
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
    }

    @Override
    public String toString() {
        return "Goblin";
    }
}
