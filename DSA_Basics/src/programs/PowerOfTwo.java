package programs;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		boolean res = isPowerOfTwo(n);
		System.out.println(res);
	}

	private static boolean isPowerOfTwo(int n) {
		if(n <= 0) {
			return false;
		}
		
		return (n & (n-1)) == 0;
	}
}
