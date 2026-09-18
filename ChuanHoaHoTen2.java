import java.util.Scanner;

public class ChuanHoaHoTen2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            String s = sc.nextLine().trim().toLowerCase();
            String[] words = s.split("\\s+");
            String firstName = words[0].toUpperCase();
            String name = "";
            for (int j = 1; j < words.length; j++) {
                words[j] = words[j].substring(0, 1).toUpperCase() + words[j].substring(1);
                if (j < words.length - 1) {
                    name += words[j] + " ";
                }
                else{
                    name += words[j] + ", ";
                }
            }
            System.out.println(name + firstName);
        }

        sc.close();
    }
}