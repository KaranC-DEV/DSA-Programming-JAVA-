package number;

import java.util.Scanner;

public class FindNeonNumber {

	public static void main(String[] args) {

//		A Neon number is a number where the sum of the digits of its square is equal to the original number.
//
//		Example:
//
//		Number = 9
//		Square = 81
//		Sum of digits = 8 + 1 = 9
//		Since the sum equals the original number, 9 is a Neon number.

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number:-");
		int num = sc.nextInt();
		if (isNeon(num)) {
			System.out.println("Number " + num + " is a neon number");
		} else {
			System.out.println("Number " + num + " is not a neon number");
		}

	}

	public static int findSquare(int num) {

		int square = num * num;
		return square;

	}

	public static boolean isNeon(int num) {

		int temp = findSquare(num);
		int digit;
		int sum = 0;
		while (temp != 0) {
			digit = temp % 10;
			sum = sum + digit;
			temp = temp / 10;

		}

		return num == sum;

	}

}
