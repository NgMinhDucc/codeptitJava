import java.util.*;

public class KhaiBaoLopSinhVien {
  public static class SinhVien {
    String msv;
    String hoten;
    String lop;
    String ngaysinh;
    float gpa;

    public SinhVien (String ht, String lop, String ns, float gpa) {
      // chuan hoa ngay sinh
      if (ns.length() == 8) {
        ns = "0" + ns.substring(0, 2) + "0" + ns.substring(2);
      }
      else if (ns.length() == 9) {
        if (ns.charAt(0) == '0') {
          ns = ns.substring(0, 3) + "0" + ns.substring(3);
        }
        else if (ns.charAt(0) != '0') {
          ns = "0" + ns;
        }
      }

      this.msv = "B20DCCN001";
      this.hoten = ht;
      this.lop = lop;
      this.ngaysinh = ns;
      this.gpa = gpa;
    }

    public void in () {
      System.out.printf("%s %s %s %s %.2f", this.msv, this.hoten, this.lop, this.ngaysinh, this.gpa);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
    sv.in();

    sc.close();
  }
}
