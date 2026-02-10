/*Checking for an Anagram
Difficulty: Easy
Topics: String Manipulation
Description: Write a program to check if two strings are anagrams.
Example:
Input: string1 = "listen", string2 = "silent"
Output: True
Explanation: "listen" and "silent" are anagrams of each other.*/
package basic_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Program34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string1 : ");
		String str1 = sc.nextLine();
		System.out.print("Enter the string2 : ");
		String str2 = sc.nextLine();
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		str1 = new String(ch1);
		str2 = new String(ch2);
		if(str1.contains(str2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not a Anagram");
		}
		
	}
}
