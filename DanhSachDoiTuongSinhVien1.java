import java.util.*;

public class DanhSachDoiTuongSinhVien1 {
  public static class SinhVien {
    static int i = 0;
    String id, name, class_, dob;
    float gpa;

    public String setDOB(String dob) {
      if (dob.length() == 8) {
        return "0" + dob.substring(0, 2) + "0" + dob.substring(2);
      }
      else {
        if (dob.charAt(0) != '0') {
          return "0" + dob;
        }
        return dob.substring(0, 3) + "0" + dob.substring(3);
      }
    }

    public SinhVien(String name, String class_, String dob, float gpa) {
      i += 1;
      this.id = String.format("B20DCCN%03d", i);
      this.name = name;
      this.class_ = class_;
      this.dob = setDOB(dob);
      this.gpa = gpa;
    }

    @Override 
    public String toString() {
      return String.format("%s %s %s %s %.2f", this.id, this.name, this.class_, this.dob, this.gpa);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());

    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      sc.nextLine();
      SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
      System.out.println(sv);
    }

    sc.close();
  }
}
