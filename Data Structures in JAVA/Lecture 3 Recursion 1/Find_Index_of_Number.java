
public class Solution {

	public static int start = 0;
	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if(start >= 0 && start < input.length){
			if(input[start] == x){
				return start;
			}
		}
		else{
			return -1;
		}
		start++;
		int ans = firstIndex(input, x);
		return ans;
	}
	
}