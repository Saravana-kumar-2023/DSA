package programs;

import java.util.Scanner;

public class ScoreDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0;i<n;i++) {
			nums[i] = sc.nextInt();
		}
		int res = scoreDifference(nums);
		System.out.println("Score Difference : "+res);
	}

	private static int scoreDifference(int[] nums) {
		int p1 = 0,p2 = 0;
		boolean isP1Active = true;
		for(int i = 0;i<nums.length;i++) {
			if(nums[i] % 2 == 1) {
				isP1Active = !isP1Active;
			}
			if((i+1) % 6 == 0) {
				isP1Active = !isP1Active;
			}
			if(isP1Active) {
				p1+=nums[i];
			}
			else {
				p2+=nums[i];
			}
		}
		return p1-p2;
	}
}
