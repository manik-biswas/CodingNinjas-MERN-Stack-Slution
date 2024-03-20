import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(n>=i){
            int j=1;
            while(n-i>=j){
                System.out.print(" ");
                j++;
            }
            j=1;
            int p=i;
            while(i>=j){
                //int p=i;
                System.out.print(p);
                p++;
                j++;
            }
            j=1;
            while(i-1>=j){
                System.out.print(p-2);
                p--;
                j++;
            }
        System.out.println();
            i++;
        }
		
	}
}
