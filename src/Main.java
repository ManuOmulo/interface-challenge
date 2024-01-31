interface Mappable {
  String JSON_PROPERTY = """
  "properties":""";
  String label();
  Geometry geometryType();
  String marker();
  static void printProperties(Mappable item) {
    if (item instanceof Building building) {
      System.out.printf("""
        %s {"type": "%s", "label": "%s", "marker": "%s", "name": "%s", "usage": "%s"}
        """,
          Mappable.JSON_PROPERTY, building.geometryType(), building.label(), building.marker(), building.getName(), building.getUsage()
      );
    } else if (item instanceof UtilityLine line) {
      System.out.printf("""
        %s {"type": "%s", "label": "%s", "marker": "%s", "name": "%s", "utility": "%s"}
        """,
          Mappable.JSON_PROPERTY, line.geometryType(), line.label(), line.marker(), line.getName(), line.getUtility()
      );
    }
  }

  default void toJson() {
    System.out.printf("""
        type: %s, label: %s, marker: %s \n
        """,
        geometryType(), label(), marker()
    );
  }
}

public class Main {
  public static void main(String[] args) {
    Building b1 = new Building("Times Towers", "office space");
    Mappable.printProperties(b1);

    UtilityLine line1 = new UtilityLine("Town Complex", "Internet");
    Mappable.printProperties(line1);
  }
}
