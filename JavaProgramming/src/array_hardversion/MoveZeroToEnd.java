package array_hardversion;

import java.util.Arrays;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		int arr[]= {0,2,0,8,0,5,1,0,};  
		
		System.out.println("The Answer is :-");
		
		moveZeroes(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}

	public static void moveZeroes(int[] arr) {
//		Doesn't preserve relative order
		
//		int i=0,j=arr.length-1;
//		
//		while(i<j) {
//			
//			while(arr[i]!=0 && i<j) 
//				i++;
//				while(arr[j]==0 && i<j)
//					j--;
//			
//			
//			
//			if(arr[i]==0 && arr[j]!=0) {
//				int temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//				i++;
//				j--;
//			}
//			
//		}
		
			
		
		for(int i =0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				
				if(arr[i]==0 && arr[j]!=0) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		
		
		
	}

}
