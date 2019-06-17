package bo.zhao.action.mediator.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/17
 */
public class Checker {

    private Waiter waiter;

    public Checker(Waiter waiter) {
        this.waiter = waiter;
    }

    public void calculateCost(String menu) {
        System.out.println("收银员计算费用，菜单" + menu);
        waiter.pay();
    }


    public void collectMoney(String account) {
        System.out.println("收银员从账户" + account + "收钱");
    }
}
