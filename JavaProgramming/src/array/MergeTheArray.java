package array;

import java.util.Arrays;
import java.util.Iterator;

public class MergeTheArray {

	public static void main(String[] args) {
	
		
		int[] arr1= {10,20,30,40,50};
		int[] arr2= {60,70,80,90};
		
		System.out.println("The merged array is :- ");
		System.out.println(Arrays.toString(mergeArray(arr1,arr2)));
	}

	public static int[] mergeArray(int[] arr1, int[] arr2) {
		
		
		int l1=arr1.length;
		int l2=arr2.length;
		int res[] =new  int [l1+l2];
		
//		for(int i=0;i<arr1.length;i++) {
//			
//			res[i]=arr1[i];
//		}
//		
//		for(int i=0;i<arr2.length;i++) {
//			
//			res[l1+i]=arr2[i];
//		}
		
		for(int i=0;i<res.length;i++) {
			
			if(i<l1)
			res[i]=arr1[i];
		
			else
				res[i]=arr2[i-l1];
	
			
		
		}
		
		return res;
	}

}
