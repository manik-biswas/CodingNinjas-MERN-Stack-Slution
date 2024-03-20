public class Solution {
	public static String removeConsecutiveDuplicates(String input) {
		if(input.length() == 1)
			return input;
		String get = removeConsecutiveDuplicates(input.substring(1));
		String ch = input.charAt(0) == get.charAt(0) ? "" : input.charAt(0) + "";
		String out = ch + get;
		return out;
	}
}