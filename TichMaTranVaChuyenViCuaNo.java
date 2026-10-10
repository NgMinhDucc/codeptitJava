import java.util.*;

public class TichMaTranVaChuyenViCuaNo {
  public static class Matrix {
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    int rows, cols;

    public Matrix(int r, int c) {
      this.rows = r;
      this.cols = c;
    }

    public void nextMatrix(Scanner sc) {
      for (int i = 0; i < this.rows; i++) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int j = 0; j < this.cols; j++) {
          arr.add(sc.nextInt());
        }
        this.matrix.add(arr);
      }
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      for (ArrayList<Integer> arr : matrix) {
        for (Integer i : arr) {
          sb.append(String.format("%d ", i));
        }
        sb.append("\n");
      }
      return sb.toString();
    }

    public Matrix trans() {
      Matrix b = new Matrix(this.cols, this.rows);
      for (int i = 0; i < this.cols; i++) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int j = 0; j < this.rows; j++) {
          arr.add(this.matrix.get(j).get(i));
        }
        b.matrix.add(arr);
      }
      return b;
    }

    public Matrix mul(Matrix other) {
      Matrix res = new Matrix(this.rows, other.cols);
      for (int i = 0; i < this.rows; i++) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int j = 0; j < other.cols; j++) {
          int sum = 0;
          for (int k = 0; k < this.cols; k++) {
            sum += this.matrix.get(i).get(k) * other.matrix.get(k).get(j);
          }
          arr.add(sum);
        }
        res.matrix.add(arr);
      }
      return res;
    }
  }

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt(), m = sc.nextInt();
             Matrix a = new Matrix(n,m);
             a.nextMatrix(sc);
             Matrix b = a.trans();
             System.out.println(a.mul(b));
        }
    }
}
