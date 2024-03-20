
public class Solution {  

    public static void rotate(int[] arr, int d) {
    	 int r=1;
        int n=arr.length;
        int k=0;
        int temp[]=new int[n];
        for(int i=d;i<n;i++){
            temp[k]=arr[i];
            k++;
        }
        for(int j=0;j<d;j++){
            temp[k]=arr[j];
            k++;
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }

}