import java.util.*;

class gv {
    public static int ID = 0;
    public static final String KEY = "GV";
    private String id;
    private String name;
    private String mon;

    public gv(String name, String mon) {
        this.id = String.format("%s%02d", KEY, ++ID);
        this.name = name;
        this.mon = gv.convertSubject(mon);
    }

    public static String convertSubject(String s) {
        String[] tmp = s.toUpperCase().split("\\s+");
        String ans = "";
        for (String x : tmp) {
            ans += x.charAt(0);
        }
        return ans;
    }

    public String nhapid() {
        return id;
    }

    public void ganid(String id) {
        this.id = id;
    }

    public String nhapname() {
        return name;
    }

    public void datname(String name) {
        this.name = name;
    }

    public String nhapmon(String mon) {
        return mon;
    }

    public void datmon(String mon) {
        this.mon = mon;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.id, this.name, this.mon);
    }
}

public class J05027 {
    public static void idin(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<gv> arr = new ArrayList<gv>();
        for (int i = 0; i < n; i++) {
            arr.add(new gv(sc.nextLine(), sc.nextLine()));
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            String key = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + key + ":");
            for (gv x : arr) {
                if (x.nhapname().toLowerCase().contains(key.toLowerCase())) {
                    System.out.println(x);
                }
            }
        }
        sc.close();
    }
}