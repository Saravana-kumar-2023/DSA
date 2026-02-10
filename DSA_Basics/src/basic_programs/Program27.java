/*Generating a Pattern of Numbers
Difficulty: Easy
Topics: Basic Programming, Patterns
Description: Write a program to generate number patterns (e.g., sequential numbers in a matrix).
Example:
Input: rows = 3
Output:
1  
2 3  
4 5 6  
Explanation: A number pattern with 3 rows is generated. */

package basic_programs;

import java.util.Scanner;

public class Program27 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("rows : ");
		int rows = sc.nextInt();
		int count = 1;
		for(int i = 1;i<=rows;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
}
