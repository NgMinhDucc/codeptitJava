import java.util.*;

public class KhaiBaoLopPoint {
  public static class Point {
    private double x;
    private double y;

    public Point (double x, double y) {
      // NOTE: assign parameter's value to object's variable
      this.x = x;
      this.y = y;
    }

    // public double getX () {
    //   return this.x;
    // }

    // public double getY () {
    //   return this.y;
    // }

    public double distance (Point other) {
      return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    // @Override
    // public String toString () {
    //   return super.toString();
    // }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int test = sc.nextInt();
    while (test-- > 0) {
      Point a = new Point(sc.nextDouble(), sc.nextDouble());
      Point b = new Point(sc.nextDouble(), sc.nextDouble());

      System.out.printf("%.4f\n", a.distance(b));
    }

    sc.close();
  }
}
