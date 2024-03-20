
public class Solution {

	public static void wavePrint(int mat[][]){
		
		int n = mat.length;
		if(n == 0)
		return;
		int m = mat[0].length;

		for(int i = 0; i < m; i++){
			if(i % 2 == 0){
				for(int j = 0; j < n; j++){
					System.out.print(mat[j][i]+" ");
				}
			}

			else{
				for(int j = n-1; j >= 0; j--){
					System.out.print(mat[j][i]+" ");
				}
			}
		}
	}

}