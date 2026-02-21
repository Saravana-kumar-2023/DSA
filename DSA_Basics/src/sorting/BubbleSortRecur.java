package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortRecur {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		quickSort(arr,n);
		System.out.println("Array after sorted : "+Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int n) {
		// Base Case: If the array size is 1, it's already sorted
		if(n==1) {
			return;
		}
		int didSwap = 0;
		for (int j = 0; j <= n - 2; j++) {
	        // Swap if elements are in the wrong order
	        if (arr[j] > arr[j + 1]) {
	            int temp = arr[j + 1];
	            arr[j + 1] = arr[j];
	            arr[j] = temp;
	            didSwap = 1;
	        }
	    }
		// If no swap happened, array is already sorted
		if(didSwap == 0) {
			return;
		}
		//Recursion for the remaining unsorted portion
		quickSort(arr,n-1);
	}
}
