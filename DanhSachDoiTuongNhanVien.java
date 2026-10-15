import java.util.*;

public class DanhSachDoiTuongNhanVien {
  public static class NhanVien {
    static int i = 0;
    String id, name, gender, dob, addr, tax, sign;

    public NhanVien(String name, String gender, String dob, String addr, String tax, String sign) {
      i += 1;
      this.id = String.format("000%02d", i);
      this.name = name;
      this.gender = gender;
      this.dob = dob;
      this.addr = addr;
      this.tax = tax;
      this.sign = sign;
    }

    @Override 
    public String toString() {
      return String.format("%s %s %s %s %s %s %s", this.id, this.name, this.gender, this.dob, this.addr, this.tax, this.sign);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());

    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 1; i <= n; i++) {
      String name = sc.nextLine();
      String gender = sc.nextLine();
      String dob = sc.nextLine();
      String addr = sc.nextLine();
      String tax = sc.nextLine();
      String sign = sc.nextLine();
      NhanVien nv = new NhanVien(name, gender, dob, addr, tax, sign);
      System.out.println(nv);
    }

    sc.close();
  }
}
