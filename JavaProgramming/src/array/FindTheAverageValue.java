package array;

public class FindTheAverageValue {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5,6};
		System.out.println("Average of Array is= "+avgElements(arr));
		
	}

	public static double avgElements(int[] arr) {
		
		int sum=0;
		
		for(int i:arr){
			sum+=i;
		}
		double avg=sum/arr.length;
		return avg;
		
	}




}
