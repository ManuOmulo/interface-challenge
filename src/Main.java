import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Mappable> list = new ArrayList<>();
    list.add(new Building("Times Towers", "office space"));
    list.add(new UtilityLine("Town Complex", "Internet"));
    list.add(new Building("Tivoli Center", "commercial property"));

    for (Mappable listItem : list) {
      Mappable.printProperties(listItem);
    }
  }
}
