import java.util.*;

public class KhaiBaoLopThiSinh {
  public static class ThiSinh {
    String hoten;
    String ngaysinh;
    float diem1, diem2, diem3;

    public ThiSinh (String ht, String ns, float d1, float d2, float d3) {
      this.hoten = ht;
      this.ngaysinh = ns;
      this.diem1 = d1;
      this.diem2 = d2;
      this.diem3 = d3;
    }

    public void In () {
      System.out.printf("%s %s %.1f", this.hoten, this.ngaysinh, this.diem1 + this.diem2 + this.diem3);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());

    ThiSinh ts = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
    ts.In();

    sc.close();
  }
}
