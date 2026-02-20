package programs;

import java.util.Arrays;
import java.util.Scanner;

public class CommonPrefix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the array length : ");
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.next();
		}
		System.out.println("Array : "+Arrays.toString(arr));
		String res = longestCommonPrefix(arr);
		System.out.println(res);
	}

	private static String longestCommonPrefix(String[] strs) {
		if(strs.length == 0) {
			return "";
		}
		String first = strs[0];
		for(int i = 0;i<first.length();i++) {
			for(String str : strs) {
				if(i>=str.length() || str.charAt(i) != first.charAt(i)) {
					return first.substring(0, i);
				}
			}
		}
		return first;
	}
}
