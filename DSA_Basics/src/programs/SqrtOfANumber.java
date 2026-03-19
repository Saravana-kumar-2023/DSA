package programs;

import java.util.Scanner;

public class SqrtOfANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int sqrt = findSqrt(num);
		System.out.println(sqrt);
	}

	private static int findSqrt(int n) {
		int low = 0, high = n, result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
	}
}
