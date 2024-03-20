public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	int n = arr.length;
        int p=0;
        for(int i=0; i<n; i++){
            if(arr[i]==0)
            p++;
        }
        for(int j=0; j<p; j++){
            arr[j]=0;
        }
        for(int j=p; j<n; j++){
            arr[j]=1;
        }
        
    }
}