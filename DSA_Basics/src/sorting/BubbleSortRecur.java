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
		System.out.println("Array after sorted : "+Arrays.toString(arr));
	}
}
