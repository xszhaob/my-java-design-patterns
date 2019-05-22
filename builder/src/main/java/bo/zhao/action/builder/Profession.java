package bo.zhao.action.builder;

/**
 * @author Bo.Zhao
 * @since 19/5/22
 */
public enum Profession {

  WARRIOR, THIEF, MAGE, PRIEST;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
