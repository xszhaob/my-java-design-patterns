package bo.zhao.action.abstractfactory.impl;

import bo.zhao.action.abstractfactory.Army;

/**
 * @author Bo.Zhao
 * @since 18/10/9
 */
public class OrcArmy implements Army {

    private static final String DESCRIPTION = "This is the Orc Army!";


    public String getDescription() {
        return DESCRIPTION;
    }
}
