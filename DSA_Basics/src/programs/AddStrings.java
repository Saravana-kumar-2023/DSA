package programs;

import java.util.Scanner;

public class AddStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1 : ");
		String num1 = sc.next();
		System.out.println("Enter the number 2 : ");
		String num2 = sc.next();
		String res = addStrings(num1,num2);
		System.out.println(res);
	}

	private static String addStrings(String num1, String num2) {
		int i = num1.length()-1;
		int j = num2.length()-1;
		int carry = 0;
		StringBuilder res = new StringBuilder();
		while(i>=0 || j>=0 || carry > 0) {
			int digit1 = 0;
			if(i >= 0) {
				digit1 = num1.charAt(i) - '0';
			}
			int digit2 = 0;
			if(j >= 0) {
				digit2 = num2.charAt(j) - '0';
			}
			int sum = digit1 + digit2 + carry;
			carry = sum / 10;
			res.append(sum % 10);
			i--;
			j--;
		}
		
		return res.reverse().toString();
	}
}
