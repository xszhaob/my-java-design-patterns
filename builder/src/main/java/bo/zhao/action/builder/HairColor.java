package bo.zhao.action.builder;

/**
 * @author Bo.Zhao
 * @since 19/5/22
 */
public enum HairColor {

  WHITE, BLOND, RED, BROWN, BLACK;

  @Override
  public String toString() {
    return name().toLowerCase();
  }

}
