package array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxConsecutiveOnes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		int maxConse = findMaxConsecutiveOnes(arr);
		System.out.println("Output : "+maxConse);
	}

	private static int findMaxConsecutiveOnes(int[] arr) {
		int curr_count = 0;
		int max_count = 0;
		for(int i : arr) {
			if(i == 1) {
				curr_count++;
			}
			else {
				max_count = Math.max(max_count, curr_count);
				curr_count = 0;
			}
		}
		max_count = Math.max(max_count, curr_count);
		return max_count;
	}
}
