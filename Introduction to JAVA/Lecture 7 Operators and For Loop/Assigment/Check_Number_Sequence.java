import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int prev=scan.nextInt();
        int count=2,current;
        boolean isDec=true;
        while(count<=n)
        {
            current=scan.nextInt();
            if(prev==current)
            {
                System.out.println("false");
                return ;
            }
            
            if(current<prev)
            {
                if(!isDec)
                {
                    System.out.println("false");
                	return ;
                }
            }else
            {
                if(isDec)
                	isDec=false;
            }
            prev=current;
            count++;
        }
        System.out.println("true");
	}
}
