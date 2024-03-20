import java.util.Scanner;
public class Solution {
	
	public static int sum(int[] arr) {
  int sum=0;
        int n=arr.length;
        for(int i=0; i<n; i+=1){
            sum=sum+arr[i];
        }
        return sum;
        
    }
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i+=1){
            int n= sc.nextInt();
            int arr[] = new int [n];
            
            for(int j=0; j<n; j+=1){
                arr[j]=sc.nextInt();
                System.out.println(sum(arr));
            }
        }

    }
}