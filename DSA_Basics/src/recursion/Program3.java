package recursion;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the N : ");
		int n = sc.nextInt();
		printNTo1(n,n);
		System.out.println("--------------");
		printNto1Back(1,n);//By using Backtracking
	}

	private static void printNto1Back(int i, int n) {
		if(i>n) {
			return;
		}
		printNto1Back(i+1,n);
		System.out.println(i);
	}

	private static void printNTo1(int i, int n) {
		if(i<1) {
			return;
		}
		System.out.println(i);
		printNTo1(i-1,n);
		
	}
}
