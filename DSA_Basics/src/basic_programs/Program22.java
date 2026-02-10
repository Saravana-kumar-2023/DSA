/*Calculating the Sum of Odd Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the sum of all odd numbers within a given range.
Example:
Input: range = [1, 10]
Output: 25
Explanation: The sum of odd numbers between 1 and 10 is 1 + 3 + 5 + 7 + 9 = 25.*/
package basic_programs;

import java.util.Scanner;

public class Program22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start : ");
		int start = sc.nextInt();
		System.out.print("Enter the end : ");
		int end = sc.nextInt();
		int sum = 0;
		for(int i = start;i<=end;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println("Sum of odd numbers : "+sum);
	}
}
