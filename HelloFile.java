import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class HelloFile {
    public static void main (String[] args) {
        File file = new File("Hello.txt");
        
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException error) {
            System.out.println("File not found");
            error.printStackTrace();
        }
    }
}