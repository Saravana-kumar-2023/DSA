package recursion;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n : ");
		int n = sc.nextInt();
		sumOfN(n,0); // Parameterized way
		System.out.println("--------------");
		System.out.println(sumOfN2(n)); //Functional way
	}

	private static int sumOfN2(int n) {
		if(n == 0) {
			return 0;
		}
		return n + sumOfN2(n-1);
	}

	private static void sumOfN(int n, int sum) {
		if(n<0) {
			System.out.println(sum);
			return;
		}
		sumOfN(n-1,sum+n);
	}
}
