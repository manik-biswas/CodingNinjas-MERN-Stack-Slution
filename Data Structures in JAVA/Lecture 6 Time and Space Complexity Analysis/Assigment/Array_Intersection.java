public class Solution{	
	public static void intersection(int[] arr2, int[] arr1){
	
        for(int i =0;i<arr1.length;i++){
            for(int j=0;j<arr1.length-1-i;j++){
                if(arr1[j]>arr1[j+1]){
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }

        for(int i=0;i<arr1.length;i++)
        {   
         
                  for(int j=0;j<arr2.length;j++)
                    {
                      if(arr1[i]==arr2[j]){
                      System.out.print(arr1[i]+" ");
                       arr2[j]=Integer.MIN_VALUE;
                       break;  
                      }
                    }
        }	
	}
}