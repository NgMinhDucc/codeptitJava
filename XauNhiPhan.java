import java.util.*;

public class XauNhiPhan {
    static char Solution (int n, long k) {
        long[] len = new long[100];
        len[1] = 1;
        len[2] = 1;
        
        for (int i = 3; i <= 92; i++) {
            len[i] = len[i - 2] + len[i - 1];
        }
        
        while (n > 2) {
            if (k <= len[n - 2]) {
                n -= 2;
            }
            else{
                k -= len[n - 2];
                n -= 1;
            }
        }
        
        if (n == 1) {
            return '0';
        }
        return '1';
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            
            System.out.println(Solution(n, k));
        }
        
        sc.close();
    }
}