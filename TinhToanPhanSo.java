import java.util.*;

public class TinhToanPhanSo {
  public static class PhanSo {
    long tu, mau;

    public PhanSo (long t, long m) {
      this.tu = t;
      this.mau = m;
    }

    public static long gcd (long a, long b) {
      while (b != 0) {
        long uoc = a % b;
        a = b;
        b = uoc;
      }
      return a;
    }

    public void cal (PhanSo B) {
      long tuC = (long) Math.pow(this.tu * B.mau + B.tu * this.mau, 2);
      long mauC = (long) Math.pow(this.mau * B.mau, 2);

      long tuD = this.tu * B.tu * tuC;
      long mauD = this.mau * B.mau * mauC;

      long mscC = gcd(tuC, mauC);
      tuC /= mscC;
      mauC /= mscC;

      long mscD = gcd(tuD, mauD);
      tuD /= mscD;
      mauD /= mscD;

      System.out.println(tuC + "/" + mauC + " " + tuD + "/" + mauD);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int test = sc.nextInt();
    while (test-- > 0) {
      PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
      PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
      a.cal(b);
    }

    sc.close();
  }
}
