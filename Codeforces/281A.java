
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s = input.next();
		if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
			char firstChar = Character.toUpperCase(s.charAt(0));
			int len = s.length();
			s = firstChar + s.substring(1, len);
		}
		System.out.println(s);
		input.close();
	}
}
