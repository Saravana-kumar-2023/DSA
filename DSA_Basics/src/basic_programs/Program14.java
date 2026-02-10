/*Finding the Largest and Smallest Numbers in an Array
Difficulty: Easy
Topics: Basic Programming, Arrays
Description: Write a program to find the largest and smallest numbers in an array.
Example:
Input: array = [4, 7, 1, 8, 5]
Output: Largest: 8, Smallest: 1
Explanation: The largest number in the array is 8 and the smallest is 1.*/
package basic_programs;

import java.util.Scanner;

public class Program14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array items : ");
		for(int i = 0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		int largest = findLargest(arr);
		int smallest = findSmallest(arr);
		System.out.println("Largest : "+largest+"    "+"Smallest : "+smallest);
	}

	private static int findSmallest(int[] arr) {
		int smallest = arr[0];
		for(int i : arr) {
			if(i<smallest) {
				smallest = i;
			}
		}
		return smallest;
	}

	private static int findLargest(int[] arr) {
		int largest = arr[0];
		for(int i : arr) {
			if(i>largest) {
				largest = i;
			}
		}
		return largest;
	}
}
