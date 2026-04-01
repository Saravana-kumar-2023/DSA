package array;

import java.util.Arrays;
import java.util.Scanner;

public class FindFirstAndLastElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		System.out.print("Enter the target : ");
		int target = sc.nextInt();
		int[] res = searchRange(arr,target);
		System.out.println(Arrays.toString(res));
	}

	private static int[] searchRange(int[] nums, int target) {
		int first = findFirst(nums,target);
		int last = findLast(nums,target);
		return new int[] {first,last};
	}

	private static int findLast(int[] nums, int target) {
		int left = 0;
		int right = nums.length-1;
		int ans = -1;
		while(left<=right) {
			int mid = (left+right) / 2;
			
			if(nums[mid] == target) {
				ans = mid;
				left = mid + 1;
			}
			else if(nums[mid] < target) {
				left = mid+1;
			}
			else {
				right = mid - 1;
			}
		}
		return ans;
	}

	private static int findFirst(int[] nums, int target) {
		int left = 0;
		int right = nums.length-1;
		int ans = -1;
		while(left<=right) {
			int mid = (left+right) / 2;
			
			if(nums[mid] == target) {
				ans = mid;
				right = mid - 1;
			}
			else if(nums[mid] < target) {
				left = mid+1;
			}
			else {
				right = mid - 1;
			}
		}
		return ans;
	}
}
