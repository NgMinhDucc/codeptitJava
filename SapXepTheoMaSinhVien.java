import java.util.*;

public class SapXepTheoMaSinhVien {
  public static class SinhVien implements Comparable<SinhVien> {
    String id, name, class_, email;

    public SinhVien(String id, String name, String class_, String email) {
      this.id = id;
      this.name = name;
      this.class_ = class_;
      this.email = email;
    }

    @Override 
    public int compareTo(SinhVien other) {
      return this.id.compareTo(other.id);
    }

    @Override 
    public String toString() {
      return String.format("%s %s %s %s", this.id, this.name, this.class_, this.email);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<SinhVien> arr = new ArrayList<>();
    while (sc.hasNext()) {
      arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
    }
    Collections.sort(arr);

    for (SinhVien sv : arr) {
      System.out.println(sv);
    }

    sc.close();
  }
}
