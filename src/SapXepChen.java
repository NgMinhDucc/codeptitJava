import java.util.*;

public class SapXepChen {
    static void InsertSort(int n, int[] a) { // chon ra key roi so sanh voi cac phan tu truoc key
        for (int i = 0; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j -= 1;
            }
            a[j + 1] = key;
            
            System.out.print("Buoc " + i + ": ");
            for (int x = 0; x <= i; x++) {
                System.out.print(a[x] + " ");
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
        
        InsertSort(n, arr);
        
        sc.close();
    }
}