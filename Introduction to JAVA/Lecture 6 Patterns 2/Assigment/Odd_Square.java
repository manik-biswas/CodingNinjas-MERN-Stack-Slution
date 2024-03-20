import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(n>=i){
            int j=1;
            int k=(2*i-1);
            while(n>=j){
                System.out.print(k);
                k=k+2;
                if((2*n-1)<k){
                    k=1;
                }
                j++;
            }
        i++;
            System.out.println();
        }
	}
}
