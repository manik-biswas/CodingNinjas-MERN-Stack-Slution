
public class Solution {
			
	public static int lastIndex(int input[], int x){

			int lastIndex = input.length - 1;

			return lastIndex(input, x, lastIndex);
	}		


	public static int lastIndex(int[] input, int x, int indx)
	{
			if(indx < 0)
			{
				return -1;
			}

			if(input[indx] == x)
			{
				return indx;
			}

			return lastIndex(input, x, indx - 1);


	}
}