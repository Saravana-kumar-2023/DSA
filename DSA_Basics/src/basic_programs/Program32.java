/*Finding the Median of an Array
Difficulty: Medium
Topics: Arrays, Sorting
Description: Write a program to find the median of an array of numbers.
Example:
Input: array = [3, 1, 2, 4, 5]
Output: 3
Explanation: The median of the sorted array [1, 2, 3, 4, 5] is 3.*/
package basic_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Program32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		if (size % 2 != 0) {
		    System.out.println("Median : " + arr[size / 2]);
		} else {
		    double median = (arr[size / 2 - 1] + arr[size / 2]) / 2.0;
		    System.out.println("Median : " + median);
		}
	}
}
