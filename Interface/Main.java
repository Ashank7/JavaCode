package Interface;

interface A {
	static void fun() {
		System.out.println("This is Fun in Interface !!");
	}
	void logic();
}

class B implements A{
	public void logic() {
		System.out.println("This is Logic !!");
	}
}
public class Main{
	public static void main(String [] args) {
		B obj = new B();
		obj.logic();
	}
}