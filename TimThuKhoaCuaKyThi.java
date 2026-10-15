import java.util.*;

public class TimThuKhoaCuaKyThi {
  public static class ThiSinh implements Comparable<ThiSinh> {
    private static int i = 0;
    private String id, name, dob;
    private float totalScore;

    public ThiSinh(String name, String dob, float score1, float score2, float score3) {
      i += 1;
      this.id = String.format("%1d", i);
      this.name = name;
      this.dob = dob;
      this.totalScore = score1 + score2 + score3;
    }

    public float getScore() {
      return totalScore;
    }

    @Override 
    public int compareTo(ThiSinh other) {
      if (Float.compare(this.totalScore, other.totalScore) == 0) {
        return this.id.compareTo(other.id);
      }
      return -Float.compare(this.totalScore, other.totalScore);
    }

    @Override 
    public String toString() {
      return String.format("%s %s %.1f", this.id, this.name, this.dob, this.totalScore);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.getDefault());

    ArrayList<ThiSinh> arr = new ArrayList<>();
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      sc.nextLine();
      arr.add(new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat()));
    }
    Collections.sort(arr);

    System.out.println(arr.get(0));
    for (int i = 1; i < n; i++) {
      if (arr.get(i).getScore() == arr.get(0).getScore()) {
        System.out.println(arr.get(i));
      }
      else {
        break;
      }
    }

    sc.close();
  }
}
