package bo.zhao.action.mediator.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/17
 */
public class Client {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Checker checker = new Checker(waiter);
        Cook cook = new Cook(waiter);
        DishDeliverer dishDeliverer = new DishDeliverer(waiter);
        Diner diner = new Diner(waiter);
        waiter.setChecker(checker);
        waiter.setCook(cook);
        waiter.setDiner(diner);
        waiter.setDishDeliverer(dishDeliverer);

        diner.orderDishes();
        diner.settleAccounts();
    }
}
