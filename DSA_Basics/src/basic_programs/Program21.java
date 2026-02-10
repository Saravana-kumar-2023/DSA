/*Calculating the Sum of Even Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the sum of all even numbers within a given range.
Example:
Input: range = [1, 10]
Output: 30
Explanation: The sum of even numbers between 1 and 10 is 2 + 4 + 6 + 8 + 10 = 30.*/
package basic_programs;

import java.util.Scanner;

public class Program21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start : ");
		int start = sc.nextInt();
		System.out.print("Enter the end : ");
		int end = sc.nextInt();
		int sum = 0;
		for(int i = start;i<=end;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("Sum of even numbers : "+sum);
	}
}
