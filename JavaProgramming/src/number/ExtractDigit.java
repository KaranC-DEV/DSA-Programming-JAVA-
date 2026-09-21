package number;

import java.util.Scanner;

public class ExtractDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number:-");
		int num=sc.nextInt();
		
		System.out.println("Extracted of Digits are = ");
		
		digitExtracted(num);

	}

	public static void digitExtracted(int num) {

		int digit=0;
		
		while(num>=1) {
			digit=num%10;
			num=num/10;
			System.out.print(digit+"     ");
		}
	}

}
