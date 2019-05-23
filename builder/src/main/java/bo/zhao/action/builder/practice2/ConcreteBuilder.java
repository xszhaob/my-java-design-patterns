package bo.zhao.action.builder.practice2;

/**
 * @author Bo.Zhao
 * @since 19/5/23
 */
public class ConcreteBuilder extends Builder {

    @Override
    public void buildPart() {
        product.parts.add("Adding part #" + (part++) + "\n");
    }

    @Override
    public Product result() {
        return product;
    }

    private int part = 0;
    private Product product = new Product();
}
