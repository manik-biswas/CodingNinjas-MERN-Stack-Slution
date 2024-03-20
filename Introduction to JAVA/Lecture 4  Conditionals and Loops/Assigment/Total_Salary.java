import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bs = sc.nextInt();
        String str = sc.next();
        char grade = str.charAt(0);
        
        double ts;
        double hra=bs*0.2;
        double da=bs*0.5;
        double pf=bs*0.11;
        
        if(grade == 'A'){
            ts = bs+hra+da+1700-pf;
            System.out.print(Math.round(ts));
        }
        else if(grade == 'B'){
            ts = bs+hra+da+1500-pf;
            System.out.print(Math.round(ts));
        }
        else
        {
            ts = bs+hra+da+1300-pf;
            System.out.print(Math.round(ts));
        }
		 
	}
}
