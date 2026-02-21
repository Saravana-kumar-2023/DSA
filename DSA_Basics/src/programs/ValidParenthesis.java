package programs;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.next();
		boolean res = isValid(s);
		System.out.println(res);
	}

	private static boolean isValid(String s) {
		char[] word = s.toCharArray(); 
		Stack<Character> st = new Stack<>();
		for(char ch : word) {
			if(ch == '(' ||ch == '{' ||ch == '[') {
				st.push(ch);
			}
			else {
				if(st.empty()) {
					return false;
				}
				char top = st.pop();
				if((top == '(' && ch != ')') ||(top == '[' && ch != ']')||(top == '{' && ch != '}')) {
					return false;
				}
			}
		}
		if(st.empty())
			return true;
		else
			return false;
	}
}
