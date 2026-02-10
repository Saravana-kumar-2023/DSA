/*Checking for Armstrong Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find all Armstrong numbers within a given range.
Example:
Input: range = [1, 500]
Output: [1, 153, 370, 371, 407]
Explanation: Armstrong numbers between 1 and 500 are 1, 153, 370, 371, and 407.*/
package basic_programs;

import java.util.Scanner;

public class Program17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start : ");
		int start = sc.nextInt();
		System.out.print("Enter the end : ");
		int end = sc.nextInt();
		System.out.print("[");
		boolean first = true;
		for(int i = start;i<=end;i++) {
			int isArmstrong = findArmstrong(i);
			if(isArmstrong == i) {
				if(!first) {
					System.out.print(", ");
				}
				System.out.print(isArmstrong);
				first = false;
			}
		}
		System.out.println("]");
	}

	private static int findArmstrong(int i) {
		int num = i;
		int length = length(num);
		int sum = 0;
		while(num>0) {
			int rem = num%10;
			sum = (int) (sum + Math.pow(rem, length));
			num /= 10;
		}
		return sum;
	}

	private static int length(int num) {
		int count = 0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}
	
}
