package inheritance;

class Second{
	Second(){
		System.out.println("Class Second");
	}
	Second(int a){
		System.out.println("Hello World");
	}
	void funsecond() {
		System.out.println("Second class Method");
	}
}

class Third extends Second{
	Third(){
		super(10);
	}
	void funthird() {
		System.out.println("Third class Method");
	}
}
public class First{
	public static void main(String [] args) {
		Third obj = new Third();
		obj.funthird();		
	}
}



