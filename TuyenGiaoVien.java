import java.util.*;

public class TuyenGiaoVien {
  public static class GiaoVien implements Comparable<GiaoVien> {
    static int i = 0;
    protected String ten, ma, loai, mon, maGV;
    protected double tin, cm, tong;

    public GiaoVien(String ten, String maGV, double tin, double cm) {
      this.ten = ten;
      this.ma = String.format("GV%02d", ++i);
      this.maGV = maGV;
      this.tin = tin;
      this.cm = cm;
      this.tong = this.tongDiem();
    }

    public double tongDiem() {
      char c = this.maGV.charAt(1);
      double t = this.tin * 2 + this.cm;
      if (c == '1')
        this.tong = t + 2.0;
      else if (c == '2')
        this.tong = t + 1.5;
      else if (c == '3')
        this.tong = t + 1.0;
      else
        this.tong = t;
      return this.tong;
    }

    public String xeploai() {
      if (this.tong >= 18.0)
        this.loai = "TRUNG TUYEN";
      else
        this.loai = "LOAI";
      return this.loai;
    }

    public String chonMon() {
      char c = this.maGV.charAt(0);
      if (c == 'A')
        this.mon = "TOAN";
      else if (c == 'B')
        this.mon = "LY";
      else
        this.mon = "HOA";
      return this.mon;
    }

    @Override
    public int compareTo(GiaoVien other) {
      return -Double.compare(this.tong, other.tong);
    }

    @Override
    public String toString() {
      return String.format(
          "%s %s %s %.1f %s",
          this.ma,
          this.ten,
          this.chonMon(),
          this.tong,
          this.xeploai());
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());

    int t = sc.nextInt();
    ArrayList<GiaoVien> arr = new ArrayList<>();
    while (t-- > 0) {
      sc.nextLine();
      String ten = sc.nextLine(), maGV = sc.next();
      double tin = sc.nextDouble(), cm = sc.nextDouble();
      arr.add(new GiaoVien(ten, maGV, tin, cm));
    }

    Collections.sort(arr);
    for (GiaoVien gv : arr) {
      System.out.println(gv);
    }

    sc.close();
  }
}
