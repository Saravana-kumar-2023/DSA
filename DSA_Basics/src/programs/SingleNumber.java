package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingleNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		int number  = singleNumber(arr);
		System.out.println("Number is : "+number);
	}

	private static int singleNumber(int[] arr) {
		HashMap<Integer,Integer> mpp = new HashMap<Integer,Integer>();
		for(int i : arr) {
			mpp.put(i,mpp.getOrDefault(i,0) +1);
		}
		for(Map.Entry<Integer,Integer> entry : mpp.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return -1;
	}
}
