package bo.zhao.action.flyweight.demo1;

/**
 * @author Bo.Zhao
 * @since 19/6/4
 */
public class StrengthPotion implements Potion {

    @Override
    public void drink() {
        String format = String.format("You feel strong. (Potion=%s)", System.identityHashCode(this));
        System.out.println(format);
    }
}
