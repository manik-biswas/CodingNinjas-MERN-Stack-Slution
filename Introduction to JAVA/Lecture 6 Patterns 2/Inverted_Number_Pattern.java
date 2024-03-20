import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(n>=i){
            int j=1;
            while(n-i+1>=j){
                System.out.print(n-i+1);
                j++;
            }
            System.out.println();
            i++;
        }

		
	}

}
