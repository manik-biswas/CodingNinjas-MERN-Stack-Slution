public class Solution{  

    public static int findUnique(int[] arr){
		int n= arr.length;
    int ans=0;
    for(int i=0; i<n; i++){
    ans=ans^arr[i];
    }
    return ans;
    }
}