/*Validating Leap Years
Difficulty: Easy
Topics: Basic Programming, Date Handling
Description: Write a program to check if a given year is a leap year.
Example:
Input: year = 2020
Output: Leap Year
Explanation: 2020 is divisible by 4 but not by 100, or it is divisible by 400, so it is a leap year.*/
package basic_programs;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		boolean isLeapYear = isLeapYear(num);
		if(isLeapYear) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a Leap year");
		}
	}

	public static boolean isLeapYear(int num) {
		if(num%4==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
