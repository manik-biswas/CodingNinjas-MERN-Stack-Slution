
public class Solution {  

    public static void bubbleSort(int[] arr){
    	int n = arr.length;
        for( int i = 0; i < n-1; i++){
            int k=0;
            for( int j = 1; j < n; j++){
                if ( arr[j] < arr[k]){
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
                k++;
            }
        }
    }  

}