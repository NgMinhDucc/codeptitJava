import java.util.*;

public class BaiToanTuyenSinh {
  public static class ThiSinh {
    String mts, hoten;
    float toan, ly, hoa, them;

    static HashMap<Character, Float> uutien = new HashMap<>();
    static {
      uutien.put('1', 0.5F);
      uutien.put('2', 1F);
      uutien.put('3', 2.5F);
    }

    public ThiSinh (String mts, String ht, float t, float l, float h) {
      this.mts = mts;
      this.hoten = ht;
      this.toan = t;
      this.ly = l;
      this.hoa = h;
      this.them = uutien.get(mts.charAt(2));
    }

    public void in () {
      float tong = this.toan * 2 + this.ly + this.hoa;
      String tt = "";
      if (tong + uutien.get(this.mts.charAt(2)) >= 24) {
        tt = "TRUNG TUYEN";
      }
      else {
        tt = "TRUOT";
      }

      System.out.print(
        this.mts + " " + this.hoten + " " +
        ((int) this.them == this.them ? String.format("%d ", (int) this.them) : String.format("%.1f ", this.them)) +
        ((int) tong == tong ? String.format("%d ", (int) tong) : String.format("%.1f ", tong)) +
        tt
      );
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String mts = sc.next();
    sc.nextLine();
    String hoten = sc.nextLine();
    float toan = sc.nextFloat();
    float ly = sc.nextFloat();
    float hoa = sc.nextFloat();

    ThiSinh ts = new ThiSinh(mts, hoten, toan, ly, hoa);
    ts.in();

    sc.close();
  }
}
