package bo.zhao.action.abstractdocument.domain;

import bo.zhao.action.abstractdocument.Document;

import java.util.Optional;

/**
 * @author Bo.Zhao
 * @since 18/10/10
 */
public interface HasModel extends Document {
    String PROPERTY = "model";

    default Optional<String> getModel() {
        return Optional.ofNullable((String) get(PROPERTY));
    }
}
