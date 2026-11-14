import java.util.*;

public class TinhTien {
  public static class HoaDon implements Comparable<HoaDon> {
    String ma, ten;
    long sl, gia, ck, tong;

    public HoaDon(String id, String t, long sl, long g, long ck) {
      this.ma = id;
      this.ten = t;
      this.sl = sl;
      this.gia = g;
      this.ck = ck;
      this.tong = sl * g - ck;
    }

    @Override
    public int compareTo(HoaDon other) {
      return -Long.compare(this.tong, other.tong);
    }

    @Override
    public String toString() {
      return String.format(
          "%s %s %d %d %d %d",
          this.ma,
          this.ten,
          this.sl,
          this.gia,
          this.ck,
          this.tong);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<HoaDon> arr = new ArrayList<>();
    int t = sc.nextInt();
    while (t-- > 0) {
      String id = sc.next();
      sc.nextLine();
      String ten = sc.nextLine();
      long sl = sc.nextLong();
      long gia = sc.nextLong();
      long ck = sc.nextLong();
      arr.add(new HoaDon(id, ten, sl, gia, ck));
    }

    Collections.sort(arr);
    for (HoaDon hd : arr) {
      System.out.println(hd);
    }

    sc.close();
  }
}
