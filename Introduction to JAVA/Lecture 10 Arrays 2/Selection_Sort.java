
public class Solution {  

    public static void selectionSort(int[] arr) {
    	int n = arr.length;
        for( int i=0; i < n-1; i++){
            int min = arr[i];
            int minIndex = i;
             
             for(int j = i+1; j < n; j++){
                 if(min > arr[j]){
                     min = arr[j];
                     minIndex = j;
                 }
             }
             if(minIndex != i){

                 int temp = arr[i];
                 arr[i]=min;
                 arr[minIndex]=temp;
             }
        }
    }   

}