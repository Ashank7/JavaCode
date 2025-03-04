package oops;

import java.util.Scanner;

public class Area{
	int length,breadth;
	void setDim(int l,int b) {
		length = l;
		breadth = b;
	}
	void getArea() {
		System.out.println("Area of Rectangle =  " + length*breadth);
	}
	public static void main(String [] args) {
		Area a1 = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length of Rectangle :- ");
		int a = sc.nextInt();
		System.out.print("Enter the Breadth of Rectangle :- ");
		int b = sc.nextInt();
		a1.setDim(a, b);
		a1.getArea();
		sc.close();
	}
}
