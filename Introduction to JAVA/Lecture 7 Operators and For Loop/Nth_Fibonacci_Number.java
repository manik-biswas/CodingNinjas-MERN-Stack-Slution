import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int a=1,b=1,c=1;
        for(int i=1;n-2>=i;i+=1){
            c=a+b;
            a=b;
            b=c;
            
        }
		System.out.print(c+" ");

		
	}

}
