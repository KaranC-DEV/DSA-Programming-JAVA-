package array;

import java.util.Arrays;

public class FindTheArrayRotation {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		System.out.println("The Rotated Array is= ");
		int n=3;
		rotateArray(arr,n);
		System.out.println(Arrays.toString(arr));


	}

	public static void rotateArray(int[] arr,int n) {
		
		while(n!=0) {
		int last=arr[arr.length-1];
		
		for (int i = arr.length-1; i >= 0; i--) {
			
			if(i==0) {
				arr[i]=last;
			}
			else {
				arr[i]=arr[i-1];
			}
		}
		n--;
		}
		
	}

	
}
