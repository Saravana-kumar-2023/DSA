package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		char[] arr = new char[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.next().charAt(0);
		}
		System.out.println("Arrays is before reversing : "+Arrays.toString(arr));
		reverseString(arr);
		System.out.println("Arrays is after reversing: "+Arrays.toString(arr));
	}

	private static void reverseString(char[] s) {
		int i = 0,j = s.length-1;
		while(i < j) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
	}
}
