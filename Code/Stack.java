import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    Stack<Integer> stk = new Stack<Integer>();
    for (int i = 1; i <= n; i++) {
      int a = input.nextInt();
      stk.push(a);
    }
    while (!stk.isEmpty()) {
      int top = stk.peek();
      System.out.println(top);
      stk.pop();
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

