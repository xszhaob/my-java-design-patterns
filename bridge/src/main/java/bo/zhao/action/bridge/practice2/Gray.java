package bo.zhao.action.bridge.practice2;

/**
 * @author Bo.Zhao
 * @since 19/5/26
 */
public class Gray implements Color {

    @Override
    public void bePaint(String shape) {
        System.out.println("灰色的" + shape);
    }
}
