import java.util.Stack;
public class Solution 
{
    public static boolean isBalanced(String expression)
    {
        if(expression.length()%2!=0)
            return false;
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<expression.length();i++)
        {
            if(expression.charAt(i)=='(')
            {
                stk.push('(');
            }
            else if(expression.charAt(i)==')')
            {
                if(stk.isEmpty() || stk.peek()==')')
                {
                    stk.push(')');
                }
                else if(stk.peek()=='(')
                {
                    stk.pop();
                }

            }
        }
            int count=0;
            while(stk.size()!=0){
                char c1=stk.pop();
                char c2=stk.pop(); 

                if(c1==c2)
                {
                    if(c2=='(')
                        c2=')';
                    if(c1==')')
                        c1='(';
                    count++;
                }

                else{
                    c1='(';
                    c2=')';
                    count++;
                    count++;
                }
                }
                return (count == 0);
    }
}