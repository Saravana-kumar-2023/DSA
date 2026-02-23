package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortedAndRotated {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		boolean res = check(arr);
		System.out.println("Is Array is sorted : "+res);
	}

	private static boolean check(int[] nums) {
		int n = nums.length;
		int drops = 0;
		for(int i = 0;i<n;i++) {
			if(nums[i] > nums[(i+1) % n]) {
				drops++;
			}
			if(drops > 1) {
				return false;
			}
		}
		return true;
	}

	/*private static boolean check(int[] nums) {
		int n = nums.length;
        int min = nums[0];
        int ind = 0;
        for(int i = 1;i<n;i++){
            if(nums[i] < min){
                min = nums[i];
                ind = i;
            }
        }
        System.out.println(ind);
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) {
        	arr[i] = nums[(i + ind) % n];
        }
        System.out.println("Array after re-rotated : "+Arrays.toString(arr));
		for(int i = 1;i<arr.length;i++) {
			if(arr[i] < arr[i-1]) {
				return false;
			}
		}
		return true;
	}*/
	
}
