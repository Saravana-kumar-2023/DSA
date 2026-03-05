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
		if (needle.length() == 0) {
			return 0;
		}
	    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
	        int j = 0;
	        while (j < needle.length() && 
	               haystack.charAt(i + j) == needle.charAt(j)) {
	            j++;
	        }
	        if (j == needle.length()) {
	            return i;
	        }
	    }
	    return -1;
	}
}
