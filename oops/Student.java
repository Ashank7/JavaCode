/*
 Constructor is a special function.
 It has no return type
 The name of constructor should be same as class name
 We dont need to call the constructor. It will automatically invoke when we will create the object.
 We have two types of constructor. Default constructor and parameterized constructor
 */

package oops;
public class Student{
	int id;
	String name;
	String course;
	String clg_name;
	
	Student (int i,String n,String c,String cl) {
		id = i;
		name = n;
		course = c;
		clg_name = cl;
	}
	void GetData() {
		System.out.println(id+" "+name+" "+course+" "+clg_name );
	}
	public static void main(String [] arg) {
		Student st1 = new Student(1, "Piyush Sambhyal", "LAW", "MIET");
		st1.GetData();
	}
}