package bo.zhao.action.flyweight.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/4
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画" + name());
    }

    @Override
    public String name() {
        return "正方形" + System.identityHashCode(this);
    }
}
