import java.util.*;

public class DuaXeDap {
  public static class ThiSinh implements Comparable<ThiSinh> {
    protected String ma, ten, donvi, veDich;
    protected double v;

    public ThiSinh(String ten, String donvi, String veDich) {
      this.ten = ten;
      this.donvi = donvi;
      this.ma = this.taoMa();
      this.veDich = veDich;
      this.v = this.tinhVanToc();
    }

    public String taoMa() {
      String[] t = this.ten.trim().split("\\s+");
      String[] dv = this.donvi.trim().split("\\s+");
      String ma = "";
      for (int i = 0; i < dv.length; i++) {
        ma += dv[i].charAt(0);
      }
      for (int i = 0; i < t.length; i++) {
        ma += t[i].charAt(0);
      }
      return ma;
    }

    public double tinhVanToc() {
      int gio = Integer.parseInt(this.veDich.substring(0, 1));
      int phut = Integer.parseInt(this.veDich.substring(2));
      double t = ((gio - 6) * 60 + phut) / 60.0;
      return 120.0 / t;
    }

    @Override
    public int compareTo(ThiSinh other) {
      return -Double.compare(this.v, other.v);
    }

    @Override
    public String toString() {
      return String.format(
          "%s %s %s %d Km/h",
          this.ma,
          this.ten,
          this.donvi,
          Math.round(this.v)
      );
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    sc.nextLine();
    ArrayList<ThiSinh> arr = new ArrayList<>();
    while (t-- > 0) {
      String ten = sc.nextLine(), donvi = sc.nextLine(), veDich = sc.nextLine();
      arr.add(new ThiSinh(ten, donvi, veDich));
    }

    Collections.sort(arr);
    for (ThiSinh ts : arr) {
      System.out.println(ts);
    }

    sc.close();
  }
}
