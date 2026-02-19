package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContainsDuplicateII {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array : "+Arrays.toString(arr));
		System.out.println("Enter the k : ");
		int k = sc.nextInt();
		boolean res = containsDuplicateII(arr,k);
		System.out.println(res);
	}

	private static boolean containsDuplicateII(int[] arr,int k) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<arr.length;i++) {
			if(map.containsKey(arr[i]) && i - map.get(arr[i]) <=k) {
				return true;
			}
			map.put(arr[i], i);
		}
		return false;
	}
}
