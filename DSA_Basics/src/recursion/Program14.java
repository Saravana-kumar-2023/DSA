package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program14 {
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
		List<List<Integer>> ans = combinationSum2(candidates,target);
		System.out.println(ans);
	}

	private static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(candidates);
		findCombination(0,candidates,target,ans,new ArrayList<Integer>());
		return ans;
	}

	private static void findCombination(int ind, int[] arr, int target, List<List<Integer>> ans,
			ArrayList<Integer> ds) {
		if(target == 0) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		for(int i = ind;i< arr.length;i++) {
			if(i>ind && arr[i] == arr[i-1]) {
				continue;
			}
			if(arr[i] > target) {
				break;
			}
			ds.add(arr[i]);
			findCombination(i+1,arr,target-arr[i],ans,ds);
			ds.remove(ds.size()-1);
		}
	}
}
