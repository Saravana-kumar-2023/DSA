package recursion;

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		str = str.replaceAll(" ", "");
		str = str.toLowerCase();
		System.out.println(str);
		System.out.println(isPalindrome(str,0));
	}


	 private static boolean isPalindrome(String str,int i) { 
		 int n = str.length();
		 if(i>n/2) 
	 		return true; 
		 if(str.charAt(i) != str.charAt(n-i-1)) 
			return false;
		 return isPalindrome(str,i+1); 
	 }
}
