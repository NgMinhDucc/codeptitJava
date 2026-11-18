import java.util.*;

/**
 * BangKeTienLuong
 */
public class BangKeTienLuong {
  public static class Bang {
    static int  i = 0;
    String ma, ten, c;
    long ln, n, lt, t, pc, tl;

    public Bang(String ten, long ln, long n, String c) {
      this.ma = String.format("NV%02d", ++i);
      this.ten = ten;
      this.ln = ln;
      this.n = n;
      this.c = c;
      this.lt = ln * n;
      this.t = this.thuong(n);
      this.pc = this.phucap(c);
      this.tl = this.thuc();
    }

    public long thuong(long n) {
      if (n >= 25) return (long) (this.lt * 0.2);
      else if (n >= 22) return (long) (this.lt * 0.1);
      return 0;
    }

    public long phucap(String c) {
      if (c.equals("GD")) return 250000;
      else if (c.equals("PGD")) return 200000;
      else if (c.equals("TP")) return 180000;
      return 150000;
    }

    public long thuc() {
      return this.lt + this.t + this.pc;
    }
    
    @Override 
    public String toString() {
      return String.format("%s %s %d %d %d %d", this.ma, this.ten, this.lt, this.t, this.pc, this.tl);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    int tong = 0;
    while (t-- > 0) {
      String ten = sc.nextLine();
      long ln = sc.nextLong();
      long n = sc.nextLong();
      sc.nextLine();
      String c = sc.nextLine();
      Bang bang = new Bang(ten, ln, n, c);
      System.out.println(bang);
      tong += bang.tl;
    }
    System.out.print("Tong chi phi tien luong: " + tong);
    sc.close();
  }
}