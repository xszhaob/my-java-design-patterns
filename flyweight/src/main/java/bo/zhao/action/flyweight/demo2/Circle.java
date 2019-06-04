package bo.zhao.action.flyweight.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/4
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("画" + name());
    }

    @Override
    public String name() {
        return "圆形" + System.identityHashCode(this);
    }
}
