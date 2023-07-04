import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s1 = input.next().toLowerCase();
		String s2 = input.next().toLowerCase();
		int len = s1.length(), res = 0;
		for (int i = 0; i < len; i++) {
			if ((s1.charAt(i)) < s2.charAt(i)) {
				res = -1; break;
			}
			if (s1.charAt(i) > s2.charAt(i)) {
				res = 1; break;
			}
		}
		System.out.println(res);
		input.close();
	}
}
