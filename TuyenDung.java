import java.util.*;

public class TuyenDung {
  public static class NhanVien implements Comparable<NhanVien> {
    static int i = 0;
    protected String ma, ten, loai;
    protected double lt, th, tb;

    public NhanVien(String ten, double lt, double th) {
      this.ma = String.format("TS%02d", ++i);
      this.ten = ten;
      if (lt > 10)
        this.lt = lt / 10;
      else
        this.lt = lt;
      if (th > 10)
        this.th = th / 10;
      else
        this.th = th;
      this.tb = (this.lt + this.th) / 2;
      if (this.tb < 5)
        this.loai = "TRUOT";
      else if (this.tb > 5 && this.tb < 8)
        this.loai = "CAN NHAC";
      else if (this.tb <= 9.5)
        this.loai = "DAT";
      else
        this.loai = "XUAT SAC";
    }

    @Override
    public int compareTo(NhanVien other) {
      return -Double.compare(this.tb, other.tb);
    }

    @Override
    public String toString() {
      return String.format(
          "%s %s %.2f %s",
          this.ma,
          this.ten,
          this.tb,
          this.loai);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());

    int t = sc.nextInt();
    ArrayList<NhanVien> arr = new ArrayList<>();
    while (t-- > 0) {
      sc.nextLine();
      String ten = sc.nextLine();
      double lt = sc.nextDouble(), th = sc.nextDouble();
      arr.add(new NhanVien(ten, lt, th));
    }

    Collections.sort(arr);
    for (NhanVien nv : arr) {
      System.out.println(nv);
    }

    sc.close();
  }
}
