import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    for (int T = 1; T <= t; T++) {
      int n = input.nextInt();
      ArrayList<Integer> arr = new ArrayList<Integer>();
      for (int i = 0; i < n; i++) {
        int num = input.nextInt();
        arr.add(num);
      }
      prln(arr.get(0));

      arr.remove(2);
      for (int i : arr) {
        pnt(i + " ");
      }
      prln("");

      arr.set(0, 77);
      for (int i : arr) {
        pnt(i + " ");
      }
      prln("");

      Collections.sort(arr);
      for (int i : arr) {
        pnt(i + " ");
      }
      prln("");
      
    }
    input.close();
  }
  static void prln(Object anyObject) {
      System.out.println(anyObject);
  }
  static void pnt(Object anyObject) {
      System.out.print(anyObject);
  }
}

