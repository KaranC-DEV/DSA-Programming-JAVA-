package string_programs;

public class FindLongestWordInSentence {

	public static void main(String[] args) {
		String s="s I am a Java";
		System.out.println(longestWord(s));
	}

	public static String longestWord(String s) {
		
		String[] arr=s.split(" ");
		int max=Integer.MIN_VALUE;
		String res="";
		for(String ch:arr) {
			
			if(ch.length()>max) {
				max=ch.length();
				res=ch;
			}
		}
		
		return res;
	}

}
