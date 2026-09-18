import java.util.*;

public class SoDep1 {
    static String Solve (String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1) || (s.charAt(i) - '0') % 2 != 0 || (s.charAt(n - i - 1) - '0') % 2 != 0) {
                return "NO";
            }
        }
        return "YES";
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