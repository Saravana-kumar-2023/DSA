/*Finding the Least Common Multiple (LCM)
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find the LCM of two numbers.
Example:
Input: a = 12, b = 15
Output: 60
Explanation: The LCM of 12 and 15 is 60.*/
package basic_programs;
import java.util.Scanner;
public class Program11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter a num2 : ");
		int num2 = sc.nextInt();
		int gcd = findGCD(num1,num2);
		int lcm = findLCM(num1,num2,gcd);
		System.out.println("LCM : "+lcm);
	}
	private static int findLCM(int num1, int num2, int gcd) {
		int lcm = (num1*num2)/gcd;
		return lcm;
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
