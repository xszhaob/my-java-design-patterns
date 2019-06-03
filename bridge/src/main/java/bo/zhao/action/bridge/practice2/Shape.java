package bo.zhao.action.bridge.practice2;

/**
 * @author Bo.Zhao
 * @since 19/5/26
 */
public abstract class Shape {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
