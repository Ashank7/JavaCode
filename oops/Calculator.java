package oops;
import java.util.Scanner;
class Calculator{
	float num1,num2;;
	Calculator(float num1,float num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	void Divide() {
		System.out.println("Division of numbers "+num1/num2);
	}
	void Multiply() {
		System.out.println("Multiplication of numbers "+num1*num2);
	}
	void Addition() {
		System.out.println("Addition of numbers "+num1+num2);
	}
	void Subtraction() {
		System.out.println("Subtraction of numbers "+(num1-num2));
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number :- ");
		float num1 = sc.nextFloat();
		System.out.print("Enter the Second Number :- ");
		float num2 = sc.nextFloat();
		sc.close();
		Calculator c = new Calculator(num1,num2);
		c.Divide();
		c.Multiply();
		c.Addition();
		c.Subtraction();
	}
}