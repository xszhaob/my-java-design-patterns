package bo.zhao.action.abstractdocument.domain;

import bo.zhao.action.abstractdocument.Document;

import java.util.Optional;

/**
 * @author Bo.Zhao
 * @since 18/10/10
 */
public interface HasType extends Document {

    String PROPERTY = "type";

    default Optional<String> getType() {
        return Optional.ofNullable((String) get(PROPERTY));
    }
}
