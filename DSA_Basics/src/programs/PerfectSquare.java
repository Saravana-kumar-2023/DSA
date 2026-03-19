package programs;

import java.util.Scanner;

public class PerfectSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		boolean isPerfect = isPerfectSquare(num);
		System.out.println(isPerfect);
	}

	/*
	private static boolean isPerfectSquare(int num) {
		int i = 1;
		while(i*i <= num) {
			if(i * i == num) {
				return true;
			}
			i++;
		}
		return false;
	}*/
	
	private static boolean isPerfectSquare(int num) {
		double root = Math.sqrt(num);
		if(root % 1 == 0) {
			return true;
		}
		return false;
	}
}
