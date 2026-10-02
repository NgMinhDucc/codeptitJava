import java.util.*;
import java.io.*;

public class SoNguyenToTrongFileNhiPhan {
  // static Boolean isPrime (Integer n) {
  //   if (n < 2) {
  //     return false;
  //   }
  //   else if (n == 2 || n == 3) {
  //     return true;
  //   }
  //   else if (n % 2 == 0 || n % 3 == 0) {
  //     return false;
  //   }
  //   for (int i = 5; i <= Math.sqrt(n) + 1; i += 6) {
  //     if (n % i == 0 || n % (i + 2) == 0) {
  //       return false;
  //     }
  //   }
  //   return true;
  // }

  @SuppressWarnings("unchecked")
  public static void main(String[] args) throws Exception {
    final int MAX = 10005;
    boolean[] isPrime = new boolean[MAX + 1];
    for (int x = 2; x < MAX; x++) {
      isPrime[x] = true;
    }

    for (int i = 2; i * i <= MAX; i++) {
      if (isPrime[i]) {
        for (int j = i * i; j <= MAX; j += i) {
          isPrime[j] = false;
        }
      }
    }

    ObjectInputStream obj = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
    ArrayList<Integer> arr = (ArrayList<Integer>) obj.readObject();
    TreeMap<Integer, Integer> map = new TreeMap<>();

    for (Integer i : arr) {
      if (isPrime[i]) {
        map.put(i, map.getOrDefault(i, 0) + 1);
      }
    }

    map.forEach((k, v) -> {
      System.out.println(k + " " + v);
    });

    obj.close();
  }
}
