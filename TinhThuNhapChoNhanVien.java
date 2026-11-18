import java.util.*;

public class TinhThuNhapChoNhanVien {
  public static class ThuNhap implements Comparable<ThuNhap> {
    static int i = 0;
    String ma, ten, chuc;
    long coban, ngay, phucap, chinh, tamung, con;

    public ThuNhap(String ten, String chuc, long coban, long ngay) {
      this.ma = String.format("NV%02d", ++i);
      this.ten = ten;
      this.chuc = chuc;
      this.coban = coban;
      this.ngay = ngay;
      this.phucap = this.phuCap();
      this.chinh = coban * ngay;
      this.tamung = this.tamUng();
      this.con = this.chinh - this.tamung + this.phucap;
    }

    public long phuCap() {
      if (this.chuc.equals("GD"))
        return 500;
      else if (this.chuc.equals("PGD"))
        return 400;
      else if (this.chuc.equals("TP"))
        return 300;
      else if (this.chuc.equals("KT"))
        return 250;
      return 100;
    }

    public long tamUng() {
      double tu = this.chinh * 2 / 3.f;
      if (tu < 25000)
        return (long) Math.round(tu / 1000) * 1000;
      return 25000;
    }

    @Override
    public int compareTo(ThuNhap other) {
      if (Long.compare(this.chinh + this.phucap, other.chinh + other.phucap) == 0) {
        return this.ma.compareTo(other.ma);
      }
      return -Long.compare(this.chinh + this.phucap, other.chinh + other.phucap);
    }

    @Override
    public String toString() {
      return String.format("%s %s %s %d %d %d", this.ma, this.ten, this.phucap, this.chinh, this.tamung, this.con);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    ArrayList<ThuNhap> arr = new ArrayList<>();
    while (t-- > 0) {
      sc.nextLine();
      arr.add(new ThuNhap(sc.nextLine(), sc.next(), sc.nextLong(), sc.nextLong()));
    }
    Collections.sort(arr);
    for (ThuNhap tn : arr) {
      System.out.println(tn);
    }
    sc.close();
  }
}
