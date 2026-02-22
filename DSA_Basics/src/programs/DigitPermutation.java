//Digitorial permutation
package programs;

import java.util.Arrays;
import java.util.Scanner;

public class DigitPermutation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		boolean res = isDigitorial(n);
		System.out.println("Is Digitorial permutation : "+res);
	}

	private static boolean isDigitorial(int n) {
		int originalNum = n;
		int res = 0;
		int[] fact = new int[10];
		fact [0] = 1;
		for(int i = 1;i<=9;i++) {
			fact[i] = fact[i-1] * i;
		}
		while(n>0) {
			int rem = n % 10;
			res += fact[rem];
			n/=10;
		}
		String s1 = String.valueOf(originalNum);
		String s2 = String.valueOf(res);
		
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		return Arrays.equals(a1, a2);
	}

	/*private static int fact(int n) {
		if(n == 1||n == 0) {
			return 1;
		}
		return n * fact(n-1);
	}*/
}
