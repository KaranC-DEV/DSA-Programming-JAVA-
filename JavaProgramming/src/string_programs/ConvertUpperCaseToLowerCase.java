package string_programs;

public class ConvertUpperCaseToLowerCase {

	public static void main(String[] args) {
		String s="ABCD";
		System.out.println(convertLowercase(s));
	}

	public static String convertLowercase(String s) {
	     
		
		String res="";
		
		for(char ch:s.toCharArray()) {
			
			res+=(char)(ch+32);
		}
		
		
		return res;
	}

}
