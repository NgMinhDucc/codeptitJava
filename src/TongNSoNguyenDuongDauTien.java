import java.util.Scanner;

public class TongNSoNguyenDuongDauTien {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        while (test-- > 0) {
            long n = sc.nextLong();
            System.out.println(n * (n + 1) / 2);
        }

        sc.close();
    }
}
