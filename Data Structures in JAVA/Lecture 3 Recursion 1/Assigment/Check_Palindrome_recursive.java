
public class solution {

	public static boolean isStringPalindrome(String input) {
		// Write your code here
	int start =0;
	int end = input.length() - 1;
	return isStringPalindrome(input, start, end);
	}
	public static boolean isStringPalindrome(String input, int start, int end){
	if(start >= end){
		return true;
	}
	if(input.charAt(start) != input.charAt(end)){
		return false;
	}
	return isStringPalindrome(input, start++, end--);
	
	}
}
