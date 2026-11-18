import java.util.*;

public class DanhSachThucTap1 {
  public static class ThucTap implements Comparable<ThucTap> {
    static int i = 0;
    String stt, msv, ten, lop, email, dn;

    public ThucTap(String msv, String ten, String lop, String email, String dn) {
      this.stt = String.format("%01d", ++i);
      this.msv = msv;
      this.ten = ten;
      this.lop = lop;
      this.email = email;
      this.dn = dn;
    }

    @Override
    public int compareTo(ThucTap other) {
      return this.ten.compareTo(other.ten);
    }

    @Override
    public String toString() {
      return String.format(
          "%s %s %s %s %s %s",
          this.stt,
          this.msv,
          this.ten,
          this.lop,
          this.email,
          this.dn);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    sc.nextLine();
    ArrayList<ThucTap> arr = new ArrayList<>();
    while (t-- > 0) {
      arr.add(new ThucTap(
          sc.nextLine(),
          sc.nextLine(),
          sc.nextLine(),
          sc.nextLine(),
          sc.nextLine()));
    }
    Collections.sort(arr);

    int q = sc.nextInt();
    sc.nextLine();
    ArrayList<String> truyVan = new ArrayList<>();
    while (q-- > 0) {
      truyVan.add(sc.nextLine());
    }

    for (int i = 0; i < truyVan.size(); i++) {
      for (ThucTap tt : arr) {
        if (tt.dn.equals(truyVan.get(i))) {
          System.out.println(tt);
        }
      }
    }

    sc.close();
  }
}
