import java.util.Scanner;

public class CatDoi {
    static void Cut (String num) {
        // String res = "";
        StringBuilder res = new StringBuilder();
        int zero_cnt = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '0' || num.charAt(i) == '8' || num.charAt(i) == '9') {
                // res += '0';
                res.append('0');
                zero_cnt += 1;
            }
            else if (num.charAt(i) == '1') {
                // res += '1';
                res.append('1');
            }
            else {
                System.out.println("INVALID");
                return;
            }
        }
        if (zero_cnt == res.length()) { // the string contains only 0
            System.out.println("INVALID");
        }
        // else {
        //     System.out.println(Integer.parseInt(res));
        // }
        else {
            int start = 0;
            while (start < res.length() - 1 && res.charAt(start) == '0') {
                start += 1;
            }
            System.out.println(res.substring(start)); // print the substring, starting from start
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        while (test-- > 0) {
            String num = sc.next();
            Cut(num);
        }

        sc.close();
    }
}
