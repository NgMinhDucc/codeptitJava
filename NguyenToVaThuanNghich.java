import java.util.*;
import java.io.*;

// WARN:Time Limit Exceed
public class NguyenToVaThuanNghich {
  static Boolean isPalindrome (Integer n) {
    // String s = String.valueOf(n);
    // for (int i = 0; i < s.length() / 2; i++) {
    //   if (s.charAt(i) != s.charAt(n - i + 1)) {
    //     return false;
    //   }
    // }
    // return true;
    
    String s = String.valueOf(n);
    int l = 0, r = s.length() - 1;
    while (l < r) {
      if (s.charAt(l) != s.charAt(r)) {
        return false;
      }
      l--;
      r++;
    }
    return true;
  }

  @SuppressWarnings("unchecked")
  public static void main(String[] args) throws Exception{
    final int MAX = 10005;
    boolean[] isPrime = new boolean[MAX + 1];
    for (int x = 2; x <= MAX; x++) {
      isPrime[x] = true;
    }

    for (int i = 2; i * i <= MAX; i++) {
      if (isPrime[i]) {
        for (int j = i * i; j <= MAX; j += i) {
          isPrime[j] = false;
        }
      }
    }

    ObjectInputStream prime = new ObjectInputStream(new FileInputStream("DATA1.in"));
    ArrayList<Integer> pri = (ArrayList<Integer>) prime.readObject();
    TreeMap<Integer, Integer> mapPrime = new TreeMap<>();
    
    for (Integer i : pri) {
      if (isPrime[i]) {
        mapPrime.put(i, mapPrime.getOrDefault(i, 0) + 1);
      }
    }

    ObjectInputStream palindrome = new ObjectInputStream(new FileInputStream("DATA2.in"));
    ArrayList<Integer> pal = (ArrayList<Integer>) palindrome.readObject();
    TreeMap<Integer, Integer> mapPalindrome = new TreeMap<>();

    for (Integer i : pal) {
      if (isPalindrome(i)) {
        mapPalindrome.put(i, mapPalindrome.getOrDefault(i, 0) + 1);
      }
    }

    mapPrime.forEach ((k, v) -> {
      System.out.println(k + " " + v + " " + mapPalindrome.get(k));
    });

    prime.close();
    palindrome.close();
  }
}
