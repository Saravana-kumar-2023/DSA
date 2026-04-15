package array;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestDistToChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		System.out.println("Enter the char : ");
		char c = sc.next().charAt(0);
		int [] res= shortestToChar(s,c);
		System.out.println(Arrays.toString(res));
	}

	private static int[] shortestToChar(String s, char c) {
		int n = s.length();
		int [] res = new int[n];
		int prev = -n;
		for(int i = 0;i < n;i++) {
			if(s.charAt(i) == c) {
				prev = i;
			}
			res[i] = i - prev;
		}
		prev = 2 * n;
		for(int i = n-1;i >= 0;i--) {
			if(s.charAt(i) == c) {
				prev = i;
			}
			res[i] = Math.min(res[i], prev - i);
		}
		return res;
	}
}
