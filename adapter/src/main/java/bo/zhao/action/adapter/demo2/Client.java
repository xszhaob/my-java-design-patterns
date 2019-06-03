package bo.zhao.action.adapter.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/2
 */
public class Client {

    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("画一个圆形");
        circle.draw();

        System.out.println();
        Shape square = new Square();
        System.out.println("画一个正方形");
        square.draw();

        System.out.println();
        Drawing drawing = new Drawing();
        Shape drawingShape = new DrawingShape(drawing);
        System.out.println("画一个不规则图形");
        drawingShape.draw();
    }
}
