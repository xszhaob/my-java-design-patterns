package bo.zhao.action.abstractdocument.domain;

import bo.zhao.action.abstractdocument.Document;

import java.util.Optional;

/**
 * @author Bo.Zhao
 * @since 18/10/10
 */
public interface HasPrice extends Document {
    String PROPERTY = "price";

    default Optional<Number> getPrice() {
        return Optional.ofNullable((Number) get(PROPERTY));
    }
}
