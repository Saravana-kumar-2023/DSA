/*Finding the Sum of the Digits of the Factorial of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the sum of the digits of the factorial of a given number.
Example:
Input: number = 4
Output: 9
Explanation: The factorial of 4 is 24, and the sum of the digits (2 + 4) is 6.*/
package basic_programs;

import java.util.Scanner;

public class Program28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int fact = 1,sum = 0;
		for(int i = 1;i<=num;i++) {
			fact = fact * i;
		}
		while(fact>0) {
			int rem = fact % 10;
			sum+=rem;
			fact/=10;
		}
		System.out.println(sum);
	}
}
