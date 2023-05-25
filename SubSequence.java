package String;

public class SubSequence {
	public static boolean isSubsequence(String str, String seq) {
		int i = 0; // traverse str "abcde"
		int j = 0; // traverse seq "ace"
		
		while (i < str.length() && j < seq.length()) {
			
		     if(str.charAt(i) == seq.charAt(j)) {
			    
		    	 j++;
		     }
		     i++;
		}
		
		return j == seq.length();
	}

	public static void main(String[] args) {
		System.out.println(isSubsequence("abcde", "ace"));
		System.out.println(isSubsequence("abcde", "aec"));
	}

}
