interface Mappable {
  String JSON_PROPERTY = """
  "properties": {%s}
  """;
  String label();
  Geometry geometryType();
  String marker();
  void printProperties(Mappable item);

  default void toJson() {
    System.out.printf("type: %s, label: %s, marker: %s \n", geometryType(), label(), marker());
  }
}

public class Main {
  public static void main(String[] args) {
    Building b1 = new Building("Times Towers", "office space");
    System.out.println(Mappable.JSON_PROPERTY);
    UtilityLine line1 = new UtilityLine("Town Complex", "Internet");
  }
}
