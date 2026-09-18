import java.util.Scanner;

public class TongUocSo1 {
    static long Sum (long num) {
        long tong = 0;
        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                tong += i;
                num /= i;
            }
        }
        if (num > 1) {
            tong += num;
        }
        return tong;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            long num = sc.nextLong();
            res += Sum(num);
        }
        System.out.print(res);

        sc.close();
    }
}