import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        //System.out.println("Enter the input");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch=str.charAt(0);
        
       if(ch>='A' && ch<='Z'){
            System.out.println("1");
         }
        else if(ch>='a' && ch<='z'){
           System.out.println("0");
        }
        else{
        System.out.println("-1");
        }
    }
}