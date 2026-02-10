/*Calculating Armstrong Numbers
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to check if a number is an Armstrong number.
Example:
Input: number = 153
Output: Armstrong Number
Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.*/
package basic_programs;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		boolean isArmstrong = isArmstrong(num);
		if(isArmstrong) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not a Armstrong Number");
		}
	}

	public static boolean isArmstrong(int num) {
		int len = length(num);
		int copy = num;
		int res = 0;
		while(num>0) {
			int rem = num % 10;
			res = (int) Math.pow(rem, len)+res;
			num/=10;
		}
		if(copy==res) {
			return true;
		}
		else {
			return false;
		}
	}

	public static int length(int num) {
		int len = 0;
		while(num>0) {
			len++;
			num/=10;
		}
		return len;
	}
}
