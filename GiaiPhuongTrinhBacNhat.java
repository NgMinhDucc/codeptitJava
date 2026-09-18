import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        if (a == 0 && b != 0) {
            System.out.print("VN");
        }
        else if (a == 0 && b == 0) {
            System.out.print("VSN");
        }
        else {
            System.out.printf("%.2f", -1 * b / a);
        }

        sc.close();
    }
}
