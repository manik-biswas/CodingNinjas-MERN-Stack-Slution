import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1, t=n;
        while(n>=i){
            int j=1;
            char ch = (char)(t+65-i);
            while(i>=j){
                System.out.print((char)(ch));
                ch++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}