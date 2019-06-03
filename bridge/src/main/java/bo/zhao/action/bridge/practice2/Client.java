package bo.zhao.action.bridge.practice2;

/**
 * @author Bo.Zhao
 * @since 19/5/26
 */
public class Client {
    public static void main(String[] args) {
        //白色
        Color white = new White();
        //正方形
        Shape square = new Square();
        //白色的正方形
        square.setColor(white);
        square.draw();

        //长方形
        Shape rectangle = new Rectangle();
        rectangle.setColor(white);
        rectangle.draw();
    }
}
