import java.util.*;

public class LopIntSet {
  public static class IntSet {
    TreeSet<Integer> set = new TreeSet<>();

    // NOTE: Constructor of s1 and s2
    public IntSet(int[] arr) {
      for (int i : arr) {
        set.add(i);
      }
    }

    // NOTE: Constructor for union's result
    public IntSet(TreeSet<Integer> ts) {
      this.set = ts;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      for (Integer i : this.set) {
        sb.append(String.format("%d ", i));
      }
      return sb.toString();
    }

    public IntSet union(IntSet other) {
      TreeSet<Integer> s = new TreeSet<>();
      s.addAll(this.set);
      s.addAll(other.set);
      return new IntSet(s);
    }
  }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
