package number;

import java.util.Scanner;

public class CountTheNumberOfDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number:-");
		int num=sc.nextInt();
		
		System.out.println("Number of Digits are = "+digitCount(num));
		
		

	}

	public static int digitCount(int num) {

		int digit=0;
		int count=0;
		while(num>=1) {
			digit=num%10;
			num=num/10;
			count++;
		}
	return count;
	}

	
}
