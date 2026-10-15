import java.util.*;

public class HoaDonTienNuoc {
  public static class HoaDon implements Comparable<HoaDon> {
    static int i = 0;
    private String id, name;
    private int fee;

    public int setFee(int old, int new_) {
      int dif = new_ - old;
      double fee = 0.0;
      if (dif <= 50) {
        fee = dif * 100;
        fee *= 1.02;
      }
      else if (dif <= 100) {
        fee = 50 * 100 + (dif - 50) * 150;
        fee *= 1.03;
      }
      else {
        fee = 50 * 100 + 50 * 150 + (dif - 100) * 200;
        fee *= 1.05;
      }
      return (int) Math.round(fee);
    }

    public HoaDon(String name, int old, int new_) {
      this.id = String.format("KH%02d", ++i);
      this.name = name;
      this.fee = setFee(old, new_);
    }

    @Override 
    public int compareTo(HoaDon other) {
      return -Integer.compare(this.fee, other.fee);
    }

    @Override 
    public String toString() {
      return String.format("%s %s %d", this.id, this.name, this.fee);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    ArrayList<HoaDon> arr = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      sc.nextLine();
      arr.add(new HoaDon(sc.nextLine(), sc.nextInt(), sc.nextInt()));
    }
    Collections.sort(arr);

    for (HoaDon hd : arr) {
      System.out.println(hd);
    }

    sc.close();
  }
}
