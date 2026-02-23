package array;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements : "+Arrays.toString(arr));
		int largest = arr[0];
		for(int i = 0;i<n;i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("Largest element : "+largest);
	}
}
