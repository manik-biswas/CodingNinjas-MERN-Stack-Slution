public class Solution {  

    public static int secondLargestElement(int[] arr) {
     int n=arr.length;
    	 int L=Integer.MIN_VALUE;
        int SL=Integer.MIN_VALUE;
        
        if(n<=1)
            return -2147483648;
      int issame=arr[0];
        int count=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]==issame)
             count++;
        }
        if(count==n)
            return -2147483648;
       
       for(int i=0;i<n;i++)
        {  if(arr[i]>L)
        { L=arr[i];
         
        }
         }  
        
        for(int i=0;i<n ;i++)
        {   
            if(arr[i]==L)
                continue;
           if(arr[i]>SL)
               SL=arr[i];
        }
        return SL;
    }

}