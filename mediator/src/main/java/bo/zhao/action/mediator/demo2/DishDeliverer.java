package bo.zhao.action.mediator.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/17
 */
public class DishDeliverer {

    private Waiter waiter;

    public DishDeliverer(Waiter waiter) {
        this.waiter = waiter;
    }

    public void deliverer(String food) {
        System.out.println("传菜员从厨房传菜：" + food);
        waiter.deliverer(food);
    }
}
