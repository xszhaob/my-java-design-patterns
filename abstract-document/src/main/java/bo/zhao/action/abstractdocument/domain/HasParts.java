package bo.zhao.action.abstractdocument.domain;

import bo.zhao.action.abstractdocument.Document;

import java.util.stream.Stream;

/**
 * @author Bo.Zhao
 * @since 18/10/10
 */
public interface HasParts extends Document {

    String PROPERTY = "parts";

    default Stream<Part> getPart() {
        return children(PROPERTY, Part::new);
    }
}
