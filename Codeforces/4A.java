import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (n % 2 == 0 && n > 2) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		input.close();
	}
}
