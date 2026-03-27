package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ThirdMaximumNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		int thirdNumber = thirdNum(arr);
		System.out.print("Third maximum number : "+thirdNumber);
	}

	private static int thirdNum(int[] nums) {
		Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }
        
        List<Integer> list = new ArrayList<>(set);	
        Collections.sort(list, Collections.reverseOrder());
        
        return list.size() >= 3 ? list.get(2) : list.get(0);
	}
}