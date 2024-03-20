
public class Solution {
	
		
    public static int staircase(int n){
       
   /* Your class should be named Solution.
    * Don't write main() function.
    * Don't read input, it is passed as function argument.
    * Return output and don't print it.
    * Taking input and printing output is handled automatically.
    */
           if (n < 0)
               return 0;
           if (n == 0)
               return 1;
           int op1 = staircase(n - 1);
           int op2 = staircase(n - 2);
           int op3 = staircase(n - 3);
           return op1 + op2 + op3;

   }
   
}