import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    //ascending by default
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    for (int i = 1; i <= n; i++) {
      int a = input.nextInt();
      pq.add(a);
    }
    while (!pq.isEmpty()) {
      int top = pq.peek();
      System.out.println(top);
      pq.remove();
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

