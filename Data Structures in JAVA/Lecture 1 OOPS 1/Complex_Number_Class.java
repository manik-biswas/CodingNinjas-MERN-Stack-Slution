/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/

 public class ComplexNumbers {
    private int real;
    private int imag;

//constructor1
    public ComplexNumbers(int real, int imag){
        this.real=real;
        this.imag=imag;
    }

//adding two complex number
	public void plus(ComplexNumbers c2){
    	this.real=this.real+c2.real;
    	this.imag=this.imag+c2.imag;
	}

//multiplying two comlex number
	public void multiply(ComplexNumbers c2){
    	int xreal =(this.real*c2.real)-(this.imag*c2.imag);
    	this.imag=(this.real*c2.imag)+(this.imag*c2.real);
        this.real = xreal;
	}

//printing the complexnumber
	public void print(){
    	System.out.println(this.real + " + i" + this.imag);
	}
}