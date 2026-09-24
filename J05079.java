import java.util.*;

class lop implements Comparable<lop> {
    private String mamon;
    private String tenmon;
    private String nhom;
    private String gv;

    public lop(String mamon, String tenmon, String nhom, String gv) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.nhom = nhom;
        this.gv = gv;
    }

    public String nhapma() {
        return mamon;
    }

    public String nhapten() {
        return tenmon;
    }

    @Override
    public int compareTo(lop l) {
        return this.nhom.compareTo(l.nhom);
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.nhom, this.gv);
    }
}

public class J05079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<lop> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String mamon = sc.next();
            sc.nextLine();
            String tenmon = sc.nextLine();
            String nhom = sc.next();
            sc.nextLine();
            String gv = sc.nextLine();
            arr.add(new lop(mamon, tenmon, nhom, gv));
        }
        Collections.sort(arr);
        int m = sc.nextInt();
        while (m-- > 0) {
            String ma = sc.next();
            String ten = "";
            for (lop x : arr) {
                if (x.nhapma().equals(ma)) {
                    ten = x.nhapten();
                }
            }
            System.out.println("Danh sach nhom lop mon " + ten + ":");
            for (lop x : arr) {
                if (x.nhapma().equals(ma)) {
                    System.out.println(x);
                }
            }
        }
        sc.close();
    }
}