import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        
        if(c==1){
          int sum=0;
            for(int i=1; n>=i; i+=1){
                sum=sum+i; 
            }
            System.out.print(sum);
        }
        else if(c==2){
            int pro=1;
            for(int j=1; n>=j; j+=1){
                pro=pro*j;
                
            }
            System.out.print(pro);
        }
        else
            System.out.print("-1");
             
	}
}
 