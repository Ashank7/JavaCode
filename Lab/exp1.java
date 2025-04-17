class Student{
	String name,section;
	int rollnumber;
	void Setter(String name,String section,int rollnumber) {
		this.name = name;
		this.section = section;
		this.rollnumber = rollnumber;
	}
	void Getter() {
		System.out.println("Name of Student is "+name);
		System.out.println("Section of Student is "+section);
		System.out.println("Roll Number of Student is "+rollnumber);
	}
}
class Course{
	String coursename,courseid;
	void Setter(String coursename,String courseid) {
		this.coursename = coursename;
		this.courseid = courseid;
	}
	void Getter() {
		System.out.println("Course Name is "+coursename);
		System.out.println("Course Id is "+courseid);
	}
}
public class exp1{
	public static void main(String [] args) {
		Student s1 = new Student();
		s1.Setter("Aabish", "A1",57);
		s1.Getter();
		Course c1 = new Course();
		c1.Setter("Java Programing Lab", "COM-411");
		c1.Getter();
	}
}

