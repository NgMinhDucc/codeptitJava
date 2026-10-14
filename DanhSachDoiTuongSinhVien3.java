import java.util.*;

public class DanhSachDoiTuongSinhVien3 {
  public static class SinhVien implements Comparable<SinhVien> {
    static int i = 0;
    String id, name, class_, dob;
    float gpa;

    public String setName(String name) {
      String[] words = name.trim().toLowerCase().split("\\s+");
      for (int i = 0; i < words.length; i++) {
        words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
      }
      return String.join(" ", words);
    }

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
      this.name = setName(name);
      this.class_ = class_;
      this.dob = setDOB(dob);
      this.gpa = gpa;
    }

    @Override 
    public String toString() {
      return String.format("%s %s %s %s %.2f", this.id, this.name, this.class_, this.dob, this.gpa);
    }

    @Override 
    public int compareTo(SinhVien other) {
      return -Float.compare(this.gpa, other.gpa);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());

    int n = sc.nextInt();
    ArrayList<SinhVien> arr = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      sc.nextLine();
      SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
      arr.add(sv);
    }
    Collections.sort(arr);
    for (SinhVien sv : arr) {
      System.out.println(sv);
    }

    sc.close();
  }
}
