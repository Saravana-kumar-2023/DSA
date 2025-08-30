/*Checking for Prime Numbers
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to determine if a number is prime.
Example:
Input: number = 7
Output: Prime
Explanation: 7 has no divisors other than 1 and itself, so it is a prime number.*/
package basic_programs;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		boolean isPrime = isPrime(num);
		if(isPrime) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not a Prime");
		}
	}

	public static boolean isPrime(int num) {
		int count = 0;
		for(int i = 1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count == 2) {
			return true;
		}
		else {
			return false;
		}
	}
}
