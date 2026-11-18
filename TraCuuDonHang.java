import java.util.*;

public class TraCuuDonHang {
  public static class Don implements Comparable<Don> {
    String ten, ma, stt;
    long dongia, soluong, giamgia, thanhtien;

    public Don(String ten, String ma, long dongia, long soluong) {
      this.ten = ten;
      this.ma = ma;
      this.dongia = dongia;
      this.soluong = soluong;
      this.stt = ma.substring(1, 4);
      this.giamgia = this.giamGia();
      this.thanhtien = dongia * soluong - this.giamgia;
    }

    public long giamGia() {
      long giagoc = this.dongia * this.soluong;
      char c = this.ma.charAt(4);
      if (c == '1')
        return Math.round(giagoc * 50 / 100);
      return Math.round(giagoc * 30 / 100);
    }

    @Override
    public int compareTo(Don other) {
      return this.stt.compareTo(other.stt);
    }

    @Override
    public String toString() {
      return String.format("%s %s %s %d %d", this.ten, this.ma, this.stt, this.giamgia, this.thanhtien);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    ArrayList<Don> arr = new ArrayList<>();
    while (t-- > 0) {
      sc.nextLine();
      arr.add(new Don(sc.nextLine(), sc.next(), sc.nextLong(), sc.nextLong()));
    }
    Collections.sort(arr);
    for (Don d : arr) {
      System.out.println(d);
    }
    sc.close();
  }
}
