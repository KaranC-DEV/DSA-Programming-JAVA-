package array;

public class FindDuplicateElements {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 20,10,20}; 
		
		System.out.println("The number of Duplicate Elements are = "+duplicate(arr));
		
		
	}

	public static int duplicate(int[] arr) {
		
		 int count = 0;
		 int min= Integer.MIN_VALUE;
		 for (int i = 0; i < arr.length; i++) {

	           	if(arr[i]!=min)

	            for (int j = i + 1; j < arr.length; j++) {
	            	
	                if (arr[i] == arr[j]) {
	                    count++;
	                    arr[j]=min;
	                }
	            }

	           	
		
		 }
		 
		 
	 return count;
	}
	
	}


// print the unique and duplicate elements