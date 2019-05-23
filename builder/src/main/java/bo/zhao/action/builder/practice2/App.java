package bo.zhao.action.builder.practice2;

/**
 * @author Bo.Zhao
 * @since 19/5/23
 */
public class App {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.construct();
        System.out.println(product.parts);
    }
}
