package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIsSorted {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		boolean res = isArraySorted(arr);
		System.out.println("Is Array is sorted : "+res);
	}

	private static boolean isArraySorted(int[] arr) {
		for(int i = 1;i<arr.length;i++) {
			if(arr[i] >= arr[i-1]) {
				
			}
			else {
				return false;
			}
		}
		return true;
	}
}
