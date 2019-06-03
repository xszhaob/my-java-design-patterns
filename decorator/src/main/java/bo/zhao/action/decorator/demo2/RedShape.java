package bo.zhao.action.decorator.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/3
 */
public class RedShape extends Decorator {

    public RedShape(Shape shape) {
        super(shape);
    }

    @Override
    public void colorUp() {
        System.out.println("给图形着红色");
    }
}
