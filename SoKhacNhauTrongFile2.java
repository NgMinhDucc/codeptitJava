import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.TreeMap;

public class SoKhacNhauTrongFile2 {
  public static void main(String[] args) throws IOException, FileNotFoundException {
    FileInputStream file = new FileInputStream("DATA.IN");
    DataInputStream data = new DataInputStream(file);
    TreeMap<Integer, Integer> map = new TreeMap<>();

    for (int i = 1; i <= 100000; i++) {
      int x = data.readInt();
      if (map.get(x) == null) {
        map.put(x, 1);
      }
      else {
        map.put(x, map.get(x) + 1);
      }
    }

    map.forEach((k, v) -> {
      System.out.printf("%d %d\n", k, v);
    });
  }
}
