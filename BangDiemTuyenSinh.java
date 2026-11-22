import java.util.*;

/**
 * BangDiemTuyenSinh
 */
public class BangDiemTuyenSinh {
  public static class Bang implements Comparable<Bang> {
    String ma, ten, tt;
    double t, l, h, ut, tong;

    public Bang(String ma, String ten, double t, double l, double h) {
      this.ma = ma;
      this.ten = ten;
      this.t = t;
      this.l = l;
      this.h = h;
      this.ut = this.uutien();
      this.tong = t * 2 + l + h + this.ut;
    }

    public double uutien() {
      char c = this.ma.charAt(2);
      if (c == '1') return 0.5;
      if (c == '2') return 1.0;
      return 2.5;
    }

    @Override 
    public int compareTo(Bang other) {
      if (Double.compare(this.tong, other.tong) == 0) {
        return this.ma.compareTo(other.ma);
      }
      return -Double.compare(this.tong, other.tong);
    }

    @Override 
    public String toString() {
      return this.ma + " " +
      this.ten + " " +
      (this.ut == (int) this.ut ? (int) this.ut : String.format("%.1f", this.ut)) + " " +
      (this.tong == (int) this.tong ? (int) this.tong : String.format("%.1f", this.tong)) + " " +
      this.tt;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());
    int t = sc.nextInt();
    ArrayList<Bang> arr = new ArrayList<>();
    while (t-- > 0) {
      sc.nextLine();
      arr.add(new Bang(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
    }
    Collections.sort(arr);

    int ct = sc.nextInt();
    double dc = arr.get(ct - 1).tong;
    System.out.println(String.format("%.1f", dc));
    for (Bang x : arr) {
      if (x.tong >= dc) x.tt = "TRUNG TUYEN";
      else x.tt = "TRUOT";
    }
    for (Bang x : arr) {
      System.out.println(x);
    }
    sc.close();
  }
}