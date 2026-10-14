import java.util.*;

public class LietKeSinhVienTheoNganh {
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
    HashMap<String, String> map = new HashMap<>();
    map.put("KE TOAN", "DCKT");
    map.put("CONG NGHE THONG TIN", "DCCN");
    map.put("AN TOAN THONG TIN", "DCAT");
    map.put("VIEN THONG", "DCVT");
    map.put("DIEN TU", "DCDT");

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
      String nganh = sc.nextLine().trim().toUpperCase();
      System.out.println("DANH SACH SINH VIEN NGANH " + nganh + ": ");
      for (SinhVien sv : arr) {
        if (sv.msv.substring(3, 7).equals(map.get(nganh))) {
          if (nganh.equals("CONG NGHE THONG TIN") || nganh.equals("AN TOAN THONG TIN")) {
            if (sv.lop.charAt(0) != 'E') {
              System.out.println(sv);
            }
          }
          else {
            System.out.println(sv);
          }
        }
      }
    }

    sc.close();
  }
}

