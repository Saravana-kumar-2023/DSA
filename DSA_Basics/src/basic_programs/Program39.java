/*Generating a Square Matrix of a Given Size
Difficulty: Medium
Topics: Arrays, Matrix Operations
Description: Write a program to generate a square matrix of a given size and fill it with sequential numbers.
Example:
Input: size = 3
Output:

1 2 3  
4 5 6  
7 8 9  
Explanation: A 3x3 matrix is generated with sequential numbers.*/
package basic_programs;

import java.util.Scanner;

public class Program39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int size = sc.nextInt();
		int count = 1;
		for(int i = 1;i<=size;i++) {
			for(int j = 1;j<=3;j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}
}
