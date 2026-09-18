import java.util.Scanner;

public class UocSoNguyenToLonNhat {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        while (test-- > 0) {
            long n = sc.nextLong();
            long maxx = -1;

            while (n % 2 == 0) {
                maxx = 2;
                n /= 2;
            }

            for (long i = 3; i <= Math.sqrt(n); i++) {
                while (n % i == 0) {
                    maxx = i;
                    n /= i;
                }
            }

            if (n > 1) {
                maxx = n;
            }

            System.out.println(maxx);
        }

        sc.close();
    }
}
