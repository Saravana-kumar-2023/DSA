/*Finding Prime Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find all prime numbers within a given range.
Example:
Input: range = [10, 30]
Output: [11, 13, 17, 19, 23, 29]
Explanation: Prime numbers between 10 and 30 are 11, 13, 17, 19, 23, and 29.*/
package basic_programs;

import java.util.Scanner;

public class Program19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start : ");
		int start = sc.nextInt();
		System.out.print("Enter the end : ");
		int end = sc.nextInt();
		boolean first = true;
		System.out.print("[");
		for(int i = start;i<=end;i++) {
			boolean isPrime = isPrime(i);
			if(isPrime) {
				if(!first) {
					System.out.print(",");
				}
				System.out.print(i);
				first = false;
			}
		}
		System.out.print("]");
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
