import java.util.Scanner;

public class UocSoChiaHetCho2 {
    static int Count (double n) {
        int cnt = 0;
        int tmp = (int)n;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (tmp % i == 0) {
                if (i % 2 == 0) {
                    cnt += 1;
                }
                if ((i != (tmp / i)) && ((tmp / i) % 2 == 0)) {
                    cnt += 1;
                }
            }
        }
        return cnt;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        while (test-- > 0) {
            double n = sc.nextDouble();
            System.out.println(Count(n));
        }


        sc.close();
    }
}