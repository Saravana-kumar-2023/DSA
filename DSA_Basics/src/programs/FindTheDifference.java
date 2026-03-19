package programs;

import java.util.Scanner;

public class FindTheDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string 1 : ");
		String s = sc.next();
		System.out.print("Enter the string 2 : ");
		String t = sc.next();
		char res = findTheDifference(s,t);
		System.out.println("Output : "+res);
	}

	private static char findTheDifference(String s, String t) {
		int res = 0;
		for(char ch : s.toCharArray()) {
			res ^= ch;
		}
		for(char ch : t.toCharArray()) {
			res ^= ch;
		}
		return (char) res;
	}
}
