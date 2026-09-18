import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DocFileVanBan {
    public static void main (String[] args) {
        File file = new File("DATA.in");

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException error) {
            System.out.print("File not found");
            error.printStackTrace();
        }
    }
}