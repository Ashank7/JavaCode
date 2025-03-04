package oops;
class Add{
	int a,b,c;
	void input(int x,int y) {
		a = x;
		b=y;
		
	}
	void cal() {
		c = a+b;
	}
	void display() {
		System.out.println("a + b : "+c);
	}
}

public class oops_1{
	public static void main(String[] arg) {
		Add obj = new Add();
		obj.input(12,34);
		obj.cal();
		obj.display();
	}
}