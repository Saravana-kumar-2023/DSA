package programs;

import java.util.Scanner;

public class PalindromeSubstring {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the string :");
		String s = sc.next();
		String res = longestPalindrome(s);
		System.out.println(res);
	}

	private static String longestPalindrome(String s) {
		if(s == null||s.length() < 1) {
			return "";
		}
		int start = 0;
		int end = 0;
		for(int i = 0;i<s.length();i++) {
			int len1 = expand(s,i,i);
			int len2 = expand(s,i,i+1);
			
			int maxLen = Math.max(len1, len2);
			if(maxLen > (end-start)) {
				start = i - (maxLen - 1) / 2;
			    end   = i + maxLen / 2;
			}
		}
		return s.substring(start, end+1);
	}

	private static int expand(String s, int left, int right) {
		while(left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)) {
			left--;
			right++;
		}
		return right - left - 1;
	}
}
