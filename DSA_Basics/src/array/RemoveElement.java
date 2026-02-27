package array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the value to remove : ");
		int val =sc.nextInt();
		System.out.println("Arrays is : "+Arrays.toString(arr));
		int res = removeElements(arr,val);
		System.out.println("Output is : "+res);
	}

	private static int removeElements(int[] arr, int val) {
		int k = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] != val) {
				arr[k] = arr[i];
				k++;
			}
		}
		return k;
	}
}
