
public class Solution {

	public static void findLargest(int mat[][]){
		
int n = mat.length;
int m = mat[0].length;
if(n == 0 || m == 0)
return;
int largest1 = Integer.MIN_VALUE;
int temp1 = Integer.MIN_VALUE;;

for(int i = 0; i < n; i++){
	int sum1 = 0;
	for(int j = 0; j < m; j++){
		 sum1 = sum1 + mat[i][j];
	}
	if(sum1 > largest1){
		largest1 = sum1;
		 temp1 = i;
	}
}

int largest2 = Integer.MIN_VALUE;
int temp2 = Integer.MIN_VALUE;;
for(int i = 0; i < m; i++){
	int sum2 = 0;
	for(int j = 0; j < n; j++){
		 sum2 = sum2 + mat[i][j];
	}
	if(sum2 > largest2){
		largest2 = sum2;
		 temp2 = i;
	}
}
if(largest1 >= largest2){
	System.out.println("row " + temp1+" " + largest1);
}
else
System.out.println("colum " + temp2+" " + largest2);

	}

} 