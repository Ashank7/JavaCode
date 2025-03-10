package overloading;


// Object Parent
// String Child

class A {
	static void logic() {
		System.out.println("This is A class Fun !!");
	}
}

class B extends A{
	static void logic() {
		System.out.println("This is B class Logic");
	}
}

public class demo{
	public static void main(String [] args) {
		A obj = new B();
		B obj1 = new B();
		obj.logic();
		obj1.logic();
		A obj2 = new B();
		obj2.logic();
       
	}
}