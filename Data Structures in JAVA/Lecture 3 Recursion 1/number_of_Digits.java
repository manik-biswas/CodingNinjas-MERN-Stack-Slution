public class Solution {

	public static int count(int n){
		//Write your code here
	if(n < 10){
		return 1;
	}
	int ans = count(n/10);
	return ans + 1;
	}
}
