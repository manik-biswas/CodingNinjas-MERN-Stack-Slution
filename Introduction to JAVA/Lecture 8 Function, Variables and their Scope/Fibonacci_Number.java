
public class Solution {
	
	public static boolean checkMember(int n){
				
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
int a=0,b=1,c;
        if (a==n || b==n)
            return true;
        
        while(true){
            c=a+b;
            a=b;
            b=c;
            if(c==n){
                return true;
                //break;
            }
            if(c>n){
                return false;
              //  break;
            }
        }
        
        
	}
	

}
