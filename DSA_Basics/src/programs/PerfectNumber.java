package programs;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		boolean isPerfect = checkPerfectNumber(num);
		System.out.println("Output : "+isPerfect);
	}

	private static boolean checkPerfectNumber(int num) {
		int sum = 0;
		for(int i = 1;i <= num/2;i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		return sum == num;
	}
}
