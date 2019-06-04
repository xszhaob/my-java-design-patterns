package bo.zhao.action.flyweight.demo1;

import java.util.EnumMap;
import java.util.Map;

/**
 * @author Bo.Zhao
 * @since 19/6/4
 */
public class PotionFactory {
    private Map<PotionType, Potion> potionMap;


    public PotionFactory() {
        potionMap = new EnumMap<>(PotionType.class);
    }


    public Potion createPotion(PotionType type) {
        Potion potion = potionMap.get(type);
        if (potion == null) {
            switch (type) {
                case HEALING:
                    potion = new HealingPotion();
                    break;
                case POISON:
                    potion = new PoisonPotion();
                    break;
                case STRENGTH:
                    potion = new StrengthPotion();
                    break;
                default:
                    break;
            }
            potionMap.put(type, potion);
        }
        return potion;
    }
}
