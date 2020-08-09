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
	private int complex;
	
	public ComplexNumbers(int real,int complex) {
		this.real= real;
		this.complex= complex;
	}

	private void simplify() {
		int gcd=1;
		int smaller=Math.min(real, complex);
		for(int i = 2;i<=smaller;i++) {
			if(real%i==0 && complex%i==0) {
				gcd=i;
			}
		}
		real=real/gcd;
		complex=complex/gcd;
	}
	public void print() {
		System.out.println(real+" + "+"i"+complex);
	}
	
	public void plus(ComplexNumbers C2) {
		this.real=this.real+C2.real;
		this.complex=this.complex+C2.complex;
	}
	
	public void multiply(ComplexNumbers C2) {
        int var1=this.real;
		this.real=(this.real*C2.real)-(this.complex*C2.complex);
		this.complex=(C2.real*this.complex)+(C2.complex*var1);
       // System.out.println(C2.real + ","+this.complex);
	}

}

	
