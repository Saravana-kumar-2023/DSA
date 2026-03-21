package programs;

import java.util.HashSet;
import java.util.Scanner;

public class ReverseVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.next();
		System.out.println("After reversed : "+reverseString(str));
	}

	private static String reverseString(String s) {
		HashSet set = new HashSet();
		set.add('A');
		set.add('E');
		set.add('I');
		set.add('O');
		set.add('U');
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		char[] ch = s.toCharArray();
		int i = 0,j = s.length()-1;
		while(i<j) {
			while(i<j && !set.contains(ch[i])) {
				i++;
			}
			while(i<j && !set.contains(ch[j])) {
				j--;
			}
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		return new String(ch);
	}
}
