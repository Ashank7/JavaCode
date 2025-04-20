class Course6{
	String coursename,courseid;
  Course6(String coursename,String courseid){
    this.coursename = coursename;
    this.courseid = courseid;
  }
	void Getter(String courseid) {
    if(this.courseid == courseid){
		System.out.println("Course Name is "+coursename);
		System.out.println("Course Id is "+courseid);
    }
    else {
    System.out.println("No Course Found with this Id");
    }
	}
  void Delete() {
    this.coursename = null;
    this.courseid = null;
	}
}
public class exp6{
  public static void main(String[] args) {
    Course6 course = new Course6("AI-ML", "COM");
    course.Getter("COM");
    course.Delete();
    course.Getter("COM");
  }
}
