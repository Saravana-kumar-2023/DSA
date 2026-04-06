package array;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumAverageSubarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		System.out.print("Enter the k val : ");
		int k = sc.nextInt();
		double res = findMaxAverage(arr,k);
		System.out.println(res);
	}

	private static double findMaxAverage(int[] nums, int k) {
		int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        
        int maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        
        return (double) maxSum / k;
	}
}
