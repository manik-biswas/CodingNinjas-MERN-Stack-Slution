import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(n>=i){
            int j=1, t=i;
            while(i>=j){
                System.out.print(t);
                t--;
                j++;
            }
            System.out.println();
            i++;
        }
		
		
	}

}

