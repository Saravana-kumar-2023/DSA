package programs;

import java.util.Scanner;

public class UglyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		boolean isUgly = isUgly(num);
		System.out.println("Output is : "+isUgly);
	}

	private static boolean isUgly(int num) {
		if(num <= 0) {
			return false;
		}
		while(num % 2 == 0) {
			num = num / 2;
		}
		while(num % 3 == 0) {
			num = num / 3;
		}
		while(num % 5 == 0) {
			num = num / 5;
		}
		if(num == 1) {
			return true;
		}
		else {
			return false;
		}
	}
}
