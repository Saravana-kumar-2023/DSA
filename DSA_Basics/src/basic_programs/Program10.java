/*Finding the Greatest Common Divisor (GCD)
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find the GCD of two numbers.
Example:
Input: a = 48, b = 18
Output: 6
Explanation: The GCD of 48 and 18 is 6.*/
package basic_programs;

import java.util.Scanner;

public class Program10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter a num2 : ");
		int num2 = sc.nextInt();
		int gcd = findGCD(num1,num2);
		System.out.println(gcd);
	}

	public static int findGCD(int num1, int num2) {
		while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
	}
}
