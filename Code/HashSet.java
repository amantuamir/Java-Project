import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    for (int T = 1; T <= t; T++) {
      int n = input.nextInt();
      String s = input.next();
      int res = n;
      HashSet<Character> mark = new HashSet<Character>();
      for (int i = 0; i < n; i++) {
        if (mark.contains(s.charAt(i)) == false) res++; 
        mark.add(s.charAt(i));
      }
      System.out.println(res);
    }
    input.close();
  }
}

