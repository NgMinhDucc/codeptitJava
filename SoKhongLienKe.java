import java.util.Scanner;

public class SoKhongLienKe {
    static String Check (String num) {
        int tong = 0;
        for (int i = 0; i < num.length() - 1; i++) {
            int dif = Math.abs((num.charAt(i) - '0') - (num.charAt(i + 1) - '0'));
            if (dif != 2) {
                return "NO";
            }
            tong += num.charAt(i) - '0';
        }
        tong += num.charAt(num.length() - 1) - '0';
        if (tong % 10 != 0) {
            return "NO";
        }
        return "YES";
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        while (test-- > 0) {
            String num = sc.next();
            System.out.println(Check(num));
        }

        sc.close();
    }
}