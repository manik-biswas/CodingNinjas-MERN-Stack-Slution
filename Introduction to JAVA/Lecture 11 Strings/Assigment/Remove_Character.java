
public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		String result = new String("");
        for(int i= 0; i<str.length();i++){
            if(str.charAt(i)!=ch){
                result=result+str.charAt(i);
            }
            
        }
        return result;
	}

}