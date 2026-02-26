package array;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the number to search : ");
		int num = sc.nextInt();
		System.out.println("Arrays is : "+Arrays.toString(arr));
		int res = linearSearch(arr,n,num);
		if(res == -1) {
			System.out.println("Not Found");
		}
		else {
			System.out.println("Found in : "+res);
		}
		sc.close();
	}

	private static int linearSearch(int[] arr, int n, int num) {
		for(int i = 0;i<n;i++) {
			if(arr[i] == num) {
				return i;
			}
		}
		return -1;
	}
}
