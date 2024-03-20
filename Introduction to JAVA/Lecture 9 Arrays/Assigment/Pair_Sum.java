public class Solution {  

    public static int pairSum(int arr[], int x) {
    	int n = arr.length;
        int p=0, ans;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                ans=arr[i]+arr[j];
                if(ans==x)
                {
                p++;
                }
            }
        }
        return p;
    }
}