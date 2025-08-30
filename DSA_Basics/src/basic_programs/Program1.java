/*Determining Even/Odd Numbers
Difficulty: Easy
Topics: Basic Programming
Description: Write a program to check whether a number is even or odd.
Example:
Input: number = 4
Output: Even
Explanation: Since 4 is divisible by 2, it is an even number.*/
package basic_programs;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		boolean isEvenOrOdd = isEvenOrOdd(num);
		if(isEvenOrOdd) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}

	public static boolean isEvenOrOdd(int num) {
		if(num%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
