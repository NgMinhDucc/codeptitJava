// import java.util.*;
// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;
//
// public class TreNhatGiaNhat {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//
//     int t = sc.nextInt();
//     sc.nextLine();
//     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//     ArrayList<LocalDate> arr = new ArrayList<>();
//     HashMap<LocalDate, String> map = new HashMap<>();
//     while (t-- > 0) {
//       String[] s = sc.nextLine().trim().split("\\s+");
//       arr.add(LocalDate.parse(s[1], formatter));
//       map.put(LocalDate.parse(s[1], formatter), s[0]);
//     }
//
//     String gia = map.get(arr.get(0));
//     String tre = map.get(arr.get(arr.size() - 1));
//     System.out.printf("%s\n%s", tre, gia);
//
//     sc.close();
//   }
// }

import java.util.*;

public class TreNhatGiaNhat {
  public static class Person implements Comparable<Person> {
    protected String name, dob, day, month, year;

    public Person(String name, String dob) {
      this.name = name;
      this.dob = dob;
      this.day = dob.substring(0, 2);
      this.month = dob.substring(3, 5);
      this.year = dob.substring(6);
    }

    @Override
    public int compareTo(Person other) {
      if (this.year.compareTo(other.year) == 0) {
        if (this.month.compareTo(other.month) == 0) {
          return this.day.compareTo(other.day);
        }
        return this.month.compareTo(other.month);
      }
      return this.year.compareTo(other.year);
    }

    @Override
    public String toString() {
      return String.format(
          "%s %s",
          this.name,
          this.dob);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    ArrayList<Person> arr = new ArrayList<>();
    while (t-- > 0) {
      arr.add(new Person(sc.next(), sc.next()));
    }

    Collections.sort(arr);
    // for (Person p : arr) {
    // System.out.println(p);
    // }
    System.out.println(arr.get(arr.size() - 1).name + "\n" + arr.get(0).name);
    sc.close();
  }
}
