package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		//Bubble Sort
		for(int i = n-1;i>=0;i--) {
			int didSwap = 0; // best case of time complexity
			for(int j = 0;j<=i-1;j++) {
				if(arr[j]>arr[j+1]) {
					//Swap
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					didSwap = 1;
				}
			}
			if(didSwap == 0) {
				break;
			}
			//System.out.println("runs");//for checking how many time it runs
		}
		System.out.println("Array after sorted : "+Arrays.toString(arr));
	}
}
