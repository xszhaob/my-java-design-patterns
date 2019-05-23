package bo.zhao.action.builder.practice2;

/**
 * @author Bo.Zhao
 * @since 19/5/23
 */
public class Director {
    public Product construct() {
        for (int i = 0; i < 5; i++) {
            builder.buildPart();
        }

        return builder.result();
    }

    private Builder builder = new ConcreteBuilder();
}
