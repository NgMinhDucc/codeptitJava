import java.util.Scanner;

public class PhanTichThuaSoNguyenTo {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);

        int test = console.nextInt();
        for (int t = 1; t <= test; t++) {
            int n = console.nextInt();
            int cnt = 0;
            System.out.print("Test " + t + ": ");
            for (int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    cnt += 1;
                    n /= i;
                }
                if (cnt > 0) {
                    System.out.print(i + "(" + cnt + ") ");
                }
                cnt = 0;
            }
            if (n != 1) {
                System.out.println(n + "(" + 1 + ")");
            }
            else {
                System.out.print("\n");
            }
        }

        console.close();
    }
}
