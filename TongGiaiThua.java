import java.util.Scanner;

public class TongGiaiThua {
    static long factorialSum (int n) {
        if (n == 2) {
            return n;
        }

        long fac = n;
        for (int i = n - 1; i >= 2; i--) {
            fac *= i;
        }
        return fac;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long sum = 1;
        for (int i = 2; i <= n; i++) {
            sum += factorialSum(i);
        }
        System.out.print(sum);

        sc.close();
    }
}
