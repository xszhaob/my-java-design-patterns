package bo.zhao.action.builder;

/**
 * @author Bo.Zhao
 * @since 19/5/22
 */
public enum Weapon {

  DAGGER, SWORD, AXE, WARHAMMER, BOW;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
