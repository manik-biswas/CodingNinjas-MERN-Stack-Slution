import java.util.Stack;
public class Solution {

	public static int countBracketReversals(String input) {
		//Your code goes here
		if(input.length() % 2 != 0){
			return -1;
		}

		Stack<Character> stk = new Stack<>();
		int count = 0;
		char c1,c2='\0';

	
		 for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='{')
                stk.push(input.charAt(i));
            else if(stk.isEmpty() || stk.peek()=='}')
            {
                if(input.charAt(i)=='}')
                    stk.push(input.charAt(i));
            }
            else if(stk.peek()=='{' && input.charAt(i)=='}')
                stk.pop();
            
            
        }

		
		 if(!stk.isEmpty())
        {
            while(!stk.isEmpty()){
                 c1=stk.pop();
                if(!stk.isEmpty())
                	c2=stk.pop();
                if(c1==c2)
                    count++;
                else
                    count+=2;
            }
           
            
        }
		return count;

	}

}