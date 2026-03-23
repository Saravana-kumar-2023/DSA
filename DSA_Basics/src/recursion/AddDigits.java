package recursion;

import java.util.Scanner;

public class AddDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int res = addDigits(num);
		System.out.println("Output is : "+res);
	}

	private static int addDigits(int num) {
		if(num == 0) {
			return 0;
		}
		return 1 + (num - 1) % 9;
	}
}
