package bo.zhao.action.adapter;

/**
 * @author Bo.Zhao
 * @since 19/5/17
 */
public class FishingBoatAdapter implements RowingBoat {

    private FishingBoat fishingBoat;

    public FishingBoatAdapter() {
        fishingBoat = new FishingBoat();
    }

    @Override
    public void row() {
        fishingBoat.sail();
    }
}
