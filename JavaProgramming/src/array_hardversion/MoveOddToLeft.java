package array_hardversion;

import java.util.Arrays;

public class MoveOddToLeft {

	public static void main(String[] args) {
		// leetcode 283

		int arr[] = { 1,2,3,4,5,6,7,8 };

		System.out.println("The Answer is :-");

		moveOdd(arr);

		System.out.println(Arrays.toString(arr));

	}

	public static void moveOdd(int[] arr) {

		int i = 0, j = arr.length - 1;

		while (i < j) {

			while (arr[i]%2!=0 && i < j)
				i++;
			while (arr[j] %2== 0 && i < j)
				j--;

			if (arr[i] %2== 0 && arr[j] %2 != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}

		}

	}

}
