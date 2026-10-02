import java.util.*;
import java.io.*;

public class ChuanHoaXauHoTenTrongFile {
  public static void main(String[] args) throws IOException, FileNotFoundException {
    File file = new File("DATA.in");
    Scanner sc = new Scanner(file);

    while (sc.hasNextLine()) {
      String line = sc.nextLine().trim();

      if (line.equals("END")) {
        break;
      }
      line = line.toLowerCase();
      String[] words = line.split("[^a-z]+");
      for (int i = 0; i < words.length; i++) {
        words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
      }
      System.out.println(String.join(" ", words));
    }

    sc.close();
  }
}
