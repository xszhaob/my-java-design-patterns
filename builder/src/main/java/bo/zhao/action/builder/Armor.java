package bo.zhao.action.builder;

/**
 * @author Bo.Zhao
 * @since 19/5/22
 */
public enum Armor {

  CLOTHES("clothes"), LEATHER("leather"), CHAIN_MAIL("chain mail"), PLATE_MAIL("plate mail");

  private String title;

  Armor(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }
}
