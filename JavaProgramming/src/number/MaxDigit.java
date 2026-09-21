package number;

import java.util.Scanner;

public class MaxDigit {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:- ");
		int num = sc.nextInt();
		
		System.out.println("the maximum digit is = "+findMax(num));
		

	}

   public static int findMax(int num) {
	
	   int max=0;
	   
	   int digit=0;
		
		while(num>=1) {
			digit=num%10;
			num=num/10;
			
			
			
			if(max < digit)
				max=digit;
			
		}
		
		return max;
	}

	
	
	
	
}
