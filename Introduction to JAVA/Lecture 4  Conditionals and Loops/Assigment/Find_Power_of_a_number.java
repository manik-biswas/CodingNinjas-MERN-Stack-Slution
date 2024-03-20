import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int n =sc.nextInt();
        int i=1,pro=1;
        while(n>=i){
            pro=pro*x;
            i++;
        }
         System.out.println(pro);     
    }
}