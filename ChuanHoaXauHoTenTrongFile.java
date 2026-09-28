import java.util.*;
import java.io.*;

public class ChuanHoaXauHoTenTrongFile {
  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("DATA.in");
    Scanner sc = new Scanner(file);

    while (sc.hasNextLine()) {
      String line = sc.nextLine().trim();

      if (line == "END") {
        break;
      }
      line = line.toLowerCase();
      String[] words = line.split("\\s+");
      for (String word : words) {
        word = word.substring(0, 1).toUpperCase() + word.substring(1);
      }
      System.out.println(String.join(" ", words));
    }
  }
}
