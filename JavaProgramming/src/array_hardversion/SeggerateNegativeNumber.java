package array_hardversion;

import java.util.Arrays;

public class SeggerateNegativeNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,3,3,5,6};  
		//int arr[]= {-1,-2,-3,-3,-5,-6};
		
		System.out.println("The Answer is :-");
		
		seggregateNegative(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}

	public static void seggregateNegative(int[] arr) {
		
		int i=0,j=arr.length-1;
		
		while(i<j) {
			
			while(arr[i]>=0 && i<j) 
				i++;
				while(arr[j]<0 && i<j)
					j--;
			
			
			
			if(arr[i]<0 && arr[j]>=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			
		}
		
		
		
		
	}

}
