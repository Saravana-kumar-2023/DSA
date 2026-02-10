/*Finding the Sum of Elements in an Array
Difficulty: Easy
Topics: Basic Programming, Arrays
Description: Write a program to find the sum of elements in an array.
Example:
Input: array = [1, 2, 3, 4, 5]
Output: 15
Explanation: The sum of the elements in the array is 15.*/
package basic_programs;
import java.util.Scanner;
public class Program16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array items : ");
		for(int i = 0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		int sum = findSum(arr);
		System.out.println("The sum of the elements in the array : "+sum);
	}

	private static int findSum(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum+=i;
		}
		return sum;
	}
}
