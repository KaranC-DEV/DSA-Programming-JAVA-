package number;

import java.util.Scanner;

public class FindDuckNumber {

	public static void main(String[] args) {
		
//		A Duck number is a number that contains at least one 0 in it, but the 0 should not be the first digit.
//
//		Examples:
//
//		102 → Duck number ✅
//		400 → Duck number ✅
//		0200 → Duck number ❌
//		123 → Not a Duck number ❌
//		0123 → Not considered a Duck number ❌
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number:-");
		int num = sc.nextInt();
		System.out.println(" Number:- "+num);

		if (isDuck(num)) {
			System.out.println("Number " + num + " is a Duck number");
		} else {
			System.out.println("Number " + num + " is not a Duck number");
		}
	}

	public static boolean isDuck(int num) {
		int temp = num;
		int count = 0;
		while (temp != 0) {
			count++;
			temp /= 10;

		}

		temp = num;
		int digit;
		
		while (temp != 0) {

			digit = temp % 10;
			
			if (count!=0) {
				if(digit==0)
					return true;
			} else if(count==0) {
				if(digit!=0)
					return false;
			}
		
			
			count--;
			temp/=10;
			

		}

		return false;
			}

}
