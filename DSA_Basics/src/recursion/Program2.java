package recursion;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the N : ");
		int n = sc.nextInt();
		print1ToN(1,n);
		System.out.println("----------------");
		print1toNBack(n,n);//By using backtracking
	}

	private static void print1toNBack(int i, int n) {
		if(i<1) {
			return;
		}
		print1toNBack(i-1,n);
		System.out.println(i);
	}

	private static void print1ToN(int i, int n) {
		if(i > n) {
			return;
		}
		System.out.println(i);
		print1ToN(i+1,n);
	}
}
