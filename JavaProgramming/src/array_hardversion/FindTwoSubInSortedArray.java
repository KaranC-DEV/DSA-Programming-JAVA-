package array_hardversion;

import java.util.Arrays;

public class FindTwoSubInSortedArray {

	public static void main(String[] args) {
		int arr[]= {15,11,7,2};
		int target= 9;
		System.out.println("The Answer is :-");
		int []newarr=twoSub(arr,target);
		
		System.out.println(Arrays.toString(newarr));
		
		
	}

	public static int[] twoSub(int[] arr, int target) {
		
		int i=0,j=arr.length-1;
		
		while(i<j) {
			int sub = arr[i] - arr[j];
			if(sub==target)
				return new int[]{i+1,j+1};
			else if(sub>target)
				i++;
			else
				j--;
		}
		
		return new int[]{-1, -1};
		
		
	}

}
