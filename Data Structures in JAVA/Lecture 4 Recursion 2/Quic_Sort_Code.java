//To apply the method explained in the hint video, we have to add two more parameters in the function call. This can be done by calling a helper function from given function. The helper function can have three parameters: array, start index, end index.  
	
	//Skeleton code to achieve this:
	public class Solution {
        
        public static void quickSort(int[] input) {
          /* Your class should be named Solution
           * Don't write main().
           * Don't read input, it is passed as function argument.
           * No need to print or return the output.
           * Taking input and printing output is handled automatically.
           */
          quickSort(input,0,input.length - 1);
      }
      
      private static void quickSort(int a[], int si, int ei){
          if(si >= ei){
              return;
          }
          
          int pivotIndex = partition(a,si,ei);
          quickSort(a,si,pivotIndex-1);
          quickSort(a,pivotIndex+1,ei);
      }
    
      
      
          public static int partition(int input[], int startIndex, int endIndex) {
              // your code goes here
              
              int pivotElement=input[startIndex];
          int smallerNumCount=0;
          for(int i=startIndex+1;i<=endIndex;i++){
              if(input[i]<pivotElement){
                  smallerNumCount++;
              }
          }
          int temp=input[startIndex+smallerNumCount];
          input[startIndex+smallerNumCount]=pivotElement;
          input[startIndex]=temp;
          int i=startIndex;
          int j=endIndex;
          while(i<j){
              if(input[i]<pivotElement){
                  i++;
              }else if(input[j]>=pivotElement){
                  j--;
              }else{
                   temp=input[i];
                  input[i]=input[j];
                  input[j]=temp;
                  i++;
                  j--;
              }
          }
           return startIndex+smallerNumCount;
              
          }
      }