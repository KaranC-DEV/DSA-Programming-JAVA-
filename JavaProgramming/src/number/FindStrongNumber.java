package number;

import java.util.Scanner;

public class FindStrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number:-");
		int num=sc.nextInt();
		
		isStrong(num);
	}

	public static void isStrong(int num) {
		
		int temp= num;
		int digit=0;
		int res=0;
		
		while(num>=1) {
			digit=num%10;
			int fact=1;
			while(digit>=1) {
				
				fact=fact*digit;
				digit--;
				
			}
			
			res=res+fact; 
			num=num/10;
			  
			
		}
	
	  	
	if(temp==res)
	{
		System.out.println("Number "+temp+" is a Strong Number");
		
	}
	else
		System.out.println("Number "+temp+" is not a Strong Number");
	
	}		

}
