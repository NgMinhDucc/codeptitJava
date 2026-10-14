import java.util.*;

public class LietKeSinhVienTheoLop {
  public static class SinhVien {
    String msv, ten, lop, email;

    public SinhVien(String msv, String ten, String lop, String email) {
      this.msv = msv;
      this.ten = ten;
      this.lop = lop;
      this.email = email;
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
    int q = sc.nextInt();
    sc.nextLine();
    for (int i = 1; i <= q; i++) {
      String lop = sc.nextLine();
      System.out.println("DANH SACH SINH VIEN LOP " + lop + ": ");
      for (SinhVien sv : arr) {
        if (sv.lop.equals(lop)) {
          System.out.println(sv);
        } 
      }
    }

    sc.close();
  }
}
