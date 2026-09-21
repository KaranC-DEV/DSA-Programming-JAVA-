package number;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number:-");
		int num=sc.nextInt();
		
		System.out.println("Factorial of Number is = "+factorial(num));  
	}

	public static int factorial(int num) {
		
		int fact= 1;
		while(num>=1) {
			
			fact=fact*num;
			num--;
		}
		
		return fact;
		
//		for(int i= num; i>=1;i) {
//			
//			fact= fact*i;
//		}
//		 return fact;
	}
	
}
