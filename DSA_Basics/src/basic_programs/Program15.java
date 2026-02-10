/*Sorting an Array
Difficulty: Easy
Topics: Basic Programming, Sorting Algorithms
Description: Write a program to sort an array of numbers in ascending order.
Example:
Input: array = [3, 1, 4, 1, 5, 9]
Output: [1, 1, 3, 4, 5, 9]
Explanation: The array sorted in ascending order is [1, 1, 3, 4, 5, 9].*/
package basic_programs;
import java.util.Scanner;
public class Program15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();
		System.out.println("Enter elements : ");
		int[] arr = new int[size];
		for(int i = 0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements ( unsorted ) : ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		//Sorting
		for(int i = 0;i< arr.length;i++) {
			for(int j = 0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Array Elements ( sorted ) : ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
}
