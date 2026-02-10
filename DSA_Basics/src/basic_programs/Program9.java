/*Summing Digits of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to calculate the sum of digits of a number.
Example:
Input: number = 1234
Output: 10
Explanation: The sum of the digits 1 + 2 + 3 + 4 = 10.*/
package basic_programs;

import java.util.Scanner;

public class Program9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int sumOfDigits = sumOfDigits(num);
		System.out.println(sumOfDigits);
	}

	public static int sumOfDigits(int num) {
		int sum = 0;
		while(num>0) {
			int rem = num %10;
			sum+=rem;
			num/=10;
		}
		return sum;
	}
}
