package array;

import java.util.Arrays;

public class FindTheDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = { 10, 20, 10, 30, 10,20, 40 }; 
		
		System.out.println("The number of Duplicate Elements are:-");
		duplicate(arr);
		
	}

	public static void duplicate(int[] arr) {
		
		
		 for (int i = 0; i < arr.length; i++) {

	            int count = 1;

	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                }
	            }

//	            if (count > 1) {
//
//	                int j;
//
//	                for (j = 0; j < i; j++) {
//	                    if (arr[i] == arr[j]) {
//	                        break;
//	                    }
//	                }
//
//	                if (j == i) {
	                    System.out.println(arr[i] + " -> " + count);
//	                }
//	            }
	        }
	    }
	}