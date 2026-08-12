import java.util.Scanner;

public class HinhChuNhat {
    public static void main (String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // System.out.print(a);
        // sc.close();

        Scanner sc = new Scanner(System.in);

        int dai = sc.nextInt();
        int rong = sc.nextInt();
        if (dai <= 0 || rong <= 0) {
            System.out.print(0);
        }
        else {
            System.out.print((dai + rong) * 2 + " ");
            System.out.print(dai * rong);
        }

        sc.close();
    }
}
