package array;

import java.util.Arrays;
import java.util.Scanner;

public class FindPivotIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		int res = pivotIndex(arr);
		System.out.println(res);
	}

	private static int pivotIndex(int[] nums) {
		int totalSum = 0;
		for(int i : nums) {
			totalSum += i;
		}
		int leftSum = 0;
		for(int i = 0;i<nums.length;i++) {
			int rightSum = totalSum - leftSum - nums[i];
			if(leftSum == rightSum) {
				return i;
			}
			leftSum += nums[i];
		}
		return -1;
	}
}
