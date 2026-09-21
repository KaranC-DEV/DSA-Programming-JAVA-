package array;

public class FindSumOfAllElementsInArray {

	public static void main(String[] args) {
		
		int[] arr= {10,20,30};
		System.out.println("Sum of Array is= "+addElements(arr));
		
	}

	public static int addElements(int[] arr) {
		
		int res=0;
		
		for(int i:arr){
			res+=i;
		}
		
		return res;
		
	}




}
