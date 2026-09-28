import java.util.*;
import java.io.*;

public class ThongKeTuKhacNhauTrongFileVanBan {
  public static void main(String[] args) throws IOException, FileNotFoundException {
    File file = new File("VANBAN.in");
    Scanner sc = new Scanner(file);
    TreeMap<String, Integer> map = new TreeMap<>();

    int n = Integer.parseInt(sc.nextLine().trim());
    for (int i = 1; i <= n; i++) {
      String line = sc.nextLine().toLowerCase().trim();
      // String[] words = line.split("[\\s,.?!:;()/-]+");
      String[] words = line.split("[^a-z0-9]");
      for (String word : words) {
        if (!word.isEmpty()) {
          map.put(word, map.getOrDefault(word, 0) + 1);
        }
      }
    }

    ArrayList<String> arr = new ArrayList<>(map.keySet());
    arr.sort((a, b) -> {
        return map.get(b) - map.get(a);
    });

    for (String s : arr) {
      System.out.println(s + " " + map.get(s));
    }

    sc.close();
  }
}
