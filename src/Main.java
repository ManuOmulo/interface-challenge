interface Mappable {
  String JSON_PROPERTY = """
  "properties":""";
  String label();
  Geometry geometryType();
  String marker();
  static void printProperties(Mappable item) {
    System.out.printf("""
        %s {"type": "%s", "label": "%s", "marker": "%s"}
        """,
        Mappable.JSON_PROPERTY, item.geometryType(), item.label(), item.marker()
    );
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
