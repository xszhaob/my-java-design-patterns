package bo.zhao.action.abstractfactory;


import bo.zhao.action.abstractfactory.impl.ElfKingdomFactory;
import bo.zhao.action.abstractfactory.impl.OrcKingdomFactory;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Bo.Zhao
 * @since 18/10/9
 */
@Getter
@Setter
@ToString
public class App {

    private King king;
    private Castle castle;
    private Army army;

    public void createKingdom(final KingdomFactory factory) {
        setKing(factory.createKing());
        setCastle(factory.createCastle());
        setArmy(factory.createArmy());
    }

    public static class FactoryMaker {
        @Getter
        public enum KingdomType {
            ORC("Orc Kingdom"), ELF("Elf Kingdom");

            private String desc;

            KingdomType(String desc) {
                this.desc = desc;
            }
        }

        public static KingdomFactory makeFactory(KingdomType type) {
            switch (type) {
                case ELF:
                    return new ElfKingdomFactory();
                case ORC:
                    return new OrcKingdomFactory();
                default:
                    throw new IllegalArgumentException("KingdomType not supported.");
            }
        }
    }

    public static void main(String[] args) {
        App app = new App();
        show(app, FactoryMaker.KingdomType.ELF);
        show(app, FactoryMaker.KingdomType.ORC);
    }

    private static void show(App app, FactoryMaker.KingdomType type) {
        System.out.println(type.getDesc());
        app.createKingdom(FactoryMaker.makeFactory(type));
        System.out.println(app.getKing().getDescription());
        System.out.println(app.getCastle().getDescription());
        System.out.println(app.getArmy().getDescription());
    }
}
