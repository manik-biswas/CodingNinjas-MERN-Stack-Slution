import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int s,j=1;
        for(int i=1; i<10000; i+=1){
           s=3*i+2;
            if(s%4!=0){
                System.out.print(s+" ");
                j+=1;
                if(j==p+1){
               
                    break;
                }
                
            }     
        }

	}
}
