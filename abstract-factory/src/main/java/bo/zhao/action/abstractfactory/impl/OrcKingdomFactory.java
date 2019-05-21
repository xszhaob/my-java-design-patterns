package bo.zhao.action.abstractfactory.impl;

import bo.zhao.action.abstractfactory.Army;
import bo.zhao.action.abstractfactory.Castle;
import bo.zhao.action.abstractfactory.King;
import bo.zhao.action.abstractfactory.KingdomFactory;

/**
 * @author Bo.Zhao
 * @since 18/10/9
 */
public class OrcKingdomFactory implements KingdomFactory {
    public Castle createCastle() {
        return new OrcCastle();
    }

    public King createKing() {
        return new OrcKing();
    }

    public Army createArmy() {
        return new OrcArmy();
    }
}
