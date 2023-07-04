import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while (t-- > 0) {
			String s = input.next();
			int len = s.length();
			if (len > 10) {
				System.out.println(s.charAt(0) + "" + (len - 2) + "" + s.charAt(len - 1));
			}
			else {
				System.out.println(s);
			}
		}
		input.close();
	}
}
