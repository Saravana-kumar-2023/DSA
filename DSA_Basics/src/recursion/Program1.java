/*Print name N times using recursion*/
package recursion;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the N : ");
		int n = sc.nextInt();
		name(1,n);
	}

	private static void name(int i ,int n) {
		if(i > n) {
			return;
		}
		System.out.println("Name");
		name(i+1,n);
	}
}
