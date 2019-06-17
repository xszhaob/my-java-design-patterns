package bo.zhao.action.mediator.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/17
 */
public class Cook {

    private Waiter waiter;
    private String food;

    public Cook(Waiter waiter) {
        this.waiter = waiter;
    }

    public void receiveOrder(String food) {
        System.out.println("厨师接收菜单，需要做的美食：" + food);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignore) {
        }
        this.food = food;
        System.out.println("美食已经做好");
        finishedCook();
    }

    public void finishedCook() {
        System.out.println("厨师告诉服务员取餐");
        waiter.finishedCook(food);
    }
}
