package hashing;

import java.util.Arrays;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		int[] hash = new int[256];//instead of using 26 if uppercase also comes so we assign the 26 into 256
		Arrays.fill(hash, 0);
		//pre compute
		for(int i = 0;i<str.length();i++) {
			hash[str.charAt(i) - 'a'] +=1;
		}
		System.out.println("How many queries : ");
		int q = sc.nextInt();
		for(int i = 0;i<q;i++) {
			char ch;
			ch = sc.next().charAt(0);
			System.out.println(hash[ch-'a']);
		}
	}
}
