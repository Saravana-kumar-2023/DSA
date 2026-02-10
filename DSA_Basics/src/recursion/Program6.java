package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		/*
		 * int [] arr2 = arr; 
		 * reverseAnArray(arr,0,n-1);
		 * System.out.println("After reversed : "+Arrays.toString(arr));
		 */
		reverseAnArray2(arr,0);
		System.out.println("------------------------------------");
		System.out.println("After reversed : "+Arrays.toString(arr));
	}
	
	//Method 2
	private static void reverseAnArray2(int[] arr2, int i) {
		int n = arr2.length;
		if(i>n/2) {
			return;
		}
		int temp = arr2[i];
	    arr2[i] = arr2[n-i-1];
	    arr2[n-i-1] = temp;
	    reverseAnArray2(arr2,i+1);
	}


	//Method 1
	private static void reverseAnArray(int[] arr,int l, int r) {
		if(l>=r) {
			return;
		}
		int temp = arr[l];
	    arr[l] = arr[r];
	    arr[r] = temp;
		reverseAnArray(arr,l+1,r-1);
	}
}
