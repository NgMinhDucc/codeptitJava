import java.util.*;

public class SapXepDanhSachGiangVien {
  public static class GiangVien implements Comparable<GiangVien> {
    static int i = 0;
    protected String ma, ten, boMon;
    protected String[] hoTen;

    public GiangVien(String ten, String bm) {
      this.ma = String.format("GV%02d", ++i);
      this.ten = ten;
      this.boMon = this.taoMon(bm);
      this.hoTen = this.ten.trim().split("\\s+");
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
    public int compareTo(GiangVien other) {
      if (this.hoTen[this.hoTen.length - 1].compareTo(other.hoTen[other.hoTen.length - 1]) != 0) {
        return this.hoTen[this.hoTen.length - 1].compareTo(other.hoTen[other.hoTen.length - 1]);
      }
      return this.ma.compareTo(other.ma);
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

    Collections.sort(arr);
    for (GiangVien gv : arr) {
      System.out.println(gv);
    }

    sc.close();
  }
}
