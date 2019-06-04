package bo.zhao.action.flyweight.demo1;

/**
 * @author Bo.Zhao
 * @since 19/6/4
 */
public class PoisonPotion implements Potion {

    @Override
    public void drink() {
        String format = String.format("Urgh! This is poisonous. (Potion=%s)", System.identityHashCode(this));
        System.out.println(format);
    }
}
