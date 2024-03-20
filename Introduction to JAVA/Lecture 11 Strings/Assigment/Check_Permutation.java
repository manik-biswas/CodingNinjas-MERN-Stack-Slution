public class Solution{

    public static boolean isPermutation(String str1, String str2){

        int n = str1.length();
        int m = str2.length();
        if(n != m)
        return false;

        StringBuffer str3 = new StringBuffer(str1);
        StringBuffer str4 = new StringBuffer(str2);

        int count = 0;

        for(int i = 0; i < n; i++){

            for(int j = 0; j < m; j++){

                if(str3.charAt(i) == str4.charAt(j)){
                    str4.setCharAt(j,'/');
                    count++;

                }
            }
        }
     
     if(n == count)
     return true;
     else
     return false;
    }
}