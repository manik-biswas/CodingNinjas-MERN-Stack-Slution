
public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	int m=arr1.length-1;
        int n=arr2.length-1;
       int i=m;
        int j=n;
       int c=0; 
        int k=output.length-1;;
     
         for(i=m,j=n;i>=0 && j>=0; i--,j--){
         int s=arr1[i]+arr2[j]+c;
         output[k--]=s%10;
         c=s/10;
       
     }   
         for(;i>=0;i--){
           int s=arr1[i]+c;
         output[k--]=s%10;
        
         c=s/10;
          
       } 
         
           for(;j>=0;j--){
           int s=arr2[j]+c;
         output[k--]=s%10;
         
         c=s/10;
          
       } 
        
        output[0]=c;
        
        for(i=0;i<k;i++)
            System.out.print(output[i] + " ");
    }

}