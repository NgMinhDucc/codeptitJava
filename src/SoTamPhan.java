import java.util.Scanner;

public class SoTamPhan {
    static String Check (String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '0' && c != '1' && c != '2') {
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
            System.out.println(Check(s));
        }

        sc.close();
    }
}