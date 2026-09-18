import java.util.*;

public class SoDep3 {
    static String Solve (String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            char left = s.charAt(i);
            char right = s.charAt(n - i - 1);
            if (left != right || "2357".indexOf(left) == -1) {
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