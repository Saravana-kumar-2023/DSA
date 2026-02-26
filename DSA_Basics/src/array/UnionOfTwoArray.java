package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UnionOfTwoArray {
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
		unionOfTwoSortedArray(arr1,arr2,n1,n2);
	}

	private static void unionOfTwoSortedArray(int[] arr1, int[] arr2, int n1, int n2) {
		List<Integer> al = new ArrayList<>();
		int i = 0,j = 0;
		while(i < n1 && j < n2) {
			if(arr1[i] == arr2[j]) {
				if(al.isEmpty() || al.get(al.size() - 1) != arr1[i]) {
					al.add(arr1[i]);
				}
				i++;
				j++;
			}
			else if (arr1[i] < arr2[j]) {
	            if (al.isEmpty() || al.get(al.size() - 1) != arr1[i]) {
	                al.add(arr1[i]);
	            }
	            i++;
			}
			else {
				if(al.isEmpty()|| al.get(al.size() - 1) != arr2[j]) {
					al.add(arr2[j]);
				}
				j++;
				
			}
		}
		while(j < n2) {
			if(al.isEmpty() || al.get(al.size() - 1) != arr2[j]) {
				al.add(arr2[j]);
			}
			j++;
		}
		while(i < n1) {
			if(al.isEmpty() || al.get(al.size() - 1) != arr1[i]) {
				al.add(arr1[i]);
			}
			i++;
		}
		System.out.println("Union is : "+al);
	}
	
	//BRUTE FORCE APPROACH
	/*
	private static void unionOfTwoSortedArray(int[] arr1, int[] arr2, int n1, int n2) {
		Set<Integer> st = new HashSet<>();
		for(int i : arr1) {
			if(st.contains(i)) {
				continue;
			}
			st.add(i);
		}
		for(int j : arr2) {
			if(st.contains(j)) {
				continue;
			}
			st.add(j);
		}
		int[] res = new int[st.size()];
		int i = 0;
		for(int k : st) {
			res[i++] = k;
		}
		System.out.println("Union is : "+Arrays.toString(res));
	}*/
}
