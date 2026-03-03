package programs;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements : "+Arrays.toString(arr));
		int[] plusOne = plusOne(arr);
		System.out.println("Plus one : "+Arrays.toString(plusOne));
	}

	private static int[] plusOne(int[] digits) {
		for(int i = digits.length - 1;i>=0;i--) {
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] newArr = new int[digits.length+1];
		newArr[0] = 1;
		return newArr;
	}
}
