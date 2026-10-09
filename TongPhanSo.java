import java.util.*;

public class TongPhanSo {
  public static class PhanSo {
    private long tu;
    private long mau;

    public PhanSo (long t, long m) {
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

    public void Solve (PhanSo other) {
      long Tu = this.tu * other.mau + other.tu * this.mau;
      long Mau = this.mau * other.mau;

      long chung = ucln(Tu, Mau);
      Tu /= chung;
      Mau /= chung;

      System.out.print(Tu + "/" + Mau);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    PhanSo ps1 = new PhanSo(sc.nextLong(), sc.nextLong());
    PhanSo ps2 = new PhanSo(sc.nextLong(), sc.nextLong());
    ps1.Solve(ps2);

    sc.close();
  }
}
