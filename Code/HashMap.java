import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    for (int T = 1; T <= t; T++) {
      int n = input.nextInt();
      String s = input.next();
      HashMap<Character, Integer> cnt = new HashMap<Character, Integer>();
      for (int i = 0; i < n; i++) {
        if (cnt.containsKey(s.charAt(i)) == false) cnt.put(s.charAt(i), 1); 
        else cnt.put(s.charAt(i), cnt.get(s.charAt(i)) + 1);
      }
      for (char i = 'a'; i <= 'z'; i++) {
        if (cnt.containsKey(i)) System.out.println(i + " " + cnt.get(i));
      }
    }
    input.close();
  }
}

