import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0,pv=1,r;
        for(int i=1; n>0; i+=1){
            //int pv=1, r;
            r=n%10;
            n=n/10;
            ans=ans+r*pv;
            pv=2*pv;
            // if(n==0)
            //     break;
        }
        System.out.print(ans);
    }
}
