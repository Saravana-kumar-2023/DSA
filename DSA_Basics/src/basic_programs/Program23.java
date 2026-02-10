/*Finding the Fibonacci Number at a Specific Position
Difficulty: Easy
Topics: Basic Programming, Sequences
Description: Write a program to find the Fibonacci number at a specific position.
Example:
Input: position = 5
Output: 5
Explanation: The Fibonacci number at position 5 is 5 (sequence: 0, 1, 1, 2, 3, 5).*/
package basic_programs;
import java.util.Scanner;
public class Program23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the position : ");
		int range = sc.nextInt();
		int n0 = 0,n1 = 1,nextTerm = 0;
		for(int i = 0;i<range;i++) {
			nextTerm = n0+n1;
			n0 = n1;
			n1 = nextTerm;
		}
		System.out.println(n0);
	}
}
