package array.sliding_window;

import java.util.Arrays;

public class FindAvgOfKthSubArray {
public static void main(String[] args) {
	int arr[]= {1,3,2,6,-1,4,1,8,2};
	int k=3;
	double[] res=Avg(arr,k);
	System.out.println(Arrays.toString((res)));
}

public static double[] Avg(int[] arr, int k) {
	
	
	int left=0 ,max=0;
	double currentSum=0;
	double res[] = new double[arr.length-k+1];
	int i=0;
	for(int right=0;right<arr.length;right++) {
		
		currentSum+=arr[right];
		if(right-left+1==k) {
			res[i]=currentSum/k;
			currentSum -=arr[left];
			left++;
			i++;
			
			
		}
		
	}
	return res;
}

}


