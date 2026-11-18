// import java.util.*;
// import java.time.LocalThoiGian;
// import java.time.format.DateThoiGianFormatter;
//
// public class SapXepThoiGian {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//
//     int t = sc.nextInt();
//     DateThoiGianFormatter formatter = DateThoiGianFormatter.ofPattern("HH mm ss");
//     sc.nextLine();
//     ArrayList<LocalThoiGian> arr = new ArrayList<>();
//     while (t-- > 0) {
//       String[] s = sc.nextLine().trim().split("\\s+");
//       LocalThoiGian tg = LocalThoiGian.of(
//           Integer.parseInt(s[0]),
//           Integer.parseInt(s[1]),
//           Integer.parseInt(s[2]));
//       arr.add(tg);
//     }
//
//     Collections.sort(arr);
//     for (LocalThoiGian tg : arr) {
//       System.out.println(tg.format(formatter));
//     }
//
//     sc.close();
//   }
// }

import java.util.*;

public class SapXepThoiGian {
  public static class ThoiGian implements Comparable<ThoiGian> {
    protected int hour, minute, second;

    public ThoiGian(int h, int m, int s) {
      this.hour = h;
      this.minute = m;
      this.second = s;
    }

    @Override
    public int compareTo(ThoiGian other) {
      if (Integer.compare(this.hour, other.hour) == 0) {
        if (Integer.compare(this.minute, other.minute) == 0) {
          return Integer.compare(this.second, other.second);
        }
        return Integer.compare(this.minute, other.minute);
      }
      return Integer.compare(this.hour, other.hour);
    }

    @Override
    public String toString() {
      return String.format("%d %d %d", this.hour, this.minute, this.second);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    ArrayList<ThoiGian> arr = new ArrayList<>();
    while (t-- > 0) {
      arr.add(new ThoiGian(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }

    Collections.sort(arr);
    for (ThoiGian tg : arr) {
      System.out.println(tg);
    }

    sc.close();
  }
}
