import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans=0, pv=1, r;
        for(int i=0; n>0; i+=1){
            r=n%2;
            n=n/2;
            ans=ans+pv*r;
            pv=pv*10;
            
        }
        System.out.print(ans);
	}
    
}
