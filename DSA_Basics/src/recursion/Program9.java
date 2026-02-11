package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Program9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> res = new ArrayList<Integer>();
		printSubsequences(arr,n,0,res);
	}

	private static void printSubsequences(int[] arr, int n, int i, ArrayList<Integer> res) {
		if(i==n) {
			System.out.println(res);
			return;
		}
		//take or pick the particular index into the subsequence 
		res.add(arr[i]);
		printSubsequences(arr,n,i+1,res);
		res.remove(Integer.valueOf(arr[i]));
		//not take or not pick the particular index into the subsequence
		printSubsequences(arr,n,i+1,res);
	}
}
