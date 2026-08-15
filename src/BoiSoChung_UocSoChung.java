import java.util.Scanner;

public class BoiSoChung_UocSoChung {
    static int UocChung (int a, int b) {
        while (b != 0) {
            int uc = a % b;
            a = b;
            b = uc;
        }
        return a;
    }

    static long BoiChung (int a, int b) {
        long bc = (long)a / UocChung(a, b) * b; // trong java, kiểu của toàn bộ biểu thức được quyết định bởi toán hạng
        return bc;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        while (test-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(BoiChung(a, b) + " " + UocChung(a, b));
        }

        sc.close();
    }
}