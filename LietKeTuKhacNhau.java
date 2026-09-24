import java.util.Scanner;
import java.util.TreeSet;
import java.io.File;
import java.io.FileNotFoundException;

public class LietKeTuKhacNhau {
  public static void main (String[] args) {
    File file = new File("VANBAN.in");
    TreeSet <String> set = new TreeSet<>();

    try (Scanner sc = new Scanner(file)) {
      while (sc.hasNext()) {
        String word = sc.next().toLowerCase();
        set.add(word);
      }

      for (String s : set) {
        System.out.println(s);
      }
    }
    catch (FileNotFoundException error) {
      System.out.print("File not found");
      error.printStackTrace();
    }
  }
}
