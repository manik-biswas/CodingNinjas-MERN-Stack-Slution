import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r, sum1=0,sum2=0;
        while(n>=1){
           
              r=n%10;
            if(r%2==0){
               sum1=sum1+r;
           } 
            else{
                sum2=sum2+r;
            }
            n=n/10;
        }
		System.out.print(sum1 + " ");
        System.out.println(sum2);

	}
}
