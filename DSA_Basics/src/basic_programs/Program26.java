/*Checking if a Number is a Narcissistic Number
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to check if a number is a narcissistic number (where the sum of its digits raised to the power of the number of digits equals the number itself).
Example:
Input: number = 153
Output: Narcissistic Number
Explanation: 153 is a narcissistic number because 1^3 + 5^3 + 3^3 = 153.*/
package basic_programs;

import java.util.Scanner;

public class Program26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int len = length(num);
		int Original_num = num;
		int sum = 0;
		while(num>0) {
			int rem = num % 10;
			sum = (int) (sum + Math.pow(rem, len));
			num/=10;
		}
		if(Original_num == sum) {
			System.out.println("Narcissistic Number");
		}
		else {
			System.out.println("Not a Narcissistic Number");
		}
		sc.close();
	}

	private static int length(int num) {
		int count = 0;
		while(num>0) {
			num/=10;
			count++;
		}
		return count;
	}
}
