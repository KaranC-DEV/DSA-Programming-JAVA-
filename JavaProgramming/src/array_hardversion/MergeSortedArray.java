package array_hardversion;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int arr1[] = { 10,20,30};
		int arr2[]= {15};
		System.out.println(Arrays.toString(mergeArray(arr1,arr2)));
		
		
	}

	public static int[] mergeArray(int[] arr1, int[] arr2) {
		
		int i=0,j=0,k=0;
		int res[]=new int[arr1.length+arr2.length];
		
		while(k < res.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				res[k++]=arr1[i++];
				
			
			
			}
			else {
				res[k++]=arr2[j++];
			}
			
			
		}
		

		while(i<arr1.length) {
			res[k++]=arr1[i++];
		}

		while(j<arr2.length) {
			res[k++]=arr1[j++];
		}
		
		return res;
		
	}

}
