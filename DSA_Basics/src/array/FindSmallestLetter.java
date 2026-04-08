//Find smallest letter greater than target
package array;

import java.util.Arrays;
import java.util.Scanner;

public class FindSmallestLetter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of : ");
		int n = sc.nextInt();
		char[] arr = new char[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.next().charAt(0);
		}
		System.out.println("Arrays is : "+Arrays.toString(arr));
		System.out.print("Target is : ");
		char target = sc.next().charAt(0);
		char res = nextGreatestLetter(arr,target);
		System.out.println(res);
	}

	private static char nextGreatestLetter(char[] letters, char target) {
		int left = 0;
        int right = letters.length - 1;
        char answer = letters[0]; 

        while (left <= right) {
            int mid = (left + right) / 2;

            if (letters[mid] > target) {
                answer = letters[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
	}
}
