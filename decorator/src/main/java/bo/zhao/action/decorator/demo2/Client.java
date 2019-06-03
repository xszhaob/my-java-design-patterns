package bo.zhao.action.decorator.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/3
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("基础圆形");
        Shape circle = new Circle();
        circle.draw();
        System.out.println();

        System.out.println("基础正方形");
        Shape square = new Square();
        square.draw();
        System.out.println();


        System.out.println("着色的圆形");
        Shape colorShape = new GreenShape(circle);
        colorShape.draw();
        System.out.println();

        System.out.println("着色的正方形");
        colorShape = new RedShape(square);
        colorShape.draw();
    }
}
