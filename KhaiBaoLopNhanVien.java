import java.util.*;

public class KhaiBaoLopNhanVien {
  public static class NhanVien {
    private String mnv;
    private String hoten;
    private String gioitinh;
    private String ngaysinh;
    private String diachi;
    private String mst;
    private String hopdong;

    public NhanVien (String ht, String gt, String ns, String dc, String mst, String hd) {
      this.mnv = "00001";
      this.hoten = ht;
      this.gioitinh = gt;
      this.ngaysinh = ns;
      this.diachi = dc;
      this.mst = mst;
      this.hopdong = hd;
    }

    public void in () {
      System.out.print(
        this.mnv + " " +
        this.hoten + " " +
        this.gioitinh + " " +
        this.ngaysinh + " " +
        this.diachi + " " +
        this.mst + " " +
        this.hopdong + " "
      );
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    NhanVien nv = new NhanVien(
      sc.nextLine(),
      sc.nextLine(),
      sc.nextLine(),
      sc.nextLine(),
      sc.nextLine(),
      sc.nextLine()
    );
    nv.in();

    sc.close();
  }
}
