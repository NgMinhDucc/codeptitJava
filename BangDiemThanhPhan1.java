import java.util.*;

public class BangDiemThanhPhan1 {
  public static class BangDiem implements Comparable<BangDiem> {
    protected String ma, ten, lop;
    protected double d1, d2, d3;

    public BangDiem(
        String ma,
        String ten,
        String lop,
        double d1,
        double d2,
        double d3) {
      this.ma = ma;
      this.ten = ten;
      this.lop = lop;
      this.d1 = d1;
      this.d2 = d2;
      this.d3 = d3;
    }

    @Override
    public int compareTo(BangDiem other) {
      return this.ma.compareTo(other.ma);
    }

    @Override
    public String toString() {
      return String.format(
          "%s %s %s %.1f %.1f %.1f",
          this.ma,
          this.ten,
          this.lop,
          this.d1,
          this.d2,
          this.d3);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());

    int t = sc.nextInt();
    ArrayList<BangDiem> arr = new ArrayList<>();
    while (t-- > 0) {
      sc.nextLine();
      String ma = sc.nextLine(), ten = sc.nextLine(), lop = sc.nextLine();
      double d1 = sc.nextDouble(), d2 = sc.nextDouble(), d3 = sc.nextDouble();
      arr.add(new BangDiem(ma, ten, lop, d1, d2, d3));
    }

    Collections.sort(arr);
    int i = 1;
    for (BangDiem bd : arr) {
      System.out.printf("%d %s\n", i, bd);
      i++;
    }

    sc.close();
  }
}
