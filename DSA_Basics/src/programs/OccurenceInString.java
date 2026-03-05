package programs;

import java.util.Scanner;

public class OccurenceInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String haystack = sc.next();
		System.out.println("Enter the second string : ");
		String needle = sc.next();
		int res = strStr(haystack,needle);
		System.out.println(res);
	}

	private static int strStr(String haystack, String needle) {
		int i = 0;
		for(int j = 0;j<haystack.length();j++) {
			System.out.println(i+" "+j);
			if(haystack.charAt(j) == needle.charAt(i)) {
				if(i == needle.length()-1) {
					return j-i;
				}
				i++;
			}
			else {
				i = 0;
			}
		}
		return -1;
	}
}
