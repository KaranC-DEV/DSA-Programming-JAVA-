package array_hardversion;

import java.util.Arrays;

public class FindTwoSumInSortedArray {

	public static void main(String[] args) {
		
		int arr[]= {2,7,11,15};
		int target= 9;
		System.out.println("The Answer is :-");
		int []newarr=twoSum(arr,target);
		
		System.out.println(Arrays.toString(newarr));
		
		
	}

	public static int[] twoSum(int[] arr, int target) {
		
		int i=0,j=arr.length-1;
		
		while(i<j) {
			int sum = arr[i] + arr[j];
			if(sum==target)
				return new int[]{i+1,j+1};
			else if(sum<target)
				i++;
			else
				j--;
		}
		
		return new int[]{-1, -1};
		
		
	}

}
