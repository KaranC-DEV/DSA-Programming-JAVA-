package number;

import java.util.Scanner;

public class FindArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int temp = num;
        int digits = 0;
        int sum = 0;

       
        while (temp >= 1) {
            digits++;
            temp /= 10;
        }

        temp = num;
      
        while (temp  >=1) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }


        return sum == originalNum;
    }
}
