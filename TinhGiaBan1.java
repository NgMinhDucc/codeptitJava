import java.util.*;

/**
 * TinhGiaBan1
 */
public class TinhGiaBan1 {
  public static class ChiPhi {
    static int i = 0;
    String ma, ten, dv;
    long dg, sl, vc, tt, gb;

    public ChiPhi(String ten, String dv, long dg, long sl) {
      this.ma = String.format("MH%02d", ++i);
      this.ten = ten;
      this.dv = dv;
      this.dg = dg;
      this.sl = sl;
      this.vc = Math.round((dg * sl) / 20.0);
      this.tt = Math.round(dg * sl + this.vc);
      this.gb = Math.round(this.tt + this.tt / 50.0);
    }

    @Override 
    public String toString() {
      return String.format("%s %s %s %d %d %d", this.ma, this.ten, this.dv, this.vc, this.tt, this.gb);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      sc.nextLine();
      System.out.println(new ChiPhi(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
    }
    sc.close();
  }
}