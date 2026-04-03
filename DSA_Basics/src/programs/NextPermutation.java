package programs;

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		nextPermutation(arr);
		System.out.println("Next Permutation : "+Arrays.toString(arr));
	}

	private static void nextPermutation(int[] nums) {
		int n = nums.length;
		int i = n - 2;
		while(i >= 0 && nums[i] >= nums[i+1]) {
			i = i - 1;
		}
		if(i >= 0) {
			int j = n - 1;
			while(nums[j] <= nums[i]) {
				j = j - 1;
			}
			swap(nums,i,j);
		}
		reverse(nums,i+1,n-1);
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	private static void reverse(int[] nums, int left, int right) {
		while(left<right) {
			swap(nums,left,right);
			left++;
			right--;
		}
	}
}
