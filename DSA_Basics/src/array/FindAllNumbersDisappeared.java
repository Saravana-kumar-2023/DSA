package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindAllNumbersDisappeared {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		List<Integer> ls = findDisappearedNumbers(arr);
		System.out.println(ls.toString());
	}

	private static List<Integer> findDisappearedNumbers(int[] nums) {
		int n = nums.length;
		for(int i = 0;i < n;i++) {
			int index = Math.abs(nums[i]) - 1;
			if(nums[index] > 0) {
				nums[index] = -nums[index];
			}
		}
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i = 0;i < n;i++) {
			if(nums[i] > 0) {
				res.add(i+1);
			}
		}
		return res;
	}
}
