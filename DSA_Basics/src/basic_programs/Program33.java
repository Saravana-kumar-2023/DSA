/*Calculating the Power of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to calculate the power of a number.
Example:
Input: base = 2, exponent = 3
Output: 8
Explanation: 2 raised to the power of 3 is 8.*/
package basic_programs;

import java.util.Scanner;

public class Program33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base : ");
		int base = sc.nextInt();
		System.out.print("Enter the exponent : ");
		int exponent = sc.nextInt();
		int res = power(base,exponent);
		System.out.println("Output : "+res);
	}

	private static int power(int base, int exp) {
		int num = 1;
		for(int i = 1;i<=exp;i++) {
			num = num * base;
		}
		return num;
	}
}
