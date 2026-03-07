package programs;

import java.util.Scanner;

public class AddBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string 1 : ");
		String a = sc.next();
		System.out.print("Enter the string 2 : ");
		String b = sc.next();
		String res = addBinary(a,b);
		System.out.println("Output is : "+res);
	}

	private static String addBinary(String a, String b) {
		int i = a.length()-1;
		int j = b.length()-1;
		int carry = 0;
		StringBuilder res = new StringBuilder();
		while(i >=0 || j >= 0 || carry != 0) {
			int sum = carry;
			if(i>=0) {
				sum = sum + (a.charAt(i)-'0');
				i--;
			}
			if(j>=0) {
				sum = sum + (b.charAt(j)-'0');
				j--;
			}
			res.append(sum%2);
			carry = sum / 2;
		}
		return res.reverse().toString();
	}
}
