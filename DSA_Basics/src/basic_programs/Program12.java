/*Counting Vowels and Consonants in a String
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to count vowels and consonants in a given string.
Example:
Input: string = "hello world"
Output: Vowels: 3, Consonants: 7
Explanation: "hello world" contains 3 vowels (e, o, o) and 7 consonants (h, l, l, w, r, l, d).*/
package basic_programs;

import java.util.Scanner;

public class Program12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		int vowels = 0,consonants = 0;
		char [] ch = str.toCharArray();
		for(char i : ch) {
			if(i == 'A'||i == 'E'||i == 'I'||i == 'O'||i == 'U'||i == 'a'||i == 'e'||i == 'i'||i == 'o'||i == 'u') {
				vowels++;
			}
			else {
				if(i >='a'&& i<='z' || i>='A'&& i<='Z') {
					consonants++;
				}
			}
		}
		System.out.println("Vowels : "+vowels+"  "+"Consonants : "+consonants);
	}
}
