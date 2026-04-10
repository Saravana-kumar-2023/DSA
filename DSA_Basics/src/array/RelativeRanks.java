package array;

import java.util.Arrays;
import java.util.Scanner;

public class RelativeRanks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		String[] res = findRelativeRanks(arr);
		System.out.println(Arrays.toString(res));
		sc.close();
	}

	private static String[] findRelativeRanks(int[] scores) {
		int n = scores.length;
		int[][] arr = new int[n][2];
		for(int i = 0;i<n;i++) {
			arr[i][0] = scores[i];
			arr[i][1] = i;
		}
		Arrays.sort(arr,(a,b) -> b[0] - a[0]);
		
		String[] result = new String[n];
		for(int i = 0;i < n;i++) {
			int index = arr[i][1];
			if (i == 0) {
                result[index] = "Gold Medal";
            } 
            else if (i == 1) {
                result[index] = "Silver Medal";
            } 
            else if (i == 2) {
                result[index] = "Bronze Medal";
            } 
            else {
                result[index] = String.valueOf(i + 1);
            }
		}
		return result;
	}
}
