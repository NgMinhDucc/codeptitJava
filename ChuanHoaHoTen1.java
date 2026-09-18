import java.util.Scanner;

public class ChuanHoaHoTen1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            String s = sc.nextLine().trim().toLowerCase();
            String[] words = s.split("\\s+");
            for (int j = 0; j < words.length; j++) {
                words[j] = words[j].substring(0, 1).toUpperCase() + words[j].substring(1);
            }
            String name = String.join(" ", words);
            System.out.println(name);
        }

        sc.close();
    }
}