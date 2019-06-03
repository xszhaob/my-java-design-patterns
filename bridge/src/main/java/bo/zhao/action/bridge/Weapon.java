package bo.zhao.action.bridge;

/**
 * 武器接口
 *
 * @author Bo.Zhao
 * @since 19/5/17
 */
public interface Weapon {

    void wield();

    void swing();

    void unwield();

    Enchantment getEnchantment();
}
