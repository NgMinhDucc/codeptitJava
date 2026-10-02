import java.util.*;
import java.io.*;

@SuppressWarnings("unused")
public class LoaiBoSoNguyen {
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(new File("DATA.in"));
    ArrayList<String> arr = new ArrayList<>();

    while (sc.hasNext()) {
      String word = sc.next();
      try {
        int num = Integer.parseInt(word);
      }
      catch (Exception e) {
        arr.add(word);
      }
    }

    arr.sort((a, b) -> {
      return a.compareTo(b);
    });

    System.out.print(String.join(" ", arr));

    sc.close();
    // for (String s : set) {
    //   System.out.printf("%s ", s);
    // }
  }
}
