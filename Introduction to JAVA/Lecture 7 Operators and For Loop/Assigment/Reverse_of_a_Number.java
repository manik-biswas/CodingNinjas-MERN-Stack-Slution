import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int p,rev = 0;
        int n = s.nextInt();
        for(int i =1;n>0;i++)
        {
            p=n%10;
            rev = rev*10+p;
            n=n/10;
        }
System.out.println(rev);
	}
}
