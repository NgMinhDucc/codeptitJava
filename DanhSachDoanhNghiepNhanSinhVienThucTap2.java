import java.util.*;

public class DanhSachDoanhNghiepNhanSinhVienThucTap2 {
  public static class DoanhNghiep implements Comparable<DoanhNghiep> {
    protected String ma, ten;
    protected int sl;

    public DoanhNghiep(String ma, String ten, int sl) {
      this.ma = ma;
      this.ten = ten;
      this.sl = sl;
    }

    @Override
    public int compareTo(DoanhNghiep other) {
      if (Integer.compare(this.sl, other.sl) != 0) {
        return -Integer.compare(this.sl, other.sl);
      }
      return this.ma.compareTo(other.ma);
    }

    @Override
    public String toString() {
      return String.format(
          "%s %s %d",
          this.ma,
          this.ten,
          this.sl);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    ArrayList<DoanhNghiep> arr = new ArrayList<>();
    while (t-- > 0) {
      sc.nextLine();
      String ma = sc.nextLine(), ten = sc.nextLine();
      int sl = sc.nextInt();
      arr.add(new DoanhNghiep(ma, ten, sl));
    }
    Collections.sort(arr);

    int q = sc.nextInt();
    sc.nextLine();
    ArrayList<String[]> truyVan = new ArrayList<>();
    while (q-- > 0) {
      String[] tv = sc.nextLine().trim().split("\\s+");
      truyVan.add(tv);
    }

    for (int i = 0; i < truyVan.size(); i++) {
      int a = Integer.parseInt(truyVan.get(i)[0]);
      int b = Integer.parseInt(truyVan.get(i)[1]);
      System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
      for (DoanhNghiep dn : arr) {
        if (dn.sl >= a && dn.sl <= b) {
          System.out.println(dn);
        }
      }
    }

    sc.close();
  }
}
