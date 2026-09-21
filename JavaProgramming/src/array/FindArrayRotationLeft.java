	package array;

import java.util.Arrays;

public class FindArrayRotationLeft {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		System.out.println("The Rotated Array is= ");
		int n=3;
		rotateArray(arr,n);
		System.out.println(Arrays.toString(arr));


	}

	public static void rotateArray(int[] arr,int n) {
		
		while(n!=0) {
		int first=arr[0];
		
		for (int i = 0; i <arr.length; i++) {
			
			if(i==arr.length-1) {
				arr[i]=first;
				
			}
			else {
				arr[i]=arr[i+1];
			}
		}
		n--;
		}
		
	}

	
}
