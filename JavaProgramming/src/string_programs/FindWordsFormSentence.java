package string_programs;

public class FindWordsFormSentence {

	public static void main(String[] args) {
		
		String s="Hii how are you?";
		print(s);
	}

	public static void print(String s) {
		
		String[] arr=s.split(" ");
		for(String str: arr) {
			System.out.println(str);
		}
		
	}

}
