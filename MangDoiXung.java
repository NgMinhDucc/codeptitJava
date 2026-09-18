import java.util.Scanner;

public class MangDoiXung {
    static String Check(int n, int[] arr) {
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                return "NO";
            }
        }
        return "YES";
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(Check(n, arr));
        }

        sc.close();
    }
}
