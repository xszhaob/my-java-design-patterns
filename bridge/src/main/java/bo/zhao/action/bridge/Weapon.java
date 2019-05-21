package bo.zhao.action.bridge;

/**
 * @author Bo.Zhao
 * @since 19/5/17
 */
public interface Weapon {

    void wield();

    void swing();

    void unwield();

    Enchantment getEnchantment();
}
