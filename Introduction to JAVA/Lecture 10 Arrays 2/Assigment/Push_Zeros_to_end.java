public class Solution {  

    public static void pushZerosAtEnd(int[] arr) {
    	  int n = arr.length;
        int i=0;
        while(i<n){
            if(arr[i]!=0)
                i++;
                else{
                    for(int j =i+1;j<n;j++){
                        if(arr[j]!=0){
                            int temp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                            i++;
                                
                        }
                    }
                     break;
                }
            continue;
        }
    }

}