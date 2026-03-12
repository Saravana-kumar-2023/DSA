package programs;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		int number  = missingNumber(arr);
		System.out.println("Number is : "+number);
	}

	private static int missingNumber(int[] nums) {
		int n = nums.length;
        int exp = (n*(n+1))/2;
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        return exp - sum;
	}
	
	/* BRUTE FORCE
	private static int missingNumber(int[] nums) {
		Arrays.sort(nums);
		for(int i = 0;i < nums.length;i++) {
			if(nums[i] != i) {
				return i;
			}
		}
		return nums.length;
	}*/
}
