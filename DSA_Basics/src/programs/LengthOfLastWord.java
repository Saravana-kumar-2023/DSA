package programs;

import java.util.Scanner;

public class LengthOfLastWord {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		int len = lengthOfLastWord(str);
		System.out.println("Length of last word : "+len);
		sc.close();
	}

	private static int lengthOfLastWord(String str) {
		String[] words = str.split(" ");
		String word = words[words.length-1];
		return word.length();
	}
}
