import java.util.*;

public class SoPhuc {
  public static class SP {
    int x, y;

    public SP (int x, int y) {
      this.x = x;
      this.y = y;
    }
    public SP add(SP b){
      return new SP(this.x + b.x, this.y + b.y);
    } 

    public  SP mul(SP b){
      return new SP(this.x * b.x - this.y * b.y, this.x * b.y + this.y * b.x);
    }

    @Override 
    public String toString() {
      return String.format("%d + %di", this.x, this.y);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int test = sc.nextInt();
    while (test-- > 0) {
      SP a = new SP(sc.nextInt(), sc.nextInt());
      SP b = new SP(sc.nextInt(), sc.nextInt());
      SP sum = a.add(b);
      SP c = sum.mul(a);
      SP d = sum.mul(sum);
      System.out.println(c+", "+d);
    }

    sc.close();
  }
}
