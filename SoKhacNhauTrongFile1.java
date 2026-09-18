import java.util.Scanner;
import java.util.TreeMap;
import java.io.File;
import java.io.FileNotFoundException;

public class SoKhacNhauTrongFile1 {
    public static void main (String[] args) {
        File file = new File ("DATA.in");
        TreeMap<Integer, Integer> map = new TreeMap<>();

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                // String s = sc.next();
                int s = Integer.parseInt(sc.next());
                if (map.get(s) == null) {
                    map.put(s, 1);
                }
                else {
                    map.put(s, map.get(s) + 1);
                }
            }

            for (Integer key : map.keySet()) {
                System.out.println(key + " " + map.get(key));
            }
        }
        catch (FileNotFoundException error) {
            error.printStackTrace();
        }
    }
}