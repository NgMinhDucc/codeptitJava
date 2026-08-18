import java.util.Scanner;

public class SoChinhPhuong {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        while (test-- > 0) {
            long n = sc.nextInt();
            if ((long)Math.sqrt(n) * (long)Math.sqrt(n) == n) {
                System.out.println("YES");
            }
            else {
                System.out.println( "NO");
            }
        }

        sc.close();
    }
}
