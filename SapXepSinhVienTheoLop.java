import java.util.*;

public class SapXepSinhVienTheoLop {
  public static class SinhVien implements Comparable<SinhVien> {
    String msv, ten, lop, email;

    public SinhVien(String msv, String ten, String lop, String email) {
      this.msv = msv;
      this.ten = ten;
      this.lop = lop;
      this.email = email;
    }

    @Override
    public int compareTo(SinhVien other) {
      if (this.lop.compareTo(other.lop) == 0) {
        return this.msv.compareTo(other.msv);
      }
      return this.lop.compareTo(other.lop);
    }

    @Override
    public String toString() {
      return String.format("%s %s %s %s", this.msv, this.ten, this.lop, this.email);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();
    ArrayList<SinhVien> arr = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
      arr.add(sv);
    }
    Collections.sort(arr);
    for (SinhVien sv : arr) {
      System.out.println(sv);
    }

    sc.close();
  }
}
