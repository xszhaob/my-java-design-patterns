package bo.zhao.action.bridge;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * @author Bo.Zhao
 * @since 19/5/17
 */
public class HammerTest extends WeaponTest {

    @Test
    public void test() {
        Weapon weapon = Mockito.spy(new Hammer(Mockito.mock(FlyingEnchantment.class)));
        testBasicWeaponActions(weapon);
    }
}
