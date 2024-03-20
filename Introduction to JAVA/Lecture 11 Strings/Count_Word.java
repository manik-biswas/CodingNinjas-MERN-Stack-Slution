
public class Solution {

	public static int countWords(String str) {	
		int p = 1;
		int n = str.length();
		if(n == 0)
		return 0;
	 	char str2 =' ';
		char str1;
		for(int i = 0; i < n; i++ ){
		    str1 = str.charAt(i);
			if(str1 == str2 )
			p++;
		}
		return p;
	}

}