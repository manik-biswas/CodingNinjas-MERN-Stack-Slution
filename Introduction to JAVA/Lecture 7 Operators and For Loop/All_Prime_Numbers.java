import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2; n>=i; i+=1){
            if(i==2)
            System.out.println(2);
            for(int j=2; i>j; j+=1){
                if(i%j==0)
                    break;
                else if(i==j+1)
             System.out.println(i);
            }
        }
		
	}
}
