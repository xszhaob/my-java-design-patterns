package bo.zhao.action.bridge;

/**
 * @author Bo.Zhao
 * @since 19/5/17
 */
public class App {

    public static void main(String[] args) {
        System.out.println("The knight receives an enchanted sword.");
        Sword sword = new Sword(new SoulEatingEnchantment());
        sword.wield();
        sword.swing();
        sword.unwield();

        System.out.println("The valkyrie receives an enchanted hammer.");
        Hammer hammer = new Hammer(new FlyingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unwield();
    }
}
