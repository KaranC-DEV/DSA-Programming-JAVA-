package number;

import java.util.Scanner;

public class FindAutomorphicNumber {

	public static void main(String[] args) {
//		An Automorphic number is a number whose square ends with the same digits as the number itself.
//
//		Example: 25
//
//		25 × 25 = 625
//		625 ends with 25
//		Therefore, 25 is an Automorphic number.

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number:-");
		int num = sc.nextInt();

		if (isAutomorphic(num)) {
			System.out.println("Number " + num + " is a Automorphic number");
		} else {
			System.out.println("Number " + num + " is not a Automorphic number");
		}
	}

	public static boolean isAutomorphic(int num) {
		int temp= num;
		int count=0;
		while(temp!=0) {
			count++;
			temp/=10;
			
		}
		
		int divisor= (int) Math.pow(10, count);
		
		int square= num*num;
		
		
		
		return (square%divisor)==num;
	}

}
