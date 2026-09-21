package number;

import java.util.Scanner;

public class PrintEvenNumbersFromGivenRange {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the start range");
		int s=sc.nextInt();
		
		System.out.println("Enter the start range");
		int e=sc.nextInt();
		printEvenNumbers(s, e);
		

	}

	public static void printEvenNumbers(int start , int end) {
	
		
		
		for(int i=start;i<=end;i++) {
			
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
		
	}
}
