/*Finding Missing Numbers in a Sequence
Difficulty: Easy
Topics: Basic Programming, Arrays
Description: Write a program to find missing numbers in a sequence from 1 to n.
Example:
Input: sequence = [1, 2, 4, 5]
Output: [3]
Explanation: The missing number in the sequence from 1 to 5 is 3.*/
package basic_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Program30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int start = arr[0];
		for(int i = 0;i<size;i++) {
			if(arr[i]!=start) {
				break;
			}
			start++;
		}
		System.out.println("The missing number is :"+start);
	}
}
