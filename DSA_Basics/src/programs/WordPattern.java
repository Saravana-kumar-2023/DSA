package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the pattern : ");
		String pattern = sc.next();
		sc.nextLine();
		System.out.print("Enter the words : ");
		String s = sc.nextLine();
		boolean res = wordPattern(pattern,s);
		System.out.println(res);
	}

	private static boolean wordPattern(String pattern, String s) {
		String[] words = s.split(" ");
		if(pattern.length() != words.length) {
			return false;
		}
		Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            if (map1.containsKey(ch)) {
                if (!map1.get(ch).equals(word)) {
                    return false;
                }
            } else {
                map1.put(ch, word);
            }
            if (map2.containsKey(word)) {
                if (map2.get(word) != ch) {
                    return false;
                }
            } else {
                map2.put(word, ch);
            }
        }
        return true;
	}
}
