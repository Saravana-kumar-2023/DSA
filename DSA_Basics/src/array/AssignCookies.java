package array;

import java.util.Arrays;
import java.util.Scanner;

public class AssignCookies {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array 1 : ");
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		for(int i = 0;i < n1;i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the size of array 1 : ");
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		for(int i = 0;i < n2;i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println("Array 1 : "+Arrays.toString(arr1));
		System.out.println("Array 2 : "+Arrays.toString(arr2));
		int res = findContentChildren(arr1,arr2);
		System.out.println(res);
	}

	private static int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int i = 0,j = 0;
		int count = 0;
		while(i < g.length && j < s.length) {
			if(s[j] >= g[i]) {
				count = count + 1;
				i++;
				j++;
			}
			else {
				j++;
			}
		}
		return count;
	}
}
