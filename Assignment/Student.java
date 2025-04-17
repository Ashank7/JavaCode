package assignment;

class Student{
	int studentid;
	String name,branch,sem;
	void intialize(int s,String n,String b,String ss) {
		studentid = s;
		name = n;
		branch = b;
		sem = ss;
	}
	void Print() {
		System.out.println("Student Id is " + studentid);
		System.out.println("Name of Student is " + name);
		System.out.println("Branch of Student is " + branch);
		System.out.println("Sem of Student is " + sem);
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.intialize(1, "Nashra Nasreen", "CSE AI ML", "4TH SEM");
		s.Print();
	}
}