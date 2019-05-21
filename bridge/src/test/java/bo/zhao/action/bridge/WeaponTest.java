package bo.zhao.action.bridge;

import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

/**
 * @author Bo.Zhao
 * @since 19/5/17
 */
public abstract class WeaponTest {

    protected final void testBasicWeaponActions(Weapon weapon) {
        Assertions.assertNotNull(weapon);
        Enchantment enchantment = weapon.getEnchantment();
        Assertions.assertNotNull(enchantment);

        weapon.wield();
        Mockito.verify(enchantment).onActivate();
        Mockito.verifyNoMoreInteractions(enchantment);

        weapon.swing();
        Mockito.verify(enchantment).apply();
        Mockito.verifyNoMoreInteractions(enchantment);

        weapon.unwield();
        Mockito.verify(enchantment).onDeactivate();
        Mockito.verifyNoMoreInteractions(enchantment);
    }
}
