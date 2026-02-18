package programs;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = sc.nextLine();
		int res = romanToInteger(s);
		System.out.println("Res : "+res);
	}

	private static int romanToInteger(String s) {
		int res = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		for(int i = 0;i<s.length();i++) {
			int curr = map.get(s.charAt(i));
			if(i+1 < s.length()) {
				int next = map.get(s.charAt(i+1));
				if(curr < next) {
					res -= curr;
				}
				else {
					res +=curr;
				}
			}
			else {
				res+=curr;
			}
		}
		return res;
	}
}
