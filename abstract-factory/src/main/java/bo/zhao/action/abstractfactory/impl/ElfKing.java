package bo.zhao.action.abstractfactory.impl;

import bo.zhao.action.abstractfactory.King;

/**
 * @author Bo.Zhao
 * @since 18/10/9
 */
public class ElfKing implements King {
    private static final String DESCRIPTION = "This is the Elven king!";

    public String getDescription() {
        return DESCRIPTION;
    }
}
