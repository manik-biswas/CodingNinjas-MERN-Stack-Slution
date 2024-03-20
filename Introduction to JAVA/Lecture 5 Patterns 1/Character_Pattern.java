import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(n>=i){
            int j=1;
            char ch=(char)('A'+i-1);
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
