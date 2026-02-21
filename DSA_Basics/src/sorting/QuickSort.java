package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		QuickSortArray(arr,n);
		System.out.println("Array after sorted : "+Arrays.toString(arr));
		sc.close();
	}

	private static void QuickSortArray(int[] arr, int n) {
		qs(arr,0,n-1);
	}

	private static void qs(int[] arr, int low, int high) {
		if(low<high) {
			int partition = findPivot(arr,low,high);
			qs(arr,low,partition-1);
			qs(arr,partition+1,high);
		}
	}

	private static int findPivot(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low,j = high;
		while(i<j) {
			while(arr[i] <= pivot && i <= high-1) {
				i++;
			}
			while(arr[j] >= pivot && j >= low+1) {
				j--;
			}
			if(i<j) {
				swap(arr, i, j);
			}
		}
		swap(arr, low, j);
		return j;
	}

	private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

	
}
