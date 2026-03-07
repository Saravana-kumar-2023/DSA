package programs;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array1: ");
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		for(int i = 0;i < n1;i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.print("Enter the size of array2: ");
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		for(int i = 0;i < n2;i++) {
			arr2[i] = sc.nextInt();
		}
		merge(arr1,arr2,n1,n2);
		System.out.println("Array1 : " + Arrays.toString(arr1));

	}

	private static void merge(int[] nums1, int[] nums2, int m, int n) {
		int i = m-1;
		int j = n-1;
		int k = m+n-1;
		while(j >= 0) {
			if(i >= 0 && nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				i--;
			}
			else {
				nums1[k] = nums2[j];
				j--;
			}
			k--;
		}
	}
}
