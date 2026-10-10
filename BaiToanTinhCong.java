import java.util.*;

public class BaiToanTinhCong {
  public static class Cong {
    String mnv, hoten, chuc;
    Long luong, ngay;

    static HashMap<String, Long> phucap = new HashMap<>();
    static {
      phucap.put("GD", 250000L);
      phucap.put("PGD", 200000L);
      phucap.put("TP", 180000L);
      phucap.put("NV", 150000L);
    }

    public Cong (String ht, long l, long n, String c) {
      this.mnv = "NV01";
      this.hoten = ht;
      this.luong = l;
      this.ngay = n;
      this.chuc = c;
    }

    public void in () {
      long thang = this.luong * this.ngay;
      long thuong = 0;
      if (this.ngay >= 25) {
        thuong = thang * 20 / 100;
      }
      else if (this.ngay < 25 && this.ngay >= 22) {
        thuong = thang * 10 / 100;
      }
      long tong = thang + thuong + phucap.get(this.chuc);

      System.out.printf(
        "%s %s %d %d %d %d",
        this.mnv,
        this.hoten,
        thang,
        thuong,
        phucap.get(this.chuc),
        tong
      );
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Cong c = new Cong(sc.nextLine(), sc.nextLong(), sc.nextLong(), sc.next());
    c.in();

    sc.close();
  }
}
