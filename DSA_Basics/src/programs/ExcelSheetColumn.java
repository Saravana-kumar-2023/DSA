package programs;

import java.util.Scanner;

public class ExcelSheetColumn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		String s = convertToTitle(n);
		System.out.println("Output : "+s);
	}

	private static String convertToTitle(int n) {
		String res = "";
		while(n > 0) {
			n = n-1;
			int rem = n % 26;
			char ch = (char) ('A' + rem);
			res = ch + res;
			n /= 26;
		}
		return res;
	}
}
