import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p=n,z=n;
        for(int i=1; i<=n; i+=1){
            
            for(int j=1; j<=n; j+=1){
                if(j==z){
                    System.out.print("*");
                z--;
                }
                else
                {
                    System.out.print(p);
                    
                }
                p--;
            }
            p=n;
            System.out.println();
        }
	}
}
