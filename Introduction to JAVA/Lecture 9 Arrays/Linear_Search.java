import java.util.Scanner;
public class Solution {

    public static int linearSearch(int arr[], int x) {
		int n=arr.length;
        for(int i=0; i<n; i+=1){
            if(x==arr[i])
                return i;
            
            }
                return -1;
          
        }
        
       public static void main(String [] args) {
          // Solution sl=new Solution();
            
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            for(int i=0; i<t; i+=1){
            int n = s.nextInt();
                int arr[] = new int [n];
                for(int j=0; j<n; j+=1){
                    arr[j] = s.nextInt();
                }
                int x = s.nextInt();
                       
            System.out.println(linearSearch(arr,x));
        }
    }
}