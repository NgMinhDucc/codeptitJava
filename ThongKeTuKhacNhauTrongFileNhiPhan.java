import java.util.*;
import java.io.*;

@SuppressWarnings("unchecked")
public class ThongKeTuKhacNhauTrongFileNhiPhan {
  public static void main(String[] args) throws Exception{
    ObjectInputStream object = new ObjectInputStream(new FileInputStream("DATA.in"));
    ArrayList<String> arr = (ArrayList<String>) object.readObject();
    TreeMap<String, Integer> map = new TreeMap<>();

    for (String str : arr) {
      String s = str.toLowerCase().trim();
      String[] words = s.split("[^a-z0-9]+");
      for (String word : words) {
        if (!word.isEmpty()) {
          map.put(word, map.getOrDefault(word, 0) + 1);
        }
      }
    }

    ArrayList<String> list = new ArrayList<>(map.keySet());
    list.sort((a, b) -> {
      return map.get(b) - map.get(a);
    });

    for (String s : list) {
      System.out.println(s + " " + map.get(s));
    }

    object.close();
  }
}
