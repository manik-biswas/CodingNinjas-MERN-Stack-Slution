public class Solution {

    public static int arrayRotateCheck(int[] arr){
    	 int n= arr.length;
        if(n<=1)
            return 0;
        for(int i=0;i<n;i++){
            if(arr[i]==1)
                return i;
        }
        return -1;
    }

}