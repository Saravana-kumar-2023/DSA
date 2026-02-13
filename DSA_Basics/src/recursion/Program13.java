package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		int[] candidates = new int[n];
		for(int i = 0;i<n;i++) {
			candidates[i] = sc.nextInt();
		}
		System.out.print("Enter the target : ");
		int target = sc.nextInt();
		List<List<Integer>> ans = combinationSum(candidates,target);
		System.out.println(ans);
	}

	private static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		findCombination(0,candidates,target,ans,new ArrayList<Integer>());
		return ans;
	}

	private static void findCombination(int i, int[] arr, int target, List<List<Integer>> ans,
			ArrayList<Integer> ds) {
		if(i == arr.length) {
			if(target == 0) {
				ans.add(new ArrayList<>(ds));
			}
			return;
		}
		if(arr[i]<=target) {
			ds.add(arr[i]);
			findCombination(i,arr,target-arr[i],ans,ds);
			ds.remove(ds.size()-1);
		}
		findCombination(i+1,arr,target,ans,ds);
	}
}
