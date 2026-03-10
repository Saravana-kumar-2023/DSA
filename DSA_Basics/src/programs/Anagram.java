package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String 1 : ");
		String s = sc.next();
		System.out.print("Enter the String 2 : ");
		String t = sc.next();
		boolean res = isAnagram(s,t);
		System.out.println(res);
	}

	private static boolean isAnagram(String s, String t) {
		char[] s1 = s.toCharArray();
		char[] s2 = t.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		return Arrays.equals(s1, s2);
	}
}
