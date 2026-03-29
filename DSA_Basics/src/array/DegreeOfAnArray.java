package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class DegreeOfAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		int degree = findShortestSubArray(arr);
		System.out.println(degree);
	}

	private static int findShortestSubArray(int[] nums) {
		HashMap<Integer,Integer> count = new HashMap<>();	
		HashMap<Integer,Integer> firstIndex = new HashMap<>();	
		HashMap<Integer,Integer> lastIndex = new HashMap<>();	
		
		for(int i = 0;i < nums.length;i++) {
			int num = nums[i];
			if(!firstIndex.containsKey(num)) {
				firstIndex.put(num, i);
			}
			lastIndex.put(num, i);
			count.put(num, count.getOrDefault(num, 0)+1);
		}
		int degree = 0;
        for (int val : count.values()) {
            degree = Math.max(degree, val);
        }

        int minLength = nums.length;

        for (int num : count.keySet()) {
            if (count.get(num) == degree) {
                int length = lastIndex.get(num) - firstIndex.get(num) + 1;
                minLength = Math.min(minLength, length);
            }
        }
		return minLength;
	}
}
