package bo.zhao.action.builder;

/**
 * @author Bo.Zhao
 * @since 19/5/22
 */
public enum HairType {

  BALD("bald"), SHORT("short"), CURLY("curly"), LONG_STRAIGHT("long straight"), LONG_CURLY(
      "long curly");

  private String title;

  HairType(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }
}
