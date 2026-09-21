package array;

import java.util.Arrays;

public class FindEvenNumbersInArrayAddOne {
	
	
	// if we are doing modification on the same array then no need of return type it will be void
	// but if we are doing modification on the new array the the return typpe will be int[] 

	public static void main(String[] args) {
		int[] arr= {10,13,20,27,30};
		System.out.println("Sum of Array is= ");
		addEvenElements(arr);
		System.out.print(Arrays.toString(arr));

	}

	public static int[] addEvenElements(int[] arr) {
		
		
		
		for (int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0)
				
				arr[i]++;
		}
		
		
		return arr;
	}

}
