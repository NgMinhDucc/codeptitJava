import java.util.*;

/**
 * TinhGiaBan1
 */
public class TinhGiaBan2 {
  public static class ChiPhi implements Comparable<ChiPhi> {
    static int i = 0;
    String ma, ten, dv;
    long dg, sl, vc, tt, gbl;

    public ChiPhi(String ten, String dv, long dg, long sl) {
      this.ma = String.format("MH%02d", ++i);
      this.ten = ten;
      this.dv = dv;
      this.dg = dg;
      this.sl = sl;
      this.vc = Math.round((dg * sl) / 20.0);
      this.tt = Math.round(dg * sl + this.vc);
      this.gbl = (long) Math.ceil((tt * 1.02f / sl) / 100) * 100;
    }

    @Override 
    public int compareTo(ChiPhi other) {
      return -Long.compare(this.gbl, other.gbl);
    }

    @Override
    public String toString() {
      return String.format("%s %s %s %d %d %d", this.ma, this.ten, this.dv, this.vc, this.tt, this.gbl);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    ArrayList<ChiPhi> arr = new ArrayList<>();
    while (t-- > 0) {
      sc.nextLine();
      arr.add(new ChiPhi(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
    }
    Collections.sort(arr);
    for (ChiPhi cp : arr) {
      System.out.println(cp);
    }
    sc.close();
  }
}