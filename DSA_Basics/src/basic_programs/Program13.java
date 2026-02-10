/*Reversing a String
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to reverse a given string.
Example:
Input: string = "programming"
Output: "gnimmargorp"
Explanation: The reversed string of "programming" is "gnimmargorp".*/
package basic_programs;
import java.util.Scanner;
public class Program13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		int ptr1 = 0,ptr2 = str.length()-1;
		while(ptr1<ptr2) {
			char temp = ch[ptr1];
			ch[ptr1] = ch[ptr2];
			ch[ptr2] = temp;
			ptr1++;
			ptr2--;
		}
		String str2 = new String(ch);
		System.out.println("Reversed String : "+str2);
	}
}
