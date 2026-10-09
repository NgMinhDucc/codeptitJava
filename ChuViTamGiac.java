import java.util.*;

public class ChuViTamGiac {
  public static class Point {
    double x, y;

    public Point (double x, double y) {
      this.x = x;
      this.y = y;
    }

    public void ChuVi (Point B, Point C) {
      double s = Math.abs(this.x * (B.y - C.y) + B.x * (C.y - this.y) + C.x * (this.y - B.y)) / 2;
      if (s == 0) {
        System.out.print("INVALID\n");
      }
      else {
        double ab = Math.sqrt(Math.pow(B.x - this.x, 2) + Math.pow(B.y - this.y, 2));
        double bc = Math.sqrt(Math.pow(C.x - B.x, 2) + Math.pow(C.y - B.y, 2));
        double ac = Math.sqrt(Math.pow(this.x - C.x, 2) + Math.pow(this.y - C.y, 2));

        System.out.printf("%.3f\n", ab + bc + ac);
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int test = sc.nextInt();
    while (test-- > 0) {
      Point A = new Point(sc.nextDouble(), sc.nextDouble());
      Point B = new Point(sc.nextDouble(), sc.nextDouble());
      Point C = new Point(sc.nextDouble(), sc.nextDouble());
      A.ChuVi(B, C);
    }

    sc.close();
  }
}
