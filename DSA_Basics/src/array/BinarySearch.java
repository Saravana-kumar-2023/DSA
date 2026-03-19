package array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		System.out.print("Target is : ");
		int target = sc.nextInt();
		int res  = search(arr,target);
		System.out.println("The element is in : "+res);
	}

	private static int search(int[] nums,int target) {
		int n = nums.length;
		int low = 0;
		int high = n-1;
		while(low <= high) {
			int mid = (low+high)/2;
			if(nums[mid] == target) {
				return mid;
			}
			else if(nums[mid] < target) {
				low = mid + 1;
			}
			else {
				high = mid -1;
			}
		}
		return n;
	}
}
