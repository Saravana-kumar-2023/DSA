package array;

import java.util.Arrays;
import java.util.Scanner;

public class MinCostClimbingStairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		int res = minCostClimbingStairs(arr);
		System.out.println(res);
	}

	private static int minCostClimbingStairs(int[] cost) {
		int prev2 = cost[0];
		int prev1 = cost[1];
		for(int i = 2;i<cost.length;i++) {
			int curr = cost[i] + Math.min(prev1, prev2);
			prev2 = prev1;
			prev1 = curr;
		}
		return Math.min(prev2, prev1);
	}
}
