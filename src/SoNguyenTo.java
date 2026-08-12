import java.util.Scanner;

public class SoNguyenTo {
    static boolean isPrime(double n) {
        if (n < 2) {
            return false;
        }
        else if (n % 2 == 0|| n % 3 == 0) {
            return false;
        }
        else {
            int lim = (int)Math.sqrt(n);
            for (int i = 5; i <= lim; i += 6) {
                if ((n % i == 0) || (n % (i + 2) == 0)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        while (test-- > 0) {
            double n = sc.nextDouble();
            if (isPrime(n)) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}