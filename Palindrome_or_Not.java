package Array;

public class Palindrome_or_Not {
	public boolean isPalindrome(String word) {
		char[] charArray = word.toCharArray();
		int start = 0;
		int end = word.length() - 1;
		while(start < end) {
			if (charArray[start] != charArray[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		Palindrome_or_Not pon = new Palindrome_or_Not();
		//if (pon.isPalindrome("madam")) {
		if (pon.isPalindrome("that")) {
			System.out.println("The String is palindrome !!");
		}
		else {
			System.out.println("The String is not palindrome !!");
		}
	}
}
