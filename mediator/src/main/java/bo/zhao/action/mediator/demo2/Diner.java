package bo.zhao.action.mediator.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/17
 */
public class Diner {

    private Waiter waiter;

    public Diner(Waiter waiter) {
        this.waiter = waiter;
    }

    public void orderDishes() {
        waiter.orderDish("佛跳墙");
    }

    public void settleAccounts() {
        waiter.settleAccounts();
    }

    public String pay() {
        String account = "123123213";
        System.out.println("顾客用账号" + account + "付账");
        return account;
    }
}
