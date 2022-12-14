import java.util.stream.IntStream;

public class Palindrome {
	public static boolean isPalindrome(String word) {
		String s=word.toLowerCase();
		return IntStream.range(0, s.length()/2).noneMatch(i->s.charAt(i)!=
				s.charAt(s.length()-i-1));
		
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("abab"));

	}

}
