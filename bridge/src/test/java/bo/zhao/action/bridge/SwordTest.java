package bo.zhao.action.bridge;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * @author Bo.Zhao
 * @since 19/5/17
 */
public class SwordTest extends WeaponTest {

    @Test
    public void test() {
        Weapon weapon = Mockito.spy(new Sword(Mockito.mock(SoulEatingEnchantment.class)));
        testBasicWeaponActions(weapon);
    }
}
