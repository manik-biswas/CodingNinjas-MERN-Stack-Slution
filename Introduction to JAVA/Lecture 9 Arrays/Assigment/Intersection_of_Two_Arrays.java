
public class Solution{  
      
      public static void intersections(int arr1[], int arr2[]) {
          int n = arr1.length;
          int m = arr2.length;
          int ans;
          for(int i=0; i<n; i++){
              for(int j=0; j<m; j++){
                  ans = arr1[i]^arr2[j];
                  if(ans ==0){
                      System.out.print(arr1[i]+" ");
                      arr2[j]=Integer.MIN_VALUE;
                      break;
                   }
              }
           }
      }
   }
         