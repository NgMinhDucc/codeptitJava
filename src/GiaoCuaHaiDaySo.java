import java.util.Scanner;
import java.util.TreeMap;

public class GiaoCuaHaiDaySo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(), m = sc.nextInt();
        Integer[] a = new Integer[n], b = new Integer[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        TreeMap<Integer, Integer> dict = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            if (dict.get(a[i]) == null) {
                dict.put(a[i], 1);
            }
            else {
                dict.put(a[i], dict.get(a[i]) + 1);
            }
        }
        for (int i = 0; i < m; i++) {
            if (dict.get(b[i]) == null) {
                dict.put(b[i], 1);
            }
            else {
                dict.put(b[i], dict.get(b[i]) + 1);
            }
        }
        for (Integer key : dict.keySet()) {
            if (dict.get(key) > 1) {
                System.out.print(key + " ");
            }
        }
        
        sc.close();
    }
}