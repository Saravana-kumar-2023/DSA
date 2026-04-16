package programs;

import java.util.Scanner;

public class PowerOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		boolean res = isPowerOfThree(n);
		System.out.println(res);
	}

	private static boolean isPowerOfThree(int n) {
		if(n <= 0) {
			return false;
		}
		while(n % 3 == 0) {
			n = n / 3;
		}
		return n == 1;
	}
}
