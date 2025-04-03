class Student2{
	private String name,section;
	private int rollnumber;
	Student2(String name,String section,int rollnumber){
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
class Course2{
	private String coursename,courseid;
	Course2(String coursename,String courseid){
		this.coursename = coursename;
		this.courseid = courseid;
	}
	void Getter() {
		System.out.println("Course Name is "+coursename);
		System.out.println("Course Id is "+courseid);
	}
}
public class exp2{
	public static void main(String [] args) {
		Student2 s1 = new Student2("Aabish", "A1",57);
		s1.Getter();
		Course2 c1 = new Course2("Java Programing Lab", "COM-411");
		c1.Getter();
	}
}

