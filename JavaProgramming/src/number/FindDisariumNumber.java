package number;

import java.util.Scanner;

public class FindDisariumNumber {

	public static void main(String[] args) {

//		A Disarium number is a number where the sum of its digits powered by their respective positions is equal to the original number.
//
//		For example, 135:
//
//		1¹ + 3² + 5³
//		= 1 + 9 + 125
//		= 135

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number:-");
		int num = sc.nextInt();

		if (isDisarium(num)) {
			System.out.println("Number " + num + " is a Disarium number");
		} else {
			System.out.println("Number " + num + " is not a Disarium number");
		}
	}

	public static boolean isDisarium(int num) {
		int temp = num;
		int count = 0;
		while (temp != 0) {
			count++;
			temp /= 10;

		}

		temp = num;
		int digit;
		int sum = 0;
		while (temp != 0) {

			digit = temp % 10;
			int pow = (int) Math.pow(digit, count);
			count--;
			sum += pow;
			temp /= 10;

		}

		return sum == num;
	}

}
