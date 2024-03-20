import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(n>=i){
            int j=1;
        while(i-1>=j){
            System.out.print(" ");
            j++;
        }
        j=1;
        while(n>=j){
            System.out.print("*");
            j++;
        }
        System.out.println();
        i++;
        }
	}
}
