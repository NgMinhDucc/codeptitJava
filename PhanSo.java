import java.util.*;

public class PhanSo {
  public static class PS {
    private long tu;
    private long mau;

    public PS (long t, long m) {
      this.tu = t;
      this.mau = m;
    }

    private long ucln (long a, long b) {
      while (b != 0) {
        long uoc = a % b;
        a = b;
        b = uoc;
      }
      return a;
    }

    public void Solve () {
      long chung = ucln(this.tu, this.mau);
      this.tu /= chung;
      this.mau /= chung;
      System.out.print(this.tu + "/" + this.mau);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    PS ps = new PS(sc.nextLong(), sc.nextLong());
    ps.Solve();

    sc.close();
  }
}
