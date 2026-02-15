//Find all the permutation Approach 1
package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program15 {
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
		List<Integer> ds = new ArrayList<>();
		boolean [] freq = new boolean[nums.length];
		recurPermute(nums,ans,ds,freq);
		return ans;
	}

	private static void recurPermute(int[] nums, List<List<Integer>> ans, List<Integer> ds, boolean[] freq) {
		if(ds.size() == nums.length) {
			ans.add(new ArrayList<>(ds));
		}
		for(int i = 0;i<nums.length;i++) {
			if(!freq[i]) {
				freq[i] = true;
				ds.add(nums[i]);
				recurPermute(nums,ans,ds,freq);
				ds.remove(ds.size()-1);
				freq[i] = false;
			}
		}
	}
}
