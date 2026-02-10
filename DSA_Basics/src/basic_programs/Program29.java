/*Finding the Largest Palindrome in a String
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to find the largest palindrome in a given string.
Example:
Input: string = "babad"
Output: "bab" or "aba"
Explanation: Both "bab" and "aba" are valid palindromes in the string.*/
package basic_programs;

import java.util.Scanner;

public class Program29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String input = sc.nextLine();
		String res = largestPalindrome(input);
		System.out.println(res);
	}

	private static String largestPalindrome(String s) {
		String largest = "";
		for(int i = 0;i< s.length();i++) {
			for(int j = i+1;j<=s.length();j++) {
				String sub = s.substring(i,j);
				if(isPalindrome(sub) && sub.length() > largest.length()) {
					largest = sub;
				}
			}
		}
		return largest;
	}

	private static boolean isPalindrome(String str) {
		int left = 0,right = str.length()-1;
		while(left<right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
