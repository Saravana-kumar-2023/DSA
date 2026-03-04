package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array of : "+Arrays.toString(arr));
		System.out.println("Target : ");
		int target = sc.nextInt();
		int[] res = twoSum(arr,target);
		System.out.println("Output : "+Arrays.toString(res));
	}

	private static int[] twoSum(int[] arr, int target) {
		int left = 0,right = arr.length-1;
		Arrays.sort(arr);
		while(left<right) {
			int val = arr[left] + arr[right];
			System.out.println(arr[left] + " " +arr[right]);
			if(val > target) {
				right--;
			}
			if(val < target) {
				left++;
			}
			if(val == target) {
				return new int[] {left,right};
			}
		}
		return new int[] {};
	}
	//Better approach
	/*private static int[] twoSum(int[] arr, int target) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<arr.length;i++) {
			int val = target-arr[i];
			if(map.containsKey(val)) {
				return new int[] {map.get(val),i};
			}
			map.put(arr[i], i);
		}
		return new int[] {};
	}*/
}
