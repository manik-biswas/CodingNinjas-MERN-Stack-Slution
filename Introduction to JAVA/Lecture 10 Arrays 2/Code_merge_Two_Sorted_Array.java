
public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
    	 int N=arr1.length;
    int M=arr2.length;
    int[] arr=new int[N+M];
    int i=0;
    int j=0;
    int k=0;
    while(i<N && j<M){
        if(arr1[i]<=arr2[j]){
            arr[k]=arr1[i];
            i++;
            k++;
        }else{
            arr[k]=arr2[j];
            j++;
            k++;
        }
    }
    while(i<N){
        arr[k]=arr1[i];
        i++;
        k++;
    }
    while(j<M){
        arr[k]=arr2[j];
        j++;
        k++;
    }
    return arr;
    }

}