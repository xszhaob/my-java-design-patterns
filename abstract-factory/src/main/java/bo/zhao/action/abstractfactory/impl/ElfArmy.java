package bo.zhao.action.abstractfactory.impl;

import bo.zhao.action.abstractfactory.Army;

/**
 * @author Bo.Zhao
 * @since 18/10/9
 */
public class ElfArmy implements Army {

    private static final String DESCRIPTION = "This is the Elven Army!";

    public String getDescription() {
        return DESCRIPTION;
    }
}
