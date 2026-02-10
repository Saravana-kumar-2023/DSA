/*Generating a Pascal’s Triangle
Difficulty: Medium
Topics: Arrays, Mathematical Computations
Description: Write a program to generate Pascal's Triangle up to a given number of rows.
Example:
Input: rows = 4
Output:

1  
1 1  
1 2 1  
1 3 3 1  
Explanation: Pascal's Triangle with 4 rows is generated.
*/
package basic_programs;

import java.util.Scanner;

public class Program31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows to be printed : ");
		int num = sc.nextInt();
		pattern(num);
	}

	private static void pattern(int num) {
		for (int i = 0; i < num; i++) {
            int number = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
		}
	}
}
