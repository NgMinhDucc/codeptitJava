import java.util.*;

public class DiemCanBang {
    static int Solve (int n, int[] a) {
        int tong_phai = 0;
        for (int i = 0; i < n; i++) {
            tong_phai += a[i];
        }
        
        int tong_trai = 0;
        for (int i = 0; i < n; i++) {
            tong_phai -= a[i];
            if (tong_phai == tong_trai) {
                return i + 1;
            }
            tong_trai += a[i];
        }
        
        return -1;
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
            
            System.out.println(Solve(n, arr));
        }
        
        sc.close();
    }
}