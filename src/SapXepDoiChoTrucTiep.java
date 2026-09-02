import java.util.*;

public class SapXepDoiChoTrucTiep {
    static void InterchangeSort (int n, int[] a) { // swap cac cap nghich the (ai > aj && i < j)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int x : a) {
                System.out.print(x + " ");
            }
            System.out.print("\n");
        }
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        InterchangeSort(n, arr);
        
        sc.close();
    }
}