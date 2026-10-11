import java.util.*;

public class LopWordSet {
  public static class WordSet {
    String[] words;
    TreeSet<String> tset;

    public WordSet(String str) {
      this.words = str.trim().toLowerCase().split("\\s+");
      this.tset = new TreeSet<>();
      for (String s : this.words) {
        this.tset.add(s);
      }
    }

    public WordSet(TreeSet<String> ts) {
      this.tset = ts;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      for (String s : this.tset) {
        sb.append(String.format("%s ", s));
      }
      return String.join(" ", this.tset);
    }

    public WordSet intersection(WordSet other) {
      TreeSet<String> u = new TreeSet<>();
      for (String s : this.tset) {
        if (other.tset.contains(s)) {
          u.add(s);
        }
      }
      return new WordSet(u);
    }

    public WordSet union(WordSet other) {
      TreeSet<String> i = new TreeSet<>();
      i.addAll(this.tset);
      i.addAll(other.tset);
      return new WordSet(i);
    }
  }

  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
