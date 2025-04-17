package oops;
public class Details{
	String name,city;
	int age,pincode;
	Details(String n,int a,String c,int p){
		name = n;
		age = a;
		city = c;
		pincode = p;
	}
	void display() {
		System.out.println(name+" "+age+" "+city+" "+pincode);
	}
	public static void main(String [] arg) {
	Details n1 = new Details("Ashank Gupta",19,"Jammu",180005);
	n1.display();
	}
	
}