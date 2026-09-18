import java.util.Scanner;
import java.util.LinkedHashMap; // giu lai thu tu insert cua cac phan tu

public class DemSoLanXuatHien {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            int n = sc.nextInt();
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            LinkedHashMap<Integer, Integer> dict = new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                if (dict.get(a[i]) == null) {
                    dict.put(a[i], 1);
                }
                else {
                    dict.put(a[i], dict.get(a[i]) + 1);
                }
            }
            System.out.println("Test " + t + ":");
            for (Integer key : dict.keySet()) {
                System.out.println(key + " xuat hien " + dict.get(key) + " lan");
            }
        }
        
        sc.close();
    }
}