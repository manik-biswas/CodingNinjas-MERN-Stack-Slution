
public class Solution {

	public static void printSubstrings(String str) {
		int n = str.length();
		
		if(n ==  0)
		return;

		for(int i = 0; i < n; i++){
			for(int j = i; j < n; j++){
				String str1 = str.substring(i,j+1);
				System.out.println(str1);
			}
		}
	}

}