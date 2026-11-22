import java.util.*;

public class KetQuaXetTuyen {
  public static class KQ implements Comparable<KQ> {
    static int i = 0;
    String ma, ten, dob, tt;
    double lt, th;
    long tuoi, diem;

    public KQ(String ten, String dob, double lt, double th) {
      this.ma = String.format("PH%02d", ++i);
      this.ten = ten;
      this.dob = dob;
      this.lt = lt;
      this.th = th;
      this.tuoi = 2021 - Integer.parseInt(this.dob.substring(6));
      this.diem = Math.min(10, this.Diem());
      this.tt = trangthai();
    }

    public long Diem() {
      double d = (this.lt + this.th) / 2;
      if (this.lt >= 8.f && this.th >= 8.f)
        return Math.round(d + 1.f);
      else if (this.lt >= 7.5f && this.th >= 7.5f)
        return Math.round(d + 0.5f);
      return Math.round(d);
    }

    public String trangthai() {
      if (this.diem >= 9)
        return "Xuat sac";
      if (this.diem == 8)
        return "Gioi";
      if (this.diem == 7)
        return "Kha";
      if (this.diem >= 5)
        return "Trung binh";
      return "Truot";
    }

    @Override 
    public int compareTo(KQ other) {
      if (this.diem == other.diem) return this.ma.compareTo(other.ma);
      return -Long.compare(this.diem, other.diem);
    }

    @Override
    public String toString() {
      return String.format("%s %s %d %d %s", this.ma, this.ten, this.tuoi, this.diem, this.tt);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());
    int t = sc.nextInt();
    ArrayList<KQ> arr = new ArrayList<>();
    while (t-- > 0) {
      sc.nextLine();
      arr.add(new KQ(sc.nextLine(), sc.next(), sc.nextDouble(), sc.nextDouble()));
    }
    Collections.sort(arr);
    for (KQ x : arr) {
      System.out.println(x);
    }
    sc.close();
  }
}
