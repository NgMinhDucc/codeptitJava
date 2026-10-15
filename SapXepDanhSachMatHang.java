import java.util.*;

public class SapXepDanhSachMatHang {
  public static class MatHang implements Comparable<MatHang> {
    private static int i = 0;
    private String id, name, category;
    private float profit;

    public MatHang(String name, String category, float buy, float sell) {
      i += 1;
      this.id = String.format("%1d", i);
      this.name = name;
      this.category = category;
      this.profit = sell - buy;
    }

    @Override 
    public int compareTo(MatHang other) {
      return -Float.compare(this.profit, other.profit);
    }

    @Override 
    public String toString() {
      return String.format("%s %s %s %.2f", this.id, this.name, this.category, this.profit);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());

    ArrayList<MatHang> arr = new ArrayList<>();
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      sc.nextLine();
      arr.add(new MatHang(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat()));
    }
    Collections.sort(arr);

    for (MatHang mh : arr) {
      System.out.println(mh);
    }

    sc.close();
  }
}
