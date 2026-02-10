/*Checking for Perfect Squares
Difficulty: Easy
Topics: Mathematical Computations
Description: Write a program to determine if a number is a perfect square.
Example:
Input: number = 16
Output: True
Explanation: 16 is a perfect square (4^2 = 16).*/
package basic_programs;

import java.util.Scanner;

public class Program37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		boolean root = isPerfectsquare(num);
		if(root) {
			System.out.println("Perfect square");
		}
		else {
			System.out.println("Not a perfect square");
		}
	}

	private static boolean isPerfectsquare(int num) {
		int odd = 1;
		while(num>0) {
			num -= odd;
			odd+=2;
		}
		return num == 0;
	}
	
}
