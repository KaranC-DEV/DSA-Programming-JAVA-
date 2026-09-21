package array;

import java.util.Arrays;

public class FindUnSimilarArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 30, 10, 40 }; // 10,20,30,10,40,50,10
		int key = 10;
		int res[] = removekey(arr, key);
		System.out.println("The Rotated Array is= ");

		System.out.println(Arrays.toString(res));

	}

	public static int[] removekey(int[] arr, int key) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == key) {
				count++;
				
			}
		}

		int length = arr.length - count;
		int newArr[] = new int[length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != key) {
				newArr[j] = arr[i];
				j++;
			}
			
		}

		return newArr;
	}

}