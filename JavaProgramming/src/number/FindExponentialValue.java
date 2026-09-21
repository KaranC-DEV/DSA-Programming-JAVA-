package number;

import java.util.Scanner;

public class FindExponentialValue {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Base");
		int base=sc.nextInt();
		
		System.out.println("Enter the start Power:-");
		int power=sc.nextInt();
		
		int res=power(base,power);
		
		System.out.println("Exponencial value is = "+res);
		
	}

	public static int power(int base,int power) {
		int res=1;
		
		while(power>=1) {
			
			res= res*base;
			
			power--;
		}
		
		
		
		return res;
	}
	
	
}
