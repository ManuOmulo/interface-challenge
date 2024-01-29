public class Building implements Mappable{
  private String name;
  private String usage;

  public Building(String name, String usage) {
    this.name = name;
    this.usage = usage;
  }

  public String getName() {
    return name;
  }

  public String getUsage() {
    return usage.toUpperCase();
  }

  @Override
  public String label() {
    return """
        %s (%s)
        """.formatted(getName(), getUsage())
    ;
  }

  @Override
  public Geometry geometryType() {
    return Geometry.POINT;
  }

  @Override
  public String marker() {
    return "RED STAR";
  }
}
