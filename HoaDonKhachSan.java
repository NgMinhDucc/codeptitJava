import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class HoaDonKhachSan {
  public static class HoaDon implements Comparable<HoaDon> {
    static int i = 0;
    protected String ma, ten, phong;
    protected LocalDate nhan, tra;
    protected long dichVu, soNgay, thanhTien;

    public HoaDon(
        String ten,
        String phong,
        LocalDate nhan,
        LocalDate tra,
        long dichVu) {
      this.ma = String.format("KH%02d", ++i);
      this.ten = ten;
      this.phong = phong;
      this.nhan = nhan;
      this.tra = tra;
      this.dichVu = dichVu;
      this.soNgay = this.tinhSoNgay();
      this.thanhTien = this.tinhTien();
    }

    public long tinhSoNgay() {
      return ChronoUnit.DAYS.between(this.nhan, this.tra) + 1;
    }

    public long tinhTien() {
      char t = this.phong.charAt(0);
      long tong = 0;
      if (t == '1')
        tong = this.soNgay * 25;
      else if (t == '2')
        tong = this.soNgay * 34;
      else if (t == '3')
        tong = this.soNgay * 50;
      else
        tong = this.soNgay * 80;
      return tong + this.dichVu;
    }

    @Override
    public int compareTo(HoaDon other) {
      return -Long.compare(this.thanhTien, other.thanhTien);
    }

    @Override
    public String toString() {
      return String.format(
          "%s %s %s %d %d",
          this.ma,
          this.ten,
          this.phong,
          this.soNgay,
          this.thanhTien);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    int t = sc.nextInt();
    ArrayList<HoaDon> arr = new ArrayList<>();
    while (t-- > 0) {
      sc.nextLine();
      String ten = sc.nextLine(), phong = sc.nextLine();
      LocalDate nhan = LocalDate.parse(sc.nextLine(), fmt), tra = LocalDate.parse(sc.nextLine(), fmt);
      long dichVu = sc.nextLong();
      arr.add(new HoaDon(ten, phong, nhan, tra, dichVu));
    }

    Collections.sort(arr);
    for (HoaDon hd : arr) {
      System.out.println(hd);
    }

    sc.close();
  }
}
