
public class solution {

	public static int start = 1;
	public static int multiplyTwoIntegers(int m, int n){
	if(n == 0 || m == 0){
		return 0;
	}
	if(m < start){
		return 0;
	}
	start ++;
	int ans = n + multiplyTwoIntegers(m, n);
	return ans;
	}
}
