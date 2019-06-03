package bo.zhao.action.adapter.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/2
 */
public class DrawingShape implements Shape {

    private Drawing drawing;

    public DrawingShape(Drawing drawing) {
        this.drawing = drawing;
    }

    @Override
    public void draw() {
        System.out.println("实现复杂，因此打算使用已有工具类，将绘制不规则图形的请求转发给Drawing");
        drawing.drawIrregularFigure();
    }
}
