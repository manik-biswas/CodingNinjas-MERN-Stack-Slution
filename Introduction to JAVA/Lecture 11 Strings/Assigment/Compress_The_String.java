public class Solution {
	public static String getCompressedString(String str) {
		
        
        
        String inputstring="";
        int count=1;
        inputstring+=str.charAt(0);
        int i=1;
        for(;i<str.length();i++){
        if(str.charAt(i)==str.charAt(i-1)){
          count++;
        } 
        else{
            if(count>1){
            inputstring=inputstring+count+str.charAt(i);
            count=1;}
            else{
                inputstring=inputstring+str.charAt(i);
            	count=1;
            }
        }
            
    } 
        if(count>1){
        inputstring+=count;
        }
    return inputstring;
        
    }
}