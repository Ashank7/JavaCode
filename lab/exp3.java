class Student3{
	private String name,section;
	private int rollnumber;
	Student3(String name,String section,int rollnumber){
		this.name = name;
		this.section = section;
		this.rollnumber = rollnumber;
	}
	void Getter() {
		System.out.println("Name of Student is "+name);
		System.out.println("Section of Student is "+section);
		System.out.println("Roll Number of Student is "+rollnumber);
	}
	void Update(String name,String section,int rollnumber) {
		this.name = name;
		this.section = section;
		this.rollnumber = rollnumber;
	}
	void Delete() {
		this.name = null;
		this.section = null;
		this.rollnumber = 0;
	}
	
}
public class exp3{
	public static void main(String [] args) {
		Student3 s1 = new Student3("Aabish", "A1",57);
		s1.Getter();
		s1.Update("Ashank", "A1", 42);
		s1.Getter();
		s1.Delete();
		s1.Getter();
	}
}

