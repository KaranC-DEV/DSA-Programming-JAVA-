package string_programs;

public class FindcountVowelAndConsonant {

	public static void main(String[] args) {
		
		String s= "Hello";
		s.toLowerCase();
		findCount(s);

	}

	public static void findCount(String s) {
//		String s1="aeiou";
		
		int vowel=0;
		int con=0;
//			
//        for (int i = 0; i < s.length(); i++) {
//
//		 char ch = s.charAt(i);
//
//         if (s1.contains(String.valueOf(ch))) {
//             vowel++;
//         } else {
//             con++;
//         }
//     }
		for(char ch:s.toCharArray()) {
		if(isVowel(ch))
			vowel++;
		else con++;
		}
		
     System.out.println("Vowels: " + vowel);
     System.out.println("Consonants: " + con);
	}

	public static boolean isVowel(char ch) {
		
		return ch=='a' || ch=='e'|| ch== 'i' || ch=='o' || ch=='u';
	}
	
	
}
