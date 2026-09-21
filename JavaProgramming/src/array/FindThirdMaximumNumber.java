package array;

public class FindThirdMaximumNumber {

	public static void main(String[] args) {
		int[] arr= {10,5,8,10,7,6,10};
		System.out.println("Third Maximum Element of Array is= "+thirdMaxElement(arr));


	}

	public static int thirdMaxElement(int[] arr) {
		
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		int tmax=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                tmax = smax;
                smax = max;
                max = arr[i];

            } else if (arr[i] > smax && arr[i] != max) {

                tmax = smax;
                smax = arr[i];

            } else if (arr[i] > tmax && arr[i] != smax && arr[i] != max) {

                tmax = arr[i];
            }
        }
		return tmax;
	}

}