import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=2;
        while(n>i){
            if(n%i==0)
                System.out.print(i +" ");
            i++;
        }
    }
}