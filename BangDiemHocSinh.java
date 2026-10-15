import java.util.*;

public class BangDiemHocSinh {
  public static class HocSinh implements Comparable<HocSinh> {
    private static int i = 0;
    private String id, name, rank;
    private double finalScore;

    public double setScore(double[] scores) {
      double score = 0f;
      for (int i = 0; i < 10; i++) {
        if (i == 0 || i == 1) score += scores[i] * 2;
        else score += scores[i];
      }
      return score / 12;
    }

    public String setRank(double finalScore) {
      if (finalScore >= 9) return "XUAT SAC";
      else if (finalScore >= 8) return "GIOI";
      else if (finalScore >= 7) return "KHA";
      else if (finalScore >= 5) return "TB";
      return "YEU";
    }

    public HocSinh(String name, double[] scores) {
      i += 1;
      this.id = String.format("HS%02d", i);
      this.name = name;
      this.finalScore = setScore(scores);
      this.rank = setRank(this.finalScore);
    }

    @Override 
    public int compareTo(HocSinh other) {
      if (Double.compare(this.finalScore, other.finalScore) == 0) {
        return this.id.compareTo(other.id);
      }
      return -Double.compare(this.finalScore, other.finalScore);
    }

    @Override 
    public String toString() {
      return String.format("%s %s %.1f %s", this.id, this.name, this.finalScore * 10.f / 10.f, this.rank);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());

    int n = sc.nextInt();
    ArrayList<HocSinh> arr = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      sc.nextLine();
      String name = sc.nextLine();
      double[] scores = new double[10];
      for (int j = 0; j < 10; j++) {
        scores[j] = sc.nextDouble();
      }
      arr.add(new HocSinh(name, scores));
    }
    Collections.sort(arr);

    for (HocSinh hs : arr) {
      System.out.println(hs);
    }

    sc.close();
  }
}
