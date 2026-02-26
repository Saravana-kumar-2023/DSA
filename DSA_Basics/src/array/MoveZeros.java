//Move zeros to the end
package array;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		moveZeros(arr,n);
	}

	private static void moveZeros(int[] arr, int n) {
		int j = 0;
		for(int i = 0;i<n;i++) {
			if(arr[i] != 0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	/* BRUTE FORCE APPROACH
	private static void moveZeros(int[] arr, int n) {
		int[] arr2 = new int[n];
		int j = 0;
		for(int i = 0;i<n;i++) {
			if(arr[i] != 0) {
				arr2[j] = arr[i];
				j++;
			}
		}
		for(int i = j;i<n;i++) {
			arr2[i] = 0;
		}
		System.out.println("Array after moves all the zeros end : "+Arrays.toString(arr2));
	}
	*/
	
}
