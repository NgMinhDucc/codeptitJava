import java.util.*;

public class LietKeToHop1 {
    public static int cnt = 0; // bien toan cuc
    
    // min = res[i - 1] + 1, max = n - k + i
    static void Try (int i, int n, int k, int[] res) {
        for (int j = res[i - 1] + 1; j <= n - k + i; j++) {
            res[i] = j;
            if (i == k) {
                for (int x = 1; x <= k; x++) {
                    System.out.print(res[x] + " ");
                }
                System.out.println();
                cnt += 1;
            }
            else {
                Try(i + 1, n, k, res);
            }
        }
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextByte(), k = sc.nextInt();
        int[] res = new int[k + 1];
        Try(1, n, k, res);
        System.out.print("Tong cong co " + cnt + " to hop");
        
        sc.close();
    }
}