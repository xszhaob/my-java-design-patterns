package bo.zhao.action.flyweight.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/4
 */
public class PositionShape {

    private Shape shape;

    private int height;

    private int weight;

    public PositionShape(Shape shape) {
        this.shape = shape;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void print() {
        shape.draw();
        System.out.println("这是一个位于绘画板上高" + height + "毫米，宽" + weight + "毫米的" + shape.name());
    }
}
