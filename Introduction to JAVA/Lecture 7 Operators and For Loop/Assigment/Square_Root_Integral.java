import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int p;
        for(int i=1; i>0; i+=1){
            p=i*i;
            if(p==n){
                System.out.print(i);
                break;
            }
            else if(p>n){
                System.out.print(i-1);
                break;
            }
        }
		
	}
}
