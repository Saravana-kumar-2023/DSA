/*Generating the Fibonacci Series
Difficulty: Easy
Topics: Basic Programming, Sequences
Description: Write a program to generate the Fibonacci series up to a given number.
Example:
Input: limit = 10
Output: [0, 1, 1, 2, 3, 5, 8]
Explanation: The Fibonacci series up to 10 is generated as [0, 1, 1, 2, 3, 5, 8].*/
package basic_programs;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range : ");
		int range = sc.nextInt();
		fibonacci(range);
	}

	public static void fibonacci(int range) {
		int t1 = 0,t2=1,nextTerm = 0;
		while(t1<10) {
			System.out.print(t1+" ");
			nextTerm = t1+t2;
			t1 = t2;
			t2 = nextTerm;
		}
	}
}
