public class Solution {
    public static int s=0, i=0;

	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        if(i>=0 && i<input.length)
        {
            s=s+input[i];
            i++;
            sum(input);
        }
         
		return s;
	}
}