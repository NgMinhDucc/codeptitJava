import java.util.*;
import java.io.*;

@SuppressWarnings("unchecked")
public class SoNguyenToTrong2FileNhiPhan {
  public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
    final int MAX = 10005;
    Boolean[] isPrime = new Boolean[MAX + 1];
    for (int x = 2; x <= MAX; x++) {
      isPrime[x] = true;
    }

    for (int i = 2; i * i <= MAX; i++) {
      if (isPrime[i]) {
        for (int j = i * i; j <= MAX; j += 1) {
          isPrime[j] = false;
        }
      }
    }

    TreeMap<Integer, Integer> map = new TreeMap<>();

    ObjectInputStream obj1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
    ArrayList<Integer> arr1 = (ArrayList<Integer>) obj1.readObject();
    ObjectInputStream obj2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
    ArrayList<Integer> arr2 = (ArrayList<Integer>) obj2.readObject();

    for (Integer i : arr1) {
      if (isPrime[i]) {
        map.put(i, map.getOrDefault(i, 0) + 1);
      }
    }

    for (Integer i : arr2) {
      if (isPrime[i]) {
        map.put(i, map.getOrDefault(i, 0) + 1);
      }
    }

    for (Integer i : map.keySet()) {
    }

    obj1.close();
    obj2.close();
  }
}
