
package number;

import java.util.Scanner;

public class FindSecondHalfReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        System.out.println("The New Number is = " + ReverseSecondHalf(num));

        
    }

    public static int ReverseSecondHalf(int num) {

        int originalNum = num;
        int count = 0;

        
        while (num >= 1) {
            num = num / 10;
            count++;
        }

        int newCount = count / 2;

        
        int divisor =  (int) Math.pow(10, count / 2);

        int firstHalf = originalNum / divisor;
        int secondHalf = originalNum % divisor;

        System.out.println("First Half = " + firstHalf);
        System.out.println("Second Half = " + secondHalf);

        
        int rev = 0;
        int temp = secondHalf;

        while (temp != 0) {
            rev = (rev * 10) + (temp % 10);
            temp = temp / 10;
        }

        int reversed = (firstHalf * divisor) + rev;

        return reversed;
    }
}



