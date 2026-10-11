import java.util.*;
import java.io.*;

public class DanhSachMonThi{
  public static class MonThi implements Comparable<MonThi> {
    String ma, mon, thi;

    public MonThi(String ma, String mon, String thi) {
      this.ma = ma;
      this.mon = mon;
      this.thi = thi;
    }

    @Override
    public int compareTo(MonThi other) {
      return this.ma.compareTo(other.ma);
    }

    @Override
    public String toString() {
      return String.format("%s %s %s", this.ma, this.mon, this.thi);
    }
  }

  public static void main(String[] args) throws IOException, FileNotFoundException {
    Scanner sc = new Scanner(new File("MONHOC.in"));
		
    int n = Integer.parseInt(sc.next());
    sc.nextLine();
    ArrayList<MonThi> arr = new ArrayList<>();
    while (sc.hasNextLine()) {
      String ma = sc.nextLine();
      String mon = sc.nextLine();
      String thi = sc.nextLine();

      arr.add(new MonThi(ma, mon, thi));
    }
    Collections.sort(arr);
    for (MonThi mt : arr) {
      System.out.println(mt);
    }

		sc.close();
  }
}
