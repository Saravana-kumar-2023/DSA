package array;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumberAtLeastTwice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		int res = dominantIndex(arr);
		System.out.println(res);
	}

	private static int dominantIndex(int[] nums) {
		if(nums.length == 1) {
			return 0;
		}
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int index = -1;
		for(int i = 0;i < nums.length;i++) {
			if(nums[i] > largest) {
				secondLargest = largest;
				largest = nums[i];
				index = i;
			}
			else if(nums[i] > secondLargest) {
				secondLargest = nums[i];
			}
		}
		if(largest >= 2 * secondLargest) {
			return index;
		}
		else {
			return -1;
		}
	}
}
