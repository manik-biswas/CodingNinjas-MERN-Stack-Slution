
public class Solution {

	public static void leaders(int[] input) {
	int n=input.length;
        for(int i=0;i<n;i++){
            boolean small = true;
            for(int j=i+1;j<input.length;j++){
                if(input[i]<input[j]){
                    small=false;
                    break;
                }
            }
            if(small)
                System.out.print(input[i] + " ");
        }
		
	}
	
}