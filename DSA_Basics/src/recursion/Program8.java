package recursion;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the N : ");
		int n = sc.nextInt();
		int res = fibonacci(n);
		System.out.println("Fibonacci series : "+res);
	}

	private static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
