
public class Solution {
    
    public static int findTriplet(int[] arr, int x) {
    	int n = arr.length;
        int sum, p=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    sum=arr[i]+arr[j]+arr[k];
                    if(sum==x){
                        p++;
                    }
                }
            }
        }
        return p;

    }

}