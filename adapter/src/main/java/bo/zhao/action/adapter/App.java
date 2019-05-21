package bo.zhao.action.adapter;

/**
 * @author Bo.Zhao
 * @since 19/5/17
 */
public class App {

    public static void main(String[] args) {
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
