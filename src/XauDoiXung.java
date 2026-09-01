import java.util.Scanner;

public class XauDoiXung {
    static String Check (String s) {
        int cnt = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                cnt += 1;
                if (cnt > 1) {
                    return "NO";
                }
            }
        }
        return "YES";
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        while (test-- > 0) {
            String s = sc.next();
            System.out.println(Check(s));
        }

        sc.close();
    }
}

//todo need fix