package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		//Selection Sort
		for(int i = 0;i<=n-2;i++) {
			int min = i;
			for(int j = i;j<=n-1;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min]=arr[i];
			arr[i] = temp;
		}
		System.out.println("Array after sorted : "+Arrays.toString(arr));
	}
}
