package programs;

import java.util.Scanner;

public class MaximumXOR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the s : ");
		String s = sc.next();
		System.out.println("Enter the t : ");
		String t = sc.next();
		String res = findMaximumXOR(s,t);
		System.out.println("Output : "+res);
	}

	private static String findMaximumXOR(String s, String t) {
		int ones = 0;
		int zeros = 0;
		for(char ch : t.toCharArray()) {
			if(ch == '1') {
				ones++;
			}
			else {
				zeros++;
			}
		}
		StringBuilder res = new StringBuilder();
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i) == '0') {
				if(ones > 0) {
					res.append('1');
					ones--;
				}
				else {
					res.append('0');
				}
			}
			else {
				if(zeros > 0) {
					res.append('1');
					zeros--;
				}
				else {
					res.append('0');
				}
			}
		}
		return res.toString();
	}
}
