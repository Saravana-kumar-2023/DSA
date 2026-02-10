/*Printing Prime Numbers Less Than a Given Number
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to print all prime numbers less than a given number.
Example:
Input: number = 20
Output: 2, 3, 5, 7, 11, 13, 17, 19
Explanation: The prime numbers less than 20 are 2, 3, 5, 7, 11, 13, 17, and 19.*/
package basic_programs;

import java.util.Scanner;

public class Program24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range : ");
		int range = sc.nextInt();
		boolean first = true;
		for(int i = 2;i<=range;i++) {
			boolean isPrime = isPrime(i);
			if(isPrime) {
				if(!first) {
					System.out.print(",");
				}
				System.out.print(i);
				first = false;
			}
		}
	}

	private static boolean isPrime(int num) {
		int count = 0;
		for(int i = 1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count == 2){
			return true;
		}
		else {
			return false;
		}
	}
}
