
public class Solution {

	public static void rowWiseSum(int[][] mat) {
		int n = mat.length;
		if(n==0)
		return;
		int m = mat[0].length;
		int ans = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				ans += mat[i][j];
			}
			System.out.print(ans + " ");
			ans = 0;
		}
	}

}