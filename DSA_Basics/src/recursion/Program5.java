package recursion;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the n : ");
		int n = sc.nextInt();
		factOfN(n,1);
		System.out.println("----------");
		System.out.println(factOfN2(n));
	}

	private static int factOfN2(int n) {
		if(n == 1)
			return 1;
		return n * factOfN2(n-1);
	}

	private static void factOfN(int n, int fact) {
		if(n<1) {
			System.out.println(fact);
			return;
		}
		factOfN(n-1,fact*n);
	}
}
