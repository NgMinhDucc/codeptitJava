import java.util.Scanner;
import java.util.TreeSet; // luu cac phan tu khong trung lap va tu dong sap xep tang dan dua tren kieu du lieu

public class GiaoCuaHaiDaySo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]) {
                    set.add(a[i]);
                    break;
                }
            }
        }
        set.forEach((k) -> { // cach duyet cac phan tu cua set va map
            System.out.print(k + " ");
        });
        
        sc.close();
    }
}