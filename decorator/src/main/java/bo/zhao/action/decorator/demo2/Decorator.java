package bo.zhao.action.decorator.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/3
 */
public abstract class Decorator implements Shape {

    private Shape shape;

    public Decorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
        colorUp();
    }

    public abstract void colorUp();
}
