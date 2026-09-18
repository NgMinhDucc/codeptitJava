import java.util.Scanner;
import java.util.HashMap;
// use split() method in String to split a string into an array of words
// use HashMap<> to track emails' frequency

public class DiaChiEmail {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // String s = sc.nextLine().trim().toLowerCase();
        // String[] words = s.split("\\s+");
        // String name = words[words.length - 1];
        // String nameBehind = "";
        // for (int i = 0; i < words.length - 1; i++) {
        //     nameBehind += words[i].charAt(0);
        // }
        // String email = name + nameBehind + "@ptit.edu.vn";
        // System.out.print(email);

        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> freq = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine().trim().toLowerCase();

            String[] words = s.split("\\s+");
            String name = words[words.length - 1];
            String nameBehind = "";
            for (int j = 0; j < words.length - 1; j++) {
                nameBehind += words[j].charAt(0);
            }
            String email = name + nameBehind;

            if (freq.get(email) == null) {
                freq.put(email, 1);
                System.out.println(email + "@ptit.edu.vn");
            }
            else {
                freq.put(email, freq.get(email) + 1);
                System.out.println(email + freq.get(email) + "@ptit.edu.vn");
            }
        }

        sc.close();
    }
}