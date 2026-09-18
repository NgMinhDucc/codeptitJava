import java.util.*;

public class SoDep2 {
    static String Solve (String s) {
        int n = s.length();
        if (s.charAt(0) != '8' || s.charAt(n - 1) != '8') {
            return "NO";
        }

        int tong = 0;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) == s.charAt(n - i - 1)) {
                tong += ((s.charAt(i) - '0') + (s.charAt(n - i - 1) - '0'));
            }
            else {
                return "NO";
            }
        }

        if (tong % 10 == 0) {
            return "YES";
        }
        return "NO";
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        while (test-- > 0) {
            String s = sc.next();
            System.out.println(Solve(s));
        }

        sc.close();
    }
}