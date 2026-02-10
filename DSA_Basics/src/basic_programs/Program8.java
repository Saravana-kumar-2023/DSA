/*Finding the Factorial of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to compute the factorial of a given number.
Example:
Input: number = 5
Output: 120
Explanation: 5! (factorial) is 5 × 4 × 3 × 2 × 1 = 120.*/
package basic_programs;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int fact = factorial(num);
		System.out.println(fact);
	}

	public static int factorial(int num) {
		int fact = 1;
		for(int i = 1;i<=num;i++) {
			fact = fact*i;
		}
		return fact;
	}
}
