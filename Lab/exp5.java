class Course5{
	String coursename,courseid;
  Course5(String coursename,String courseid){
    this.coursename = coursename;
    this.courseid = courseid;
  }
	void Getter() {
		System.out.println("Course Name is "+coursename);
		System.out.println("Course Id is "+courseid);
	}
  void Update(String coursename,String courseid) {
    this.coursename = coursename;
    this.courseid = courseid;
	}
}
public class exp5{
  public static void main(String[] args) {
    Course5 course = new Course5("AI-ML", "COM");
    course.Getter();
    course.Update("ML-AI", "MOC");
    course.Getter();
  }
}
