package number;

import java.util.Scanner;

public class FindSpyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:- ");
		int num = sc.nextInt();
		
		if (isSpyNumber(num)) {
            System.out.println(num + " is an Spy number.");
        } else {
            System.out.println(num + " is not an Spy number.");
        }
		

	}

   public static boolean isSpyNumber(int num) {
	
	   
	   int mul=1;
	   int add=0;
	   int digit=0;
		
		while(num>=1) {
			digit=num%10;
			num=num/10;
			
			mul=mul*digit;
			add= add+digit;
			
			
		}
		
		
			return mul==add;
		
		
	}

	
	
	
	
}
