package string_programs;

public class PrintCharacters {

	public static void main(String[] args) {
		String str="karan";
		print(str);
	}

	public static void print(String str) {
		
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
		for(char ch:str.toCharArray()) {
			System.out.println(ch);
		}
	}

}
