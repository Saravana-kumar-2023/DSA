package array;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the k : ");
		int k = sc.nextInt();
		System.out.println("Arrays is : "+Arrays.toString(arr));
		leftRotate(arr,k,n);
		System.out.println("Arrays is left rotated : "+Arrays.toString(arr));

	}

	private static void leftRotate(int[] arr,int k,int n) {
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		reverse(arr,0,n-1);
	}

	private static void reverse(int[] arr, int start,int end) {
		while(start<=end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
