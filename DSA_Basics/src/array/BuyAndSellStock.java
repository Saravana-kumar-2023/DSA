package array;

import java.util.Arrays;
import java.util.Scanner;

public class BuyAndSellStock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		int res  = maxProfit(arr);
		System.out.println("Number is : "+res);
	}

	private static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for(int price : prices) {
			if(price < minPrice) {
				minPrice = price;
			}
			else {
				int profit = price - minPrice;
				if(profit > maxProfit) {
					maxProfit = profit;
				}
			}
		}
		
		return maxProfit;
	}
}
