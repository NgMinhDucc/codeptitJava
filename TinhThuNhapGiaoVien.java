import java.util.*;

public class TinhThuNhapGiaoVien {
  public static class GiaoVien {
    String ma, hoten, chuc;
    long luong, bac, pc;

    static HashMap<String, Long> phucap = new HashMap<>();
    static {
      phucap.put("HT", 2000000L);
      phucap.put("HP", 900000L);
      phucap.put("GV", 500000L);
    }

    public GiaoVien(String m, String ht, long l) {
      this.ma = m;
      this.hoten = ht;
      this.luong = l;
      this.chuc = m.substring(0, 2);
      this.bac = Long.parseLong(m.substring(2));
      this.pc = phucap.get(this.chuc);
    }

    public void in() {
      System.out.printf("%s %s %d %d %d", this.ma, this.hoten, this.bac, this.pc, this.luong * this.bac + this.pc);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    GiaoVien gv = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextLong());
    gv.in();

    sc.close();
  }
}
