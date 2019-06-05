package bo.zhao.action.proxy.demo1;

/**
 * @author Bo.Zhao
 * @since 19/6/5
 */
public class WizardTowerProxy implements WizardTower {
    public static final int MAX_NUM = 3;

    private int numWizards;

    private final WizardTower wizardTower;

    public WizardTowerProxy(WizardTower wizardTower) {
        this.wizardTower = wizardTower;
    }

    @Override
    public void enter(Wizard wizard) {
        if (numWizards < MAX_NUM) {
            wizardTower.enter(wizard);
            numWizards++;
        } else {
            System.out.println(wizard + " is not allowed to enter!");
        }
    }
}
