import java.util.*;

public class BangXepHang {
  public static class Bang implements Comparable<Bang> {
    String s, c, t;

    public Bang(String s, String c, String t) {
      this.s = s;
      this.c = c;
      this.t = t;
    }

    @Override
    public int compareTo(Bang other) {
      if (this.c.compareTo(other.c) == 0) {
        if (this.t.compareTo(other.t) == 0) {
          return this.s.compareTo(other.s);
        }
        return this.t.compareTo(other.t);
      }
      return -this.c.compareTo(other.c);
    }

    @Override
    public String toString() {
      return String.format("%s %s %s", this.s, this.c, this.t);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    ArrayList<Bang> arr = new ArrayList<>();
    while (t-- > 0) {
      sc.nextLine();
      arr.add(new Bang(sc.nextLine(), sc.next(), sc.next()));
    }
    Collections.sort(arr);
    for (Bang b : arr) {
      System.out.println(b);
    }
    sc.close();
  }
}
