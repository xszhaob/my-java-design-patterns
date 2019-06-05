package bo.zhao.action.proxy.demo1;

/**
 * @author Bo.Zhao
 * @since 19/6/5
 */
public class App {

    public static void main(String[] args) {
        WizardTower wizardTower = new WizardTowerProxy(new IvoryTower());

        // 允许
        wizardTower.enter(new Wizard("Wizard1"));
        wizardTower.enter(new Wizard("Wizard2"));
        wizardTower.enter(new Wizard("Wizard3"));
        // 被限制
        wizardTower.enter(new Wizard("Wizard4"));
    }
}
