package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortRecur {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		insertionSort(arr,0,n);
		System.out.println("Array after sorted : "+Arrays.toString(arr));
	}

	private static void insertionSort(int[] arr,int i, int n) {
		// Base case
        if (i == n) return;

        int j = i;
        // Move the current element back until it's in the correct place
        while (j > 0 && arr[j - 1] > arr[j]) {
            // Swap arr[j] and arr[j-1]
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        // Recursion for the next index
        insertionSort(arr, i + 1, n);
	}
}
