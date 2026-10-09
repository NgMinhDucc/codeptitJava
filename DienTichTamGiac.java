import java.util.*;

public class DienTichTamGiac {
  public static class Point {
    double x, y;

    public Point (double x, double y) {
      this.x = x;
      this.y = y;
    }

    public double distance (Point other) {
      return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());

    int test = sc.nextInt();
    while (test-- > 0) {
      Point a = new Point(sc.nextDouble(), sc.nextDouble());
      Point b = new Point(sc.nextDouble(), sc.nextDouble());
      Point c = new Point(sc.nextDouble(), sc.nextDouble());

      double ab = a.distance(b);
      double bc = b.distance(c);
      double ac = a.distance(c);

      if (ab + bc > ac && ab + ac > bc && bc + ac > ab) {
        double area = Math.sqrt(ab + bc + ac) * Math.sqrt(ab + bc - ac) * Math.sqrt(bc + ac - ab) * Math.sqrt(ac + ab - bc) / 4;
        System.out.printf("%.2f\n", area);
      }
      else {
        System.out.println("INVALID");
      }
    }

    sc.close();
  }
}
