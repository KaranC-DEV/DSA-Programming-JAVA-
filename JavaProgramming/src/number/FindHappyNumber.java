package number;

import java.util.Scanner;

public class FindHappyNumber {

	public static void main(String[] args) {
		
//		Example: 19,130
//		19
//		↓
//		1² + 9² = 1 + 81 = 82
//		↓
//		8² + 2² = 64 + 4 = 68
//		↓
//		6² + 8² = 36 + 64 = 100
//		↓
//		1² + 0² + 0² = 1
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number:-");
		int num = sc.nextInt();

		if (isHappy(num)) {
			System.out.println("Number " + num + " is a Happy number");
		} else {
			System.out.println("Number " + num + " is not a Happy number");
		}
	}

	public static boolean isHappy(int num) {
		int temp = num;
		int count = 0;
		
		while(sum!=1) {
		while (temp != 0) {
			count++;
			temp /= 10;

		}

		temp = num;
		int digit;
		int sum = 0;
		int square;
		while(count!=1) {
		while (temp != 0) {

			digit = temp % 10;
			square= digit*digit;
			count--;
			sum += square;
			temp /= 10;

		}
		count--;
		}

		}
		return sum ==1;
	}

}
