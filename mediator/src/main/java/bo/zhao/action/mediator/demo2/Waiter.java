package bo.zhao.action.mediator.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/17
 */
public class Waiter {

    private Diner diner;
    private Cook cook;
    private Checker checker;
    private DishDeliverer dishDeliverer;

    public void setDiner(Diner diner) {
        this.diner = diner;
    }

    public void setCook(Cook cook) {
        this.cook = cook;
    }

    public void setChecker(Checker checker) {
        this.checker = checker;
    }

    public void setDishDeliverer(DishDeliverer dishDeliverer) {
        this.dishDeliverer = dishDeliverer;
    }

    private String food;

    public void orderDish(String food) {
        System.out.println("服务员为乘客点餐并交给厨师");
        this.food = food;
        cook.receiveOrder(food);
    }

    public void finishedCook(String food) {
        System.out.println("服务员得知美食已经做好，告知传菜员上菜");
        dishDeliverer.deliverer(food);
    }

    public void deliverer(String food) {
        System.out.println("给乘客上菜：" + food);
    }

    public void settleAccounts() {
        System.out.println("服务员把菜单交给收银员计算费用");
        checker.calculateCost(food);
    }

    public void pay() {
        System.out.println("服务员跟顾客核对账单并让顾客支付");
        String account = diner.pay();
        checker.collectMoney(account);
        System.out.println("结账完成");
    }
}
