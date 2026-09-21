package number;

import java.util.Scanner;

public class FIndHarshadNumber {

	public static void main(String[] args) {

//		A Harshad number (also called a Niven number) is a number that is divisible by the sum of its digits.
//
//		Example: 18
//
//		Sum of digits = 1 + 8 = 9
//		18 % 9 = 0
//		Therefore, 18 is a Harshad number.

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number:-");
		int num = sc.nextInt();

		if (isHarshad(num)) {
			System.out.println("Number " + num + " is a Harshad number");
		} else {
			System.out.println("Number " + num + " is not a Harshad number");
		}

	}

	public static boolean isHarshad(int num) {
		int temp = num;
		int digit;
		int sum = 0;

		while (temp != 0) {

			digit = temp % 10;
			sum += digit;
			temp = temp / 10;

		}

		return num % sum == 0;
	}

}
