public class UtilityLine implements Mappable{
  private String name;
  private String utility;

  public UtilityLine(String name, String utility) {
    this.name = name;
    this.utility = utility;
  }

  public String getName() {
    return name;
  }

  public String getUtility() {
    return utility.toUpperCase();
  }

  @Override
  public String label() {
    return """
        %s (%s)""".formatted(getName(), getUtility())
    ;
  }

  @Override
  public Geometry geometryType() {
    return Geometry.LINE;
  }

  @Override
  public String marker() {
    return "GREEN DOTTED";
  }
}
