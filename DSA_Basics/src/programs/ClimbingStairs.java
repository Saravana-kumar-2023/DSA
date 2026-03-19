package programs;

import java.util.Scanner;

public class ClimbingStairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int res = climbStairs(num);
		System.out.println("Result : "+res);
	}

	private static int climbStairs(int n) {
		if(n <= 1) {
			return 1;
		}
		int prev1 = 1;
		int prev2 = 1;
		for(int i = 2;i <= n;i++) {
			int curr = prev1 + prev2;
			prev2 = prev1;
			prev1 = curr;
		}
		return prev1;
	}
}
