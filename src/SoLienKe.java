import java.util.Scanner;

public class SoLienKe {
    static String Solution(String n) {
        for (int i = 0; i < n.length() - 1; i++) {
            if (Math.abs((int)n.charAt(i) - (int)n.charAt(i + 1)) != 1) {
                return "NO";
            }
        }
        return "YES";
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        while (test-- > 0) {
            String n = sc.next();
            System.out.println(Solution(n));
        }
        
        sc.close();
    }
}