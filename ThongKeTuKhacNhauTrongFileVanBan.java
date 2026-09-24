import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class ThongKeTuKhacNhauTrongFileVanBan {
	public static void main(String[] args) {
		File file = new File("VANBAN.in");
		HashMap<String, Integer> map = new HashMap<>();
		ArrayList<String> arr = new ArrayList<>();

		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				arr.add(line);
			}
		} catch (FileNotFoundException error) {
			error.printStackTrace();
		}
	}
}