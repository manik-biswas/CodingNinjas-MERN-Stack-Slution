import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int sum=0;
        while(n>=i){
            int j=1;
            while(i>=j){
               if(j==1){
                   System.out.print(j);
               }
                else{
                    System.out.print("+" +j);
                }
                sum=sum+j;
                j++;
              
                    
            }
            
            System.out.print("=" + sum);
          
            System.out.println();
            i++;
            sum=0;
        }
	}
}
