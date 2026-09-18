import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TinhTong {
    public static void main (String[] args) {
        File file = new File("DATA.in");

        try (Scanner sc = new Scanner(file)) {
            long tong = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                String[] str = line.split("\\s+");

                for (String s : str) {
                    try {
                        int num = Integer.parseInt(s);
                        tong += num;
                    }
                    catch (NumberFormatException error) {
                        continue;
                    }
                }
            }
            System.out.print(tong);
        }
        catch (FileNotFoundException error) {
            System.out.print("File not found");
            error.printStackTrace();
        }
    }
}