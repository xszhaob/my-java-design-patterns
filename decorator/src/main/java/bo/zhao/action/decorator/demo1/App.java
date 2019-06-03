package bo.zhao.action.decorator.demo1;

/**
 * @author Bo.Zhao
 * @since 19/5/27
 */
public class App {
    public static void main(String[] args) {
        System.out.println("A simple looking troll approaches.");
        Troll troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        System.out.println(String.format("Simple troll power %s.", troll.getAttackPower()));

        System.out.println("A troll with huge club surprises you.");
        Troll clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
        System.out.println(String.format("Clubbed troll power %s", clubbedTroll.getAttackPower()));
    }
}
