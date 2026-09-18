import java.util.Scanner;

public class TinhLuyThua {
    static long Cal(long a, long b) {
        final long MOD = 1000000007L;
        if (b == 0) {
            return 1;
        }
        long luythua = Cal(a, b / 2);
        if (b % 2 == 0) {
            return (luythua % MOD * luythua % MOD) % MOD;
        }
        else {
            return (((luythua % MOD * luythua % MOD) % MOD) * (a % MOD)) % MOD;
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a == 0 && b == 0) {
                break;
            }
            else {
                System.out.println(Cal(a, b));
            }
        }

        sc.close();
    }
}