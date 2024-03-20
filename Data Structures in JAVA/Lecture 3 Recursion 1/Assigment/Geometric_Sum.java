
public class solution {

	public static double findGeometricSum(int k){
		// Write your code here
	if(k == 0){
		return 1;
	}
	double n = Math.pow(2, k);
	double ans = 1/n;
	return ans + findGeometricSum(k - 1);
	}
}
