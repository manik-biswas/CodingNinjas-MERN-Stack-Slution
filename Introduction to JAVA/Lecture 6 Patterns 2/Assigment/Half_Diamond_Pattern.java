import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        
        System.out.println('*');

        while(i<=n){
            int j =1;
            while(j<=i){
                if(j==1){
                    System.out.print('*');
                }
                System.out.print(j);
                j++;
            }
            j=i-1;
            while(j>=1){
                System.out.print(j);
                j--;
            }
            System.out.print('*');
            System.out.println();
            i++;
        }

        i=n-1;
        while(i>=1){
            int j=1;
            while(j<=i){
                if(j==1){
                    System.out.print('*');
                }
                System.out.print(j);
                j++;
            }
            j=i-1;
            while(j>=1){
                System.out.print(j);
                j--;
            }
            System.out.print('*');
            System.out.println();
            i--;
        }
        System.out.println('*');
        }
}