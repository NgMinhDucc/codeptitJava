import java.util.Scanner;

public class ChuSo4VaChuSo7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        int tong = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '4' || num.charAt(i) == '7') {
                tong += 1;
            }
        }
        System.out.print((tong == 4 || tong == 7) ? "YES" : "NO");

        sc.close();
    }
}