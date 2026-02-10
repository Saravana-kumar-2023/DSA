/*Finding the Number of Digits in a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to count the number of digits in a given number.
Example:
Input: number = 12345
Output: 5
Explanation: The number 12345 has 5 digits.*/
package basic_programs;

import java.util.Scanner;

public class Program25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int count = 0;
		while(num>0) {
			num/=10;
			count++;
		}
		System.out.println("No. Of Digits : "+count);
	}
}
