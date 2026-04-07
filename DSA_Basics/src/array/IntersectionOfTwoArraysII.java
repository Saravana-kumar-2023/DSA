package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class IntersectionOfTwoArraysII {
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
		int[] res = unionOfTwoSortedArray(arr1,arr2);
		System.out.println("Intersection of array 1 and array 2 : "+Arrays.toString(res));
	}

	private static int[] unionOfTwoSortedArray(int[] nums1, int[] nums2) {
		HashMap<Integer,Integer> map = new HashMap<>();
		ArrayList<Integer> res = new ArrayList<>();
		for(int num : nums1) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		for(int num : nums2) {
			if(map.containsKey(num) && map.get(num) > 0) {
				res.add(num);
				map.put(num, map.get(num) -1);
			}
		}
		int[] ans = new int[res.size()];
		for(int i = 0;i<res.size();i++) {
			ans[i] = res.get(i);
		}
		return ans;
	}
}
