package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		int max = 0,res = 0;
		for(Map.Entry<Integer, Integer> it : map.entrySet()) {
			if(it.getValue() > max) {
				max = it.getValue();
				res = it.getKey();
			}
		}
		System.out.print(res+"->"+max);
	}
}
