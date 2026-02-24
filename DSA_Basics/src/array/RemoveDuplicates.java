package array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		int res = removeDuplicates(arr);
		System.out.println("Array size after removed duplicates : "+res);
	}

	private static int removeDuplicates(int[] arr) {
		int i = 0;
		for(int j = 0;j<arr.length;j++) {
			if(arr[i] != arr[j]) {
				arr[i+1] = arr[j];
				i++;
			}
		}
		return i+1;
	}
}
