package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		//precompute
		//We can put it this inside the above for loop also
		HashMap<Integer,Integer> mpp = new HashMap<>();
		for(int i : arr) {
			mpp.put(i,mpp.getOrDefault(i,0) +1);
		}
		//iterate
		/*
		 * for(Map.Entry<Integer, Integer> it : mpp.entrySet()) 
		 * {
		 * 		System.out.println(it.getKey()+"->"+it.getValue()); 
		 * }
		 */
		System.out.print("Enter the number of queries : ");
		int q = sc.nextInt();
		while(q-- > 0) {
			int number;
			number = sc.nextInt();
			//fetch
			System.out.println(mpp.getOrDefault(number, 0));
		}
	}
}
