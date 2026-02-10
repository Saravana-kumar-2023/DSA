/*Crafting Star Patterns
Difficulty: Easy
Topics: Basic Programming, Patterns
Description: Write a program to create different star patterns.
Example:
Input: height = 5
Output:
    *
   ***
  *****
 *******
*********        */
package basic_programs;

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		pattern(num);
	}

	public static void pattern(int num) {
		for(int i = 0;i<num;i++) {
			//space
			for(int j = num-1;j>i;j--) {
				System.out.print(" ");
			}
			//stars
			for(int k = 1;k<=1+(i*2);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
