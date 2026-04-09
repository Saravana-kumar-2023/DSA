package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPartition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		int res = arrayPairSum(arr);
		System.out.println(res);
	}

	private static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for(int i = 0;i<nums.length;i+=2) {
			sum += nums[i];
		}
		return sum;
	}
}
