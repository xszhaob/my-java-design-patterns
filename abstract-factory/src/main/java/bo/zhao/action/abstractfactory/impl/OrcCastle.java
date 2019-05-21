package bo.zhao.action.abstractfactory.impl;

import bo.zhao.action.abstractfactory.Castle;

/**
 * @author Bo.Zhao
 * @since 18/10/9
 */
public class OrcCastle implements Castle {

    private static final String DESCRIPTION = "This is the Orc castle!";


    public String getDescription() {
        return DESCRIPTION;
    }
}
