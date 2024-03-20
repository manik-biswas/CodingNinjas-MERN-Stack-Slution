
public class Solution {

	public static String reverseEachWord(String str) {
		String ans="";
          int currentWordStart=0;
          int i=0;
          for(;i<str.length();i++){
              if(str.charAt(i)==' '){
                  int currentWordEnd=i-1;
                  String reversedWord="";
                  for(int j=currentWordStart;j<=currentWordEnd;j++){
                      reversedWord=str.charAt(j)+reversedWord;
                  }
                  ans+=reversedWord+" ";
                  currentWordStart=i+1;
              }
          }
          int currentWordEnd=i-1;
          String reversedWord="";
          for(int j=currentWordStart;j<=currentWordEnd;j++){
              reversedWord=str.charAt(j)+reversedWord;
          }
          ans+=reversedWord;
          return ans;
	}

}