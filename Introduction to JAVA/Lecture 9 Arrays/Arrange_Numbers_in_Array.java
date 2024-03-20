import java.util.Scanner;
public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	int p=1;
        if(n%2==0){
            for(int i=0; i<n/2; i+=1){
                arr[i] = p;
                p+=2;
            }
            
            p=p-1;
            for(int j=n/2; j<n; j+=1){
                arr[j] = p;
                p-=2;
            }
        }
        else{
            p=1;
            for(int k=0; k<=n/2; k+=1){
                arr[k] = p;
                p+=2;
            }
            p=p-3;
            for(int r=(n/2+1); r<n; r+=1){
                arr[r] = p;
                p-=2;
            }
    
        }
        
    }
    
   public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0; i<t; i+=1){
            int n = s.nextInt();
           int arr[] = new int[n];
            arrange(arr,n);
        }
    }
}