import java.util.*;
import java.io.*;

public class LopIntSet2 {
  public static class IntSet {
    TreeSet<Integer> tset = new TreeSet<>();
    int[] arr;

    public IntSet(int[] arr) {
      this.arr = arr;
      for (int i : arr) {
        this.tset.add(i);
      }
    }

    public IntSet(TreeSet<Integer> ts) {
      this.tset = ts;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      for (Integer s : this.tset) {
        sb.append(String.format("%d ", s));
      }
      return sb.toString();
    }

    public IntSet intersection(IntSet other) {
      TreeSet<Integer> res = new TreeSet<>();
      for (Integer s : this.tset) {
        if (other.tset.contains(s)) {
          res.add(s);
        }
      }
      return new IntSet(res);
    }
  }

public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
