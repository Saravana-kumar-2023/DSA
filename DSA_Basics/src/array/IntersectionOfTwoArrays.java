package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoArrays {
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
		System.out.println("Array1 is : "+Arrays.toString(arr1));
		System.out.println("Array2 is : "+Arrays.toString(arr2));
		ArrayList<Integer> res = unionOfTwoSortedArray(arr1,arr2,n1,n2);
		int k = 0;
		int[] result = new int[res.size()];
		for(int i : res) {
			result[k++] = i;
		}
		System.out.println("Output : "+Arrays.toString(result));
	}
	private static ArrayList<Integer> unionOfTwoSortedArray(int[] arr1, int[] arr2, int n1, int n2) {
		int i = 0,j = 0;
		ArrayList<Integer> res = new ArrayList<>();
		while(i < n1 && j < n2) {
			if(arr1[i] < arr2[j]) {
				i++;
			}
			else if(arr1[i] > arr2[j]) {
				j++;
			}
			else {
				res.add(arr1[i]);
				i++;
				j++;
			}
		}
		return res;
	}
	//BRUTE FORCE APPROACH
	/*private static int[] unionOfTwoSortedArray(int[] arr1, int[] arr2, int n1, int n2) {
		int[] vis = new int[arr2.length-1];
		Arrays.fill(vis, 0);
		ArrayList<Integer> res = new ArrayList<>();
		for(int i = 0;i<arr1.length;i++) {
			for(int j = 0;j<arr2.length;j++) {
				if(arr1[i] == arr2[j] && vis[j] != 1) {
					res.add(arr1[i]);
					vis[j] = 1;
					break;
				}
				if(arr2[j]>arr1[i]) {
					break;
				}
			}
		}
		int[] result = new int[res.size()];
		for(int i = 0;i<result.length;i++) {
			result[i] = res.get(i); 
		}
		return result;
	}*/

}
