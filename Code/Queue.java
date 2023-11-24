import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    Queue<Integer> Q = new LinkedList<Integer>();
    for (int i = 1; i <= n; i++) {
      int a = input.nextInt();
      Q.add(a);
    }
    while (!Q.isEmpty()) {
      int front = Q.peek();
      System.out.println(front);
      Q.remove();
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

