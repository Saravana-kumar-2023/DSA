package programs;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		boolean res = isHappy(n);
		System.out.println(res);
	}

	private static boolean isHappy(int n) {
		int res = 0;
		while(true) {
			while(n>0) {
				int rem = n % 10;
				res += Math.pow(rem, 2);
				n/=10;
			}
			if(res == 1) {
				return true;
			}
			else {
				if(res == 4) {
					return false;
				}
				else {
					n = res;
					res = 0;
				}
			}
		}
	}
}
