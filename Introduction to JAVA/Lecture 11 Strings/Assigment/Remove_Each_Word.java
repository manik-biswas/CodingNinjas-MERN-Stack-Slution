
public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		String result = "";
		char ch = str.charAt(0);
		result += ch;
		for(int i = 1;i < str.length();i++) {
			if(str.charAt(i) == ch);
			else 
				result += str.charAt(i);
			ch = str.charAt(i);
		}
		return result;

	}

}