import java.util.*;

public class LopPair {
  static final int MAX = 1000005;
  static boolean[] primes = new boolean[MAX + 1];

  static void initPrimes() {
    Arrays.fill(primes, true);
    primes[0] = primes[1] = false;

    for (int i = 2; i * i <= MAX; i++) {
      if (primes[i]) {
        for (int j = i * i; j <= MAX; j += i) {
          primes[j] = false;
        }
      }
    }
  }

  static {
    initPrimes();
  }

  // NOTE: generic class
  public static class Pair<T, U> {
    int i, n_i;

    public Pair(int i, int n_i) {
      this.i = i;
      this.n_i = n_i;
    }

    public boolean isPrime() {
      return primes[i] && primes[n_i];
    }

    @Override
    public String toString() {
      return this.i + " " + this.n_i;
    }
  }

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
