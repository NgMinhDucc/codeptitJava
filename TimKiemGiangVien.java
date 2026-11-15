import java.util.*;

public class TimKiemGiangVien {
  public static class GiangVien {
    static int i = 0;
    protected String ma, ten, boMon, monDayDu;

    public GiangVien(String ten, String bm) {
      this.ma = String.format("GV%02d", ++i);
      this.ten = ten;
      this.boMon = this.taoMon(bm);
    }

    public String taoMon(String bm) {
      String[] mon = bm.toUpperCase().trim().split("\\s+");
      String m = "";
      for (int i = 0; i < mon.length; i++) {
        m += mon[i].charAt(0);
      }
      return m;
    }

    @Override
    public String toString() {
      return String.format(
          "%s %s %s",
          this.ma,
          this.ten,
          this.boMon);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    sc.nextLine();
    ArrayList<GiangVien> arr = new ArrayList<>();
    while (t-- > 0) {
      String ten = sc.nextLine(), boMon = sc.nextLine();
      arr.add(new GiangVien(ten, boMon));
    }

    int q = sc.nextInt();
    sc.nextLine();
    ArrayList<String> truyVan = new ArrayList<>();
    while (q-- > 0) {
      String s = sc.nextLine();
      truyVan.add(s);
    }

    for (int i = 0; i < truyVan.size(); i++) {
      System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + truyVan.get(i) + ":");
      for (GiangVien gv : arr) {
        if (gv.ten.toUpperCase().contains(truyVan.get(i).toUpperCase())) {
          System.out.println(gv);
        }
      }
    }

    sc.close();
  }
}
