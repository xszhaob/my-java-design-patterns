package bo.zhao.action.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author Bo.Zhao
 * @since 19/5/22
 */
public class HeroTest {


    @Test
    public void testBuildHero() {
        final String heroName = "Sir Lancelot";

        final Hero hero = new Hero.Builder(Profession.WARRIOR, heroName)
                .armor(Armor.CHAIN_MAIL)
                .weapon(Weapon.SWORD)
                .hairType(HairType.LONG_CURLY)
                .hairColor(HairColor.BLOND)
                .build();

        assertNotNull(hero);
        assertNotNull(hero.toString());
        assertEquals(Profession.WARRIOR, hero.getProfession());
        assertEquals(heroName, hero.getName());
        assertEquals(Armor.CHAIN_MAIL, hero.getArmor());
        assertEquals(Weapon.SWORD, hero.getWeapon());
        assertEquals(HairType.LONG_CURLY, hero.getHairType());
        assertEquals(HairColor.BLOND, hero.getHairColor());

    }
}
