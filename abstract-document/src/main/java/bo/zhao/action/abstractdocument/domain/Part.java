package bo.zhao.action.abstractdocument.domain;

import bo.zhao.action.abstractdocument.AbstractDocument;

import java.util.Map;

/**
 * @author Bo.Zhao
 * @since 18/10/10
 */
public class Part extends AbstractDocument implements HasType, HasPrice, HasModel {

    public Part(Map<String, Object> properties) {
        super(properties);
    }
}
