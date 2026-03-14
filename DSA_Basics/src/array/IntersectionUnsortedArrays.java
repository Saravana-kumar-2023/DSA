package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionUnsortedArrays {
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
		int[] res = intersectionOfUnsortedArrays(arr1,arr2);
		System.out.println("Output : "+Arrays.toString(res));
	}

	private static int[] intersectionOfUnsortedArrays(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		ArrayList<Integer> res = new ArrayList<>();
		for(int i = 0;i < nums1.length;i++) {
			set.add(nums1[i]);
		}
		
		for(int i = 0;i < nums2.length;i++) {
			if(set.contains(nums2[i])) {
				res.add(nums2[i]);
				set.remove(nums2[i]);
			}
		}
		int[] result = new int[res.size()];
		int k = 0;
		for(int i : res) {
			result[k++] = i;
		}
		return result;
	}
}
