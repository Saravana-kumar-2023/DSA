//left rotate the array by one place
package array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		leftRotate(arr);
		System.out.println("Arrays is : "+Arrays.toString(arr));
	}

	private static void leftRotate(int[] arr) {
		int temp = arr[0];
		int n = arr.length;
		for(int i = 1;i<n;i++) {
			arr[i-1] = arr[i];
		}
		arr[n-1] = temp;
	}
}
