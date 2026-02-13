//To print one subsequence that matches the sum of target
package recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class Program11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Target : ");
		int tar = sc.nextInt();
		ArrayList<Integer> res = new ArrayList<Integer>();
		sumOfSubsequences(arr,0,n,res,tar,0);
	}

	private static boolean sumOfSubsequences(int[] arr, int i, int n, ArrayList<Integer> res, int tar, int sum) {
		if(i==n) {
			if(tar == sum) {
				System.out.println(res);
				return true;
			}
			else
				return false;
		}
		
		res.add(arr[i]);
		sum+=arr[i];
		if(sumOfSubsequences(arr,i+1,n,res,tar,sum)==true) {
			return true;
		}
		res.remove(res.size()-1);
		sum-=arr[i];
		if(sumOfSubsequences(arr,i+1,n,res,tar,sum)==true){
			return true;
		}
		return false;
	}
}
