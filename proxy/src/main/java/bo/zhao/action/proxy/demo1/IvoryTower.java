package bo.zhao.action.proxy.demo1;

/**
 * @author Bo.Zhao
 * @since 19/6/5
 */
public class IvoryTower implements WizardTower {


    @Override
    public void enter(Wizard wizard) {
        System.out.println(wizard + " enter ivory tower");
    }
}
