package hashing;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		//precompute
		int[] hash = new int[13];
		Arrays.fill(hash, 0);
		for(int i = 0;i<n;i++) {
			hash[arr[i]] += 1;
		}
		System.out.println("How many queries : ");
		int q = sc.nextInt();
		for(int i = 0;i<q;i++) {
			int number;
			number = sc.nextInt();
			//fetch
			System.out.println(hash[number]);
		}
	}
}
