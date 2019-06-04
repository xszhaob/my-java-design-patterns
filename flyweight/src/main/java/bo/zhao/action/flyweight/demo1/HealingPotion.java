package bo.zhao.action.flyweight.demo1;

/**
 * @author Bo.Zhao
 * @since 19/6/4
 */
public class HealingPotion implements Potion {

    @Override
    public void drink() {
        String format = String.format("You feel healed. (Potion=%s)", System.identityHashCode(this));
        System.out.println(format);
    }
}
