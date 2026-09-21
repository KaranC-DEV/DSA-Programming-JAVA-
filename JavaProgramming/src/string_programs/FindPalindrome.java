package string_programs;

public class FindPalindrome {

	public static void main(String[] args) {
		String s="Mom";
		
//		if (isPalindrome(s)) {
//			System.out.println("palindrome");
//			
//		}
//		else
//			System.out.println("not a Palindrome");
		
		
		System.out.println(isPalindrome(s) ? "Palindrome":"Not Palindrome");
		
	}

	public static boolean isPalindrome(String s) {
		
		
//		String rev= new StringBuffer(s).reverse().toString();
//		
//		return s.equalsIgnoreCase(rev);
	
		int i=0,j=s.length()-1;
		
		while(i>j) {
			
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j++;
		}
	
	   return true;
	
	}

}
