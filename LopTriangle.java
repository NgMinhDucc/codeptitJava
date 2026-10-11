import java.util.*;

class Point {
  double x, y;

  // NOTE: Point's constructor
  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  // NOTE: return a new Point object
  public static Point nextPoint(Scanner sc) {
    return new Point(sc.nextDouble(), sc.nextDouble());
  }

  public double distance(Point other) {
    return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
  }
}

class Triangle {
  Point a, b, c;

  public Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public boolean valid() {
    double ab = this.a.distance(this.b);
    double bc = this.b.distance(this.c);
    double ac = this.a.distance(this.c);

    if (ab + bc > ac && ab + ac > bc && bc + ac > ab) {
      return true;
    }
    return false;
  }

  public String getPerimeter() {
    double ab = this.a.distance(this.b);
    double bc = this.b.distance(this.c);
    double ac = this.a.distance(this.c);

    return String.format("%.3f", ab + bc + ac);
  }
}

public class LopTriangle {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
