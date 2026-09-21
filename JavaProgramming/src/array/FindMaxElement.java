package array;

public class FindMaxElement {

	public static void main(String[] args) {
		int[] arr= {10,20,30,150,95,84,100};
		System.out.println("Maximum Element of Array is= "+maxElement(arr));


	}

	public static int maxElement(int[] arr) {
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(max<arr[i])
				max=arr[i];
			
			
		}
		return max;
	}

}
