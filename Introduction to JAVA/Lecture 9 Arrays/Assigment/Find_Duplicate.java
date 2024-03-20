
public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	int n = arr.length;
        int ans;
        for( int i=0; i<n; i++){
            for( int j=i+1; j<n; j++){
                ans=arr[i]^arr[j];
                if(ans==0)
                return arr[i];
            }
        }
        return 0;
    }
}