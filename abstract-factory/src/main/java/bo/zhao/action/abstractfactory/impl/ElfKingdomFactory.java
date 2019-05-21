package bo.zhao.action.abstractfactory.impl;

import bo.zhao.action.abstractfactory.Army;
import bo.zhao.action.abstractfactory.Castle;
import bo.zhao.action.abstractfactory.King;
import bo.zhao.action.abstractfactory.KingdomFactory;

/**
 * @author Bo.Zhao
 * @since 18/10/9
 */
public class ElfKingdomFactory implements KingdomFactory {

    public Castle createCastle() {
        return new ElfCastle();
    }

    public King createKing() {
        return new ElfKing();
    }

    public Army createArmy() {
        return new ElfArmy();
    }
}
