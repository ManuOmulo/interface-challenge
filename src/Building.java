record Geometry(int x, int y) {};
record Icon(String marker) {};

interface Mappable {
  String label();
  Geometry point();
  Icon marker();
}

public class Building {

}
