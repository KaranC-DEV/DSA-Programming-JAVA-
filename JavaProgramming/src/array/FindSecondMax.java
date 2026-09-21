package array;

public class FindSecondMax {

	public static void main(String[] args) {
		
		int[] arr= {10,5,8,10,7,6,10};
		System.out.println("Second Maximum Element of Array is= "+secondMaxElement(arr));


	}

	public static int secondMaxElement(int[] arr) {
		
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(max<arr[i]&& smax!=max) {
			
				smax=max;
				max=arr[i];	
			}
			else if(arr[i]>smax && arr[i]!=max )
				smax=arr[i];
			
		}
		return smax;
	}

}
