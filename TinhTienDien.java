import java.util.*;

public class TinhTienDien {
  public static class Tien implements Comparable<Tien> {
    static int i = 0;
    String ma, sd;
    long cu, moi, heso, thanhtien, phutroi, tong;

    public Tien(String sd, long cu, long moi) {
      this.ma = String.format("KH%02d", ++i);
      this.sd = sd;
      this.cu = cu;
      this.moi = moi;
      this.heso = this.heSo();
      this.thanhtien = (moi - cu) * this.heso * 550;
      this.phutroi = this.phuTroi();
      this.tong = this.phutroi + this.thanhtien;
    }

    public int heSo() {
      if (this.sd.equals("KD"))
        return 3;
      else if (this.sd.equals("NN"))
        return 5;
      else if (this.sd.equals("TT"))
        return 4;
      return 2;
    }

    public long phuTroi() {
      long dif = this.moi - this.cu;
      if (dif > 100)
        return this.thanhtien;
      else if (dif >= 50)
        return Math.round(this.thanhtien * 0.35f);
      return 0;
    }

    @Override
    public int compareTo(Tien other) {
      return -Long.compare(this.tong, other.tong);
    }

    @Override
    public String toString() {
      return String.format("%s %d %d %d %d", this.ma, this.heso, this.thanhtien, this.phutroi, this.tong);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    sc.nextLine();
    ArrayList<Tien> arr = new ArrayList<>();
    while (t-- > 0) {
      arr.add(new Tien(sc.next(), sc.nextInt(), sc.nextInt()));
    }
    Collections.sort(arr);
    for (Tien tien : arr) {
      System.out.println(tien);
    }

    sc.close();
  }
}
