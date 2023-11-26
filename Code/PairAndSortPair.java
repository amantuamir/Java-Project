import java.util.*;

public class Main {

  static class Pair {
    int val, idx;
    public Pair(int val, int idx) {
      this.val = val;
      this.idx = idx;
    }
  }

  static class SortPair {
    static void sort(Pair[] arr, boolean isFirst) {
      Comparator<Pair> comparator = (p1, p2) -> (isFirst == true) ? p1.val - p2.val : p1.idx - p2.idx; 
      Arrays.sort(arr, comparator);
    }
  }
  
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    for (int T = 1; T <= t; T++) {
      int n = input.nextInt(), x = input.nextInt();
      Pair[] a = new Pair[n];
      for (int i = 0; i < n; i++) {
        a[i] = new Pair(input.nextInt(), i);
      }
      int[] b = new int[n];
      for (int i = 0; i < n; i++) {
        b[i] = input.nextInt();
      }
      Arrays.sort(b);
      SortPair.sort(a, true);
      int idxA = 0, idxB = 0, maxBeauty = 0;
      while (idxA < n && idxB < n) {
        if (a[idxA].val > b[idxB]) {
          idxB++; maxBeauty++; 
        }
        idxA++;
      }
      idxA = idxB = 0;
      int minBeauty = 0;
      while (idxA < n && idxB < n) {
        if (a[idxA].val <= b[idxB]) {
          idxA++; minBeauty++; 
        }
        idxB++;
      }
      minBeauty = n - minBeauty;
      if (x > maxBeauty || x < minBeauty) {
        System.out.println("NO"); continue;
      }
      System.out.println("YES");
      idxA = n - x;
      for (idxB = 0; idxB < x; idxB++) {
        a[idxA++].val = b[idxB];
      }
      for (idxA = 0; idxA < (n - x); idxA++, idxB++) {
        a[idxA].val = b[idxB];
      }
      SortPair.sort(a, false);
      for (Pair i : a) {
        System.out.print(i.val + " ");
      }
      System.out.println();
    }
    input.close();
  }
}

