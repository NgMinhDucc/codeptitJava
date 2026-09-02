import java.util.*;

public class SapXepNoiBot { // so sanh cac cap phan tu ke nhau
    static void BubbleSort(int n, int[] a) {
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j + 1] < a[j]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    swapped = true;
                }
            }
            
            if (!swapped) {
                break;
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
        
        BubbleSort(n, arr);
        
        sc.close();
    }
}