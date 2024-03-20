import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int n1 = (n+1)/2;
    int n2 = n-n1;
    int i =1;
    while(i<=n1){
        int sp =1;
        while(sp<=(n1-i)){
            System.out.print(" ");
            sp = sp +1;
        }
        int star = 1;
        while(star<=2*i-1){
            System.out.print('*');
            star = star + 1;
        }
        System.out.println();
        i=i+1;
    }
    //2nd part of pattern or 2ndd block
    i = n2;
    while(i>=1){
        int sp2 = 1;
        while(sp2<=(n2-i+1)){
            System.out.print(" ");
            sp2=sp2+1;
        }
        int st = 1;
        while(st<=2*i-1){
            System.out.print('*');
            st=st+1;
        }
        System.out.println();
        i=i-1;
    }
        
        
    }
}