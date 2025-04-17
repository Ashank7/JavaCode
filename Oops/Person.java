package oops;

public class Person{
	int newid;
	String newname;
	// Constructor in Java
	Person(int id, String name){
		newid = id;
		newname = name;
	}
	void logic() {
		System.out.println(newid+" "+newname);
	}
	public static void main(String [] arg) {
		Person p1 = new Person(250,"Piyush Paji");
		p1.logic();
	}
}
