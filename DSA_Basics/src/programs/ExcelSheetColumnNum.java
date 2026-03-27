package programs;

import java.util.Scanner;

public class ExcelSheetColumnNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		String columnTitle = sc.next();
		int num = titleToNumber(columnTitle);
		System.out.println("Output : "+num);
	}

	private static int titleToNumber(String columnTitle) {
		int res = 0;
		for(char ch : columnTitle.toCharArray()) {
			int val = ch - 'A' + 1;
			res = res * 26 + val;
		}
		return res;
	}
}
