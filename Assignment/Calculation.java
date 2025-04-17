package assignment;

class Calculation{
	float num1,num2;
	void initialize(float a,float b) {
		num1 = a;
		num2 = b;
	}
	void addition() {
		float ans = num1+num2;
		System.out.println("The addition of two numbers is " + ans);
	}
	void subraction() {
		float ans = num1-num2;
		System.out.println("The subtraction of two numbers is " + ans);
	}
	void multiplication() {
		float ans = num1*num2;
		System.out.println("The multiplication of two numbers is " + ans);
	}
	void division() {
		float ans = num1/num2;
		System.out.println("The division of two numbers is " + ans);
		
	}
	public static void main(String [] args) {
		Calculation c =  new Calculation();
		c.initialize(6, 12);
		c.addition();
		c.subraction();
		c.multiplication();
		c.division();
	}
}