import java.util.*;

public class SapXepChon {
    static void SelectionSort(int n, int[] a) { // tim phan tu be nhat va swap voi phan tu thu i (i chay tu 0)
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_idx]) {
                    min_idx = j;
                }
            }
            
            int tmp = a[i];
            a[i] = a[min_idx];
            a[min_idx] = tmp;
            
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int x : a) {
                System.out.print(x + " ");
            }
            System.out.print("\n");
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        SelectionSort(n, arr);
        
        sc.close();
    }
}
