/*Identifying Palindromes
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to check if a string or number is a palindrome.
Example:
Input: string = "radar"
Output: Palindrome
Explanation: "radar" reads the same backward as forward.*/
package basic_programs;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.next();
		boolean isPalindrome = isPalindrome(str);
		if(isPalindrome) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

	public static boolean isPalindrome(String str) {
		String copy = str;
		char[] arr = str.toCharArray();
		int p1 = 0;
		int p2 = arr.length-1;
		char temp;
		while(p1<p2) {
			temp = arr[p1];
			arr[p1] = arr[p2];
			arr[p2] = temp;
			p1++;
			p2--;
		}
		str = new String(arr);
		if(str.equals(copy)) {
			return true;
		}
		else {
			return false;
		}
	}
}
