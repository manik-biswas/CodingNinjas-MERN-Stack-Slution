
import java.util.Stack; 
public class Solution {

	public static boolean checkRedundantBrackets(String expression) {
		//Your code goes here
		Stack <Character> stk = new Stack<>();
		for(int i = 0; i < expression.length(); i++){
			if(expression.charAt(i) == '('){
				int  count = 0;
				while(expression.charAt(i) == ')'){
					stk.push(expression.charAt(i));
				
					count++;
				}
				if(count < 4){
					return true;
				}
				while(expression.charAt(i) == '('){
					stk.pop();
					count--;
				}
			}
		}
		return false;
	}
}