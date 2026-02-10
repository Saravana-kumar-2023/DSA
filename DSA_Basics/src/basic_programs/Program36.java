/*Finding the N-th Triangular Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the N-th triangular number.
Example:
Input: N = 4
Output: 10
Explanation: The 4th triangular number is 10 (sum of the first 4 natural numbers).*/
package basic_programs;

import java.util.Scanner;

public class Program36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1;i<=num;i++) {
			sum+=i;
		}
		System.out.println("The "+num+"th triangular number is : "+sum);
	}
}
