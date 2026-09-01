import java.util.Scanner;
import java.util.TreeSet;

public class HopCuaHaiDaySo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            set.add(b[i]);
        }
        set.forEach((k) -> {
            System.out.print(k + " ");
        });
        
        sc.close();
    }
}