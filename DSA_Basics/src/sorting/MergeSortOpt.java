package sorting;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSortOpt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		mergeSort(arr,n);
		System.out.println("Array after sorted : "+Arrays.toString(arr));
		sc.close();
	}

	private static void mergeSort(int[] arr,int n) {
		ms(arr,0,n-1);
	}
	private static void ms(int[] arr,int low, int high) {
		if(low >= high) {
			return;
		}
		int mid = (low+high)/2;
		ms(arr,low,mid);//Recursion for left of an array
		ms(arr,mid+1,high);//Recursion for right of an array
		merge(arr,low,mid,high);
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		int[] temp = new int[high-low+1];
		int left = low;
		int right = mid+1;
		int k = 0;
		while(left<=mid && right<=high) {
			if(arr[left] <= arr[right]) {
				temp[k++] = arr[left];
				left++;
			}
			else {
				temp[k++] = arr[right];
				right++;
			}
		}
		while(left<=mid) {
			temp[k++] = arr[left];
			left++;
		}
		while(right<=high) {
			temp[k++] = arr[right];
			right++;
		}
		for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
	}
}
