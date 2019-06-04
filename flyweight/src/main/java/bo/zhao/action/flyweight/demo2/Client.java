package bo.zhao.action.flyweight.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/4
 */
public class Client {
    public static void main(String[] args) {
        DrawingBoard board = new DrawingBoard();
        board.draw();
        board.show();
    }
}
