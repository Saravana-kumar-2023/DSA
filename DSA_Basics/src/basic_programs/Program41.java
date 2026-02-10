/*Finding the Count of Specific Digits in a Number
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to count the occurrences of a specific digit in a number.
Example:
Input: number = 122333, digit = 3
Output: 3
Explanation: The digit 3 occurs 3 times in the number 122333.*/
package basic_programs;

import java.util.Scanner;

public class Program41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.print("Enter the digit : ");
		int digit = sc.nextInt();
		int originalNum = num;
		int count = 0;
		while(num > 0) {
			int rem = num % 10;
			if(rem == digit) {
				count++;
			}
			num/=10;
		}
		System.out.println("The digit "+digit+" occurs "+count+" times in the number "+originalNum+".");
	}
}
