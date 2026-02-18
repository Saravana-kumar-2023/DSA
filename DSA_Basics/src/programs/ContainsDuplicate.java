package programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array : "+Arrays.toString(arr));
		boolean res = containsDuplicate(arr);
		System.out.println(res);
	}

	private static boolean containsDuplicate(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for(int i : arr) {
			if(set.contains(i)) {
				return true;
			}
			set.add(i);
		}
		return false;
	}
}
