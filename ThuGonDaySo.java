import java.util.*;

public class ThuGonDaySo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < n; i++) {
            if (!stack.isEmpty() && (stack.peek() + arr[i]) % 2 == 0) {
                stack.pop();
            }
            else {
                stack.push(arr[i]);
            }
        }
        System.out.print(stack.size());
        
        sc.close();
    }
}