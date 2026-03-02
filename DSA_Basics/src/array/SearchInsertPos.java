package array;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInsertPos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0;i < n;i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("Array elements : "+Arrays.toString(nums));
		System.out.print("Enter the number to search : ");
		int target = sc.nextInt();
		int pos = searchInsertPos(nums,target);
		System.out.println("Position is : "+pos);
	}

	private static int searchInsertPos(int[] nums, int target) {
		if(target > nums[nums.length-1]) {
			return nums.length;
		}
		int low = 0,high = nums.length-1;
		while(low<=high) {
			int mid = low + (high - low)/2;
			if(nums[mid] == target) {
				return mid;
			}
			else if(nums[mid] < target) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return low;
	}
}
