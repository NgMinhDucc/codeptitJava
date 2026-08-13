import java.util.Scanner;

public class KiemTraSoFibonacci {
    static String checkFibonacci (long n) {
        if (n == 1) {
            return "YES";
        }

        long f1 = 1, f2 = 1, fn = 0;
        while (fn < n) {
            fn = f1 + f2;
            f2 = f1;
            f1 = fn;
        }

        if (fn == n) {
            return "YES";
        }
        return "NO";
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        while (test-- > 0) {
            long n = sc.nextLong();
            System.out.println(checkFibonacci(n));
        }

        sc.close();
    }
}
