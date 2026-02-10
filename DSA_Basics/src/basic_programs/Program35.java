/*Finding the Sum of Prime Numbers in a Range
Difficulty: Medium
Topics: Number Theory, Mathematical Computations
Description: Write a program to calculate the sum of all prime numbers within a given range.
Example:
Input: range = [1, 10]
Output: 17
Explanation: The sum of prime numbers between 1 and 10 is 2 + 3 + 5 + 7 = 17.*/
package basic_programs;

import java.util.Scanner;

public class Program35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the range : ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int i = start+1;i<=end;i++) {
			boolean isPrime = isPrime(i);
			if(isPrime) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

	private static boolean isPrime(int num) {
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
