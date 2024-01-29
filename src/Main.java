interface Mappable {
  String JSON_PROPERTY = """
  "properties":
  """;
  String label();
  Geometry geometryType();
  String marker();
  default void toJson() {
    System.out.printf("%s {type: %s, label: %s, marker: %s} \n", JSON_PROPERTY, geometryType(), label(), marker());
  }
}

public class Main {
  public static void main(String[] args) {
    Building b1 = new Building("Times Towers", "office space");
    System.out.println(b1.geometryType());

    UtilityLine line1 = new UtilityLine("Town Complex", "Internet");
    System.out.println(line1.geometryType());
  }
}
