package array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements : "+Arrays.toString(arr));
		int smallest = arr[0],secSmallest = Integer.MAX_VALUE;
		for(int i = 0;i<n;i++) {
			if(arr[i] < smallest) {
				secSmallest = smallest;
				smallest = arr[i];
			}
			if(arr[i] > smallest && arr[i] < secSmallest) {
				secSmallest = arr[i];
			}
		}
		System.out.println("Second largest : "+secSmallest);
	}
}
