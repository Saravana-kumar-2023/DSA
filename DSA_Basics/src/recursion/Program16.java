//Find all the permutation Approach 2
package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		List<List<Integer>> ans = permute(arr);
		System.out.println(ans);
	}

	private static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		recurPermutate(0,nums,ans);
		return ans;
	}

	private static void recurPermutate(int ind, int[] nums, List<List<Integer>> ans) {
		if(ind == nums.length) {
			List<Integer> ds = new ArrayList<>();
			for(int i = 0;i<nums.length;i++) {
				ds.add(nums[i]);
			}
			ans.add(new ArrayList<>(ds));
			return;
		}
		for(int i = ind;i<nums.length;i++) {
			swap(i,ind,nums);
			recurPermutate(ind+1,nums,ans);
			swap(i,ind,nums);
		}
	}

	private static void swap(int i, int ind, int[] nums) {
		int temp = nums[ind];
		nums[ind] = nums[i];
		nums[i] = temp;
	}
}
