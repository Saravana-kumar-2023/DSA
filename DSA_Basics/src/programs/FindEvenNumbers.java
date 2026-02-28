package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindEvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements : "+Arrays.toString(arr));
		int [] res = findEvenNumbers(arr);
		System.out.println("Array elements are : "+Arrays.toString(res));
	}

	private static int[] findEvenNumbers(int[] arr) {
		List<Integer> ls = new ArrayList<Integer>();
		Arrays.sort(arr);
		boolean[] used = new boolean[arr.length];
		Arrays.fill(used, false);
		evenNumbers(arr,ls,used,0,0);
		int[] res = new int[ls.size()];
		int j = 0;
		for(int i : ls) {
			res[j++] = i;
		}
		return res;
	}

	private static void evenNumbers(int[] arr, List<Integer> ls, boolean[] used,int num,int curLength) {
		if(curLength == 3) {
			if(num % 2 == 0) {
				ls.add(num);
			}
			return;
		}
		for(int i = 0;i<arr.length;i++) {
			if(used[i] == true) {
				continue;
			}
			if(curLength == 0 && arr[i] == 0) {
				continue;
			}
			if(i > 0 && arr[i] == arr[i-1] && used[i-1] == false) {
				continue;
			}
			int newNum = num * 10 + arr[i];
			used[i] = true;
			evenNumbers(arr,ls,used,newNum,curLength+1);
			used[i] = false;
		}
	}
}
