package bo.zhao.action.decorator.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/3
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个正方形");
    }
}
