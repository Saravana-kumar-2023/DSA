/*Finding the Sum of Squares of Digits
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the sum of the squares of the digits of a number.
Example:
Input: number = 123
Output: 14
Explanation: The sum of the squares of digits is 1^2 + 2^2 + 3^2 = 14.*/
package basic_programs;

import java.util.Scanner;

public class Program38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int res = 0;
		while(num>0) {
			int rem = num % 10;
			res = res + (int) (Math.pow(rem, 2));
			num /= 10;
		}
		System.out.println("Sum of square of each digit : "+res);
	}
}
